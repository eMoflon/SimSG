package org.simsg.test.gt;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.runners.MethodSorters;
import org.simsg.core.gt.mgt.ModelGraphTransformer;
import org.simsg.core.persistence.PersistenceManager;
import org.simsg.core.persistence.SimplePersistenceManager;
import org.simsg.core.pm.engine.PatternMatchingEngine;
import org.simsg.core.pm.match.IMatch;
import org.simsg.core.pmc.PatternMatchingController;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
abstract class GraphTransformTest {
	
	protected PersistenceManager persistence;
	protected Resource simulationDefinition;
	protected Resource simulationModel;
	protected PatternMatchingEngine engine;
	protected PatternMatchingController pmc;
	
	protected ModelGraphTransformer gt;
	
	protected GraphTransformTest() {
		initPersistence();
	}
	
	protected void initPersistence() {
		persistence = new SimplePersistenceManager();
		persistence.setModelFolderPath(System.getProperty("user.dir")+"//models");
		persistence.init();
	}
	
	abstract protected void initEngine();
	
	abstract protected void initPMC();
	
	@BeforeAll
	void beforeAllTest() throws Exception {
		initEngine();
		initPMC();
		pmc.setEngine(engine);
		simulationDefinition = persistence.loadSimulationDefinition("GraphTransformTest");
		simulationModel = persistence.loadSimulationModel("GraphTransformTest");
		pmc.loadModels(simulationDefinition, simulationModel);
		pmc.initEngine();
		pmc.initController();
		//TODO: .. how to ?
		//gt = new ModelGraphTransformer(pmc.getPatternContainer(), simulationModel, pmc.getEPackageWrapper());
		gt.init();
	}
	
	@AfterAll
	void afterAllTest() throws Exception {
		pmc.discardEngine();
		persistence.unloadSimulationModel("GraphTransformTest");
	}
	
	private void collectMatches(String lhs, String rhs) {
		try {
			pmc.collectMatches(lhs);
		} catch (Exception e) {
			fail(e.getMessage());
		}
		try {
			pmc.collectMatches(rhs);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	private IMatch getLhsAndCheckMatches(String lhs, String rhs, int lhsCount, int rhsCount) {
		Collection<IMatch> lhsMatches = pmc.getMatches(lhs);
		pmc.getMatches(rhs);
		assertEquals(lhsCount, pmc.getMatchCount(lhs), "Number of matches weren't equal!");
		assertEquals(rhsCount, pmc.getMatchCount(rhs), "Number of matches weren't equal!");
		return lhsMatches.iterator().next();
	}
	
	private IMatch getRhsAndCheckMatches(String lhs, String rhs, int lhsCount, int rhsCount) {
		pmc.getMatches(lhs);
		Collection<IMatch> rhsMatches = pmc.getMatches(rhs);
		assertEquals(lhsCount, pmc.getMatchCount(lhs), "Number of matches weren't equal!");
		assertEquals(rhsCount, pmc.getMatchCount(rhs), "Number of matches weren't equal!");
		return rhsMatches.iterator().next();
	}

	@Test
	void disjuncToBoundTest() {
		final int lhsPre = 660;
		final int lhsPost = 444;
		final int rhsPre = 0;
		final int rhsPost = 1;
		final String lhs = "disjuncToBound_rule_lhs";
		final String rhs = "disjuncToBound_rule_rhs";
		
		collectMatches(lhs, rhs);
		IMatch lhsMatch = getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
		gt.applyRuleToMatch(lhsMatch, lhs);
		
		collectMatches(lhs, rhs);
		IMatch rhsMatch = getRhsAndCheckMatches(lhs, rhs, lhsPost, rhsPost);
		gt.applyRuleToMatch(rhsMatch, rhs);
		
		collectMatches(lhs, rhs);
		getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
		
	}
	
	@Test
	void changeStatesTest() {
		final int lhsPre = 5;
		final int lhsPost = 4;
		final int rhsPre = 2;
		final int rhsPost = 3;
		final String lhs = "changeStates_rule_lhs";
		final String rhs = "changeStates_rule_rhs";
		
		collectMatches(lhs, rhs);
		IMatch lhsMatch = getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
		gt.applyRuleToMatch(lhsMatch, lhs);
		
		collectMatches(lhs, rhs);
		IMatch rhsMatch = getRhsAndCheckMatches(lhs, rhs, lhsPost, rhsPost);
		gt.applyRuleToMatch(rhsMatch, rhs);
		
		collectMatches(lhs, rhs);
		getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
	}

	@Test
	void breakUpWithStates() {
		final int lhsPre = 2;
		final int lhsPost = 1;
		final int rhsPre = 0;
		final int rhsPost = 4;
		final String lhs = "breakUpWithStates_rule_lhs";
		final String rhs = "breakUpWithStates_rule_rhs";
		
		collectMatches(lhs, rhs);
		IMatch lhsMatch = getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
		gt.applyRuleToMatch(lhsMatch, lhs);
		
		collectMatches(lhs, rhs);
		IMatch rhsMatch = getRhsAndCheckMatches(lhs, rhs, lhsPost, rhsPost);
		gt.applyRuleToMatch(rhsMatch, rhs);
		
		collectMatches(lhs, rhs);
		getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
	}
	
	@Test
	void bindAndChangeStates() {
		final int lhsPre = 45;
		final int lhsPost = 16;
		final int rhsPre = 0;
		final int rhsPost = 1;
		final String lhs = "bindAndChangeStates_rule_lhs";
		final String rhs = "bindAndChangeStates_rule_rhs";
		
		collectMatches(lhs, rhs);
		IMatch lhsMatch = getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
		gt.applyRuleToMatch(lhsMatch, lhs);
		
		collectMatches(lhs, rhs);
		IMatch rhsMatch = getRhsAndCheckMatches(lhs, rhs, lhsPost, rhsPost);
		gt.applyRuleToMatch(rhsMatch, rhs);
		
		collectMatches(lhs, rhs);
		getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
	}
	
	@Test
	void createAndDestroy() {
		final int lhsPre = 12;
		final int lhsPost = 11;
		final int rhsPre = 0;
		final int rhsPost = 1;
		final String lhs = "createAndDestroy_rule_lhs";
		final String rhs = "createAndDestroy_rule_rhs";
		
		collectMatches(lhs, rhs);
		IMatch lhsMatch = getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
		gt.applyRuleToMatch(lhsMatch, lhs);
		
		collectMatches(lhs, rhs);
		IMatch rhsMatch = getRhsAndCheckMatches(lhs, rhs, lhsPost, rhsPost);
		gt.applyRuleToMatch(rhsMatch, rhs);
		
		collectMatches(lhs, rhs);
		getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
		
	}
	
	@Test
	void createAndDestroyFullVoid() {
		final int lhsPre = 72;
		final int lhsPost = 55;
		final int rhsPre = 1;
		final int rhsPost = 1;
		final String lhs = "createAndDestroyFullVoid_rule_lhs";
		final String rhs = "createAndDestroyFullVoid_rule_rhs";
		
		collectMatches(lhs, rhs);
		IMatch lhsMatch = getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
		gt.applyRuleToMatch(lhsMatch, lhs);
		
		collectMatches(lhs, rhs);
		IMatch rhsMatch = getRhsAndCheckMatches(lhs, rhs, lhsPost, rhsPost);
		gt.applyRuleToMatch(rhsMatch, rhs);
		
		collectMatches(lhs, rhs);
		getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
		
	}
	
	@Test
	void createAndDestroyFullVoidInjectivity() {
		final int lhsPre = 12;
		final int lhsPost = 2;
		final int rhsPre = 1;
		final int rhsPost = 1;
		final String lhs = "createAndDestroyFullVoidInjectivity_rule_lhs";
		final String rhs = "createAndDestroyFullVoidInjectivity_rule_rhs";
		
		collectMatches(lhs, rhs);
		IMatch lhsMatch = getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
		gt.applyRuleToMatch(lhsMatch, lhs);
		
		collectMatches(lhs, rhs);
		IMatch rhsMatch = getRhsAndCheckMatches(lhs, rhs, lhsPost, rhsPost);
		gt.applyRuleToMatch(rhsMatch, rhs);
		
		collectMatches(lhs, rhs);
		getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
		
	}
	
	@Test
	void createAndDestroyFullVoidInjectivity2() {
		final int lhsPre = 960;
		final int lhsPost = 48;
		final int rhsPre = 1;
		final int rhsPost = 1;
		final String lhs = "createAndDestroyFullVoidInjectivity2_rule_lhs";
		final String rhs = "createAndDestroyFullVoidInjectivity2_rule_rhs";
		
		collectMatches(lhs, rhs);
		IMatch lhsMatch = getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
		gt.applyRuleToMatch(lhsMatch, lhs);
		
		collectMatches(lhs, rhs);
		IMatch rhsMatch = getRhsAndCheckMatches(lhs, rhs, lhsPost, rhsPost);
		gt.applyRuleToMatch(rhsMatch, rhs);
		
		collectMatches(lhs, rhs);
		getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
		
	}
	
	@Test
	void manyEdgeBoundToDisjunct() {
		final int lhsPre = 3;
		final int lhsPost = 2;
		final int rhsPre = 0;
		final int rhsPost = 1;
		final String lhs = "manyEdgeBoundToDisjunct_rule_lhs";
		final String rhs = "manyEdgeBoundToDisjunct_rule_rhs";
		
		collectMatches(lhs, rhs);
		IMatch lhsMatch = getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
		gt.applyRuleToMatch(lhsMatch, lhs);
		
		collectMatches(lhs, rhs);
		IMatch rhsMatch = getRhsAndCheckMatches(lhs, rhs, lhsPost, rhsPost);
		gt.applyRuleToMatch(rhsMatch, rhs);
		
		collectMatches(lhs, rhs);
		getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
		
	}

	@Test
	void manyEdgeDisjunctToBound() {
		final int lhsPre = 6;
		final int lhsPost = 2;
		final int rhsPre = 0;
		final int rhsPost = 1;
		final String lhs = "manyEdgeDisjunctToBound_rule_lhs";
		final String rhs = "manyEdgeDisjunctToBound_rule_rhs";
		
		collectMatches(lhs, rhs);
		IMatch lhsMatch = getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
		gt.applyRuleToMatch(lhsMatch, lhs);
		
		collectMatches(lhs, rhs);
		IMatch rhsMatch = getRhsAndCheckMatches(lhs, rhs, lhsPost, rhsPost);
		gt.applyRuleToMatch(rhsMatch, rhs);
		
		collectMatches(lhs, rhs);
		getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
		
	}
	
	@Test
	void manyEdgeTriangle() {
		final int lhsPre = 6;
		final int lhsPost = 4;
		final int rhsPre = 0;
		final int rhsPost = 6;
		final String lhs = "manyEdgeTriangle_rule_lhs";
		final String rhs = "manyEdgeTriangle_rule_rhs";
		
		collectMatches(lhs, rhs);
		IMatch lhsMatch = getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
		gt.applyRuleToMatch(lhsMatch, lhs);
		
		collectMatches(lhs, rhs);
		IMatch rhsMatch = getRhsAndCheckMatches(lhs, rhs, lhsPost, rhsPost);
		gt.applyRuleToMatch(rhsMatch, rhs);
		
		collectMatches(lhs, rhs);
		getLhsAndCheckMatches(lhs, rhs, lhsPre, rhsPre);
		
	}
	
}
