package biochemsimulation.simulation.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.jar.Attributes.Name;
import java.util.stream.Collectors;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.reactionrules.utils.PatternUtils;
import biochemsimulation.simulation.Simulation;
import biochemsimulation.simulation.SimulationConfigurator;
import biochemsimulation.simulation.benchmark.Runtimer;
import biochemsimulation.simulation.matching.IMatch;
import biochemsimulation.simulation.matching.PatternMatchingEngine;
import biochemsimulation.simulation.matching.PatternMatchingEngineEnum;
import biochemsimulation.simulation.matching.PatternMatchingEngineFactory;
import biochemsimulation.simulation.matching.patterns.HybridPattern;
import biochemsimulation.simulation.persistence.PersistenceManager;
import biochemsimulation.simulation.persistence.PersistenceManagerEnum;
import biochemsimulation.simulation.persistence.PersistenceManagerFactory;
import biochemsimulation.simulation.pmc.PatternMatchingController;
import biochemsimulation.simulation.pmc.PatternMatchingControllerEnum;
import biochemsimulation.simulation.pmc.PatternMatchingControllerFactory;
import biochemsimulation.simulation.pmc.GT.ReactionRuleTransformer;

public class Sandbox {

	public static void main(String[] args) {
		/*
		test1();
		test4();
		test6();
		*/
		//test7();
		//test8_kill();
		//benchmark();
		//test4();
		//hybridTest();
		hybridObsTest();
	}

	public static void test1() {
		PersistenceManager pm = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		pm.init();

		pm.availableReactionContainerModels().forEach(x -> System.out.println(x));
		pm.availableReactionRuleModels().forEach(x -> System.out.println(x));

		try {
			ReactionRuleModel model1 = pm.loadReactionRuleModel("test2");
			System.out.println("Loaded reaction rule model: " + model1.getModel().getName());
			ReactionContainer model2 = pm.loadReactionContainerModel("test2");
			System.out.println("Loaded reaction container model: " + model2.getName());

			PatternMatchingEngine engine = PatternMatchingEngineFactory.create(PatternMatchingEngineEnum.ViatraEngine);
			engine.setReactionRules(model1);
			engine.setReactionContainer(model2);
			engine.loadModels();
			engine.initEngine();
			Map<String, Collection<IMatch>> results = engine.getAllMatches();
			System.out.println("Found matches on given Models:");
			for (String key : results.keySet()) {
				System.out.println("Pattern: " + key + ", size: " + results.get(key).size());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void test4() {
		PersistenceManager pm = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		pm.init();
		
		try {
			ReactionRuleModel model1 = pm.loadReactionRuleModel("test3");
			ReactionContainer model2 = pm.loadReactionContainerModel("test3");
			PatternMatchingEngine engine = PatternMatchingEngineFactory.create(PatternMatchingEngineEnum.ViatraEngine);
			engine.setReactionRules(model1);
			engine.setReactionContainer(model2);
			engine.loadModels();
			engine.initEngine();
			Map<String, Collection<IMatch>> matches = engine.getAllMatches();
			matches.forEach((name, m) -> {
				System.out.println("Pattern: "+name+", size: "+m.size());
			});
			engine.disposeEngine();
			org.eclipse.emf.ecore.util.EcoreUtil.delete(model2.getSimAgent().get(1));
			// calling unload leads to saving changes to persistence
			pm.unloadReactionContainerModel("test3");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void test6() {
		PersistenceManager pm = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		pm.init();
		try {
			ReactionRuleModel model1 = pm.loadReactionRuleModel("PatternMatchingTest");
			ReactionContainer model2 = pm.loadReactionContainerModel("PatternMatchingTest");
			PatternMatchingEngine engine = PatternMatchingEngineFactory.create(PatternMatchingEngineEnum.DemoclesEngine);
			engine.setReactionRules(model1);
			engine.setReactionContainer(model2);
			engine.loadModels();
			engine.initEngine();
			Map<String, Collection<IMatch>> matches = engine.getAllMatches();
			matches.forEach((name, m) -> {
				System.out.println("Pattern: "+name+", size: "+m.size());
			});
			engine.disposeEngine();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void test7() {
		SimulationConfigurator simConfig = new SimulationConfigurator();
		simConfig.setModel("Bench_C8Entities_Var2PatternSize");
		simConfig.setSimplePersistence();
		simConfig.setViatraAsEngine();
		simConfig.setSimplePMC();
		//simConfig.setSimpleSimulation();
		simConfig.setStochasticSimulation();
		//simConfig.setPMCDeterministic(true);
		simConfig.setSimpleTerminationCondition(10);
		
		Simulation viatraSim = simConfig.createSimulation();
		
		simConfig.setDemoclesAsEngine();
		
		Simulation democlesSim = simConfig.createSimulation();
		
		viatraSim.initializeClocked();
		viatraSim.runClocked();
		System.out.println(viatraSim.results());
		viatraSim.finish();
		
		democlesSim.initializeClocked();
		democlesSim.runClocked();
		System.out.println(democlesSim.results());
		democlesSim.finish();
		
		System.out.println(Runtimer.getInstance());
		Runtimer.getInstance().toFile();
		
	}
	
	public static void benchmark() {
		PersistenceManager pm = PersistenceManagerFactory.create(PersistenceManagerEnum.NeoEMFPersistence);
		pm.init();
		List<String> models = pm.availableReactionRuleModels().stream().filter(x->x.contains("Bench_konj_Var1000")).collect(Collectors.toList());
		SimulationConfigurator simConfig = new SimulationConfigurator();
		simConfig.setSimplePersistence();
		simConfig.setSimplePMC();
		simConfig.setSimpleSimulation();
		simConfig.setPMCDeterministic(true);
		simConfig.setSimpleTerminationCondition(10);
		/*
		simConfig.setDemoclesAsEngine();
		models.forEach(x-> {
			simConfig.setModel(x);
			Simulation democlesSim = simConfig.createSimulation();
			democlesSim.initializeClocked();
			democlesSim.runClocked();
			System.out.println(democlesSim.results());
			democlesSim.finish();
		});
		*/
		
		simConfig.setViatraAsEngine();
		models.forEach(x-> {
			simConfig.setModel(x);
			Simulation viatraSim = simConfig.createSimulation();
			viatraSim.initializeClocked();
			viatraSim.runClocked();
			System.out.println(viatraSim.results());
			viatraSim.finish();
		});
		
		
		
		Runtimer.getInstance().toFile();
		
	}
	
	public static void test8_kill() {
		PersistenceManager pm = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		pm.init();
		try {
			ReactionRuleModel model1 = pm.loadReactionRuleModel("DemoclesKill1");
			ReactionContainer model2 = pm.loadReactionContainerModel("DemoclesKill1");
			PatternMatchingEngine engine = PatternMatchingEngineFactory.create(PatternMatchingEngineEnum.DemoclesEngine);
			engine.setReactionRules(model1);
			engine.setReactionContainer(model2);
			engine.loadModels();
			Runtimer.getInstance().measure(engine, "init", () -> {
				try {
					engine.initEngine();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			//engine.initEngine();
			System.out.println(Runtimer.getInstance());
			Map<String, Collection<IMatch>> matches = engine.getAllMatches();
			matches.forEach((name, m) -> {
				if(m != null) {
					System.out.println("Pattern: "+name+", size: "+m.size());
				}
				
			});
			
			engine.disposeEngine();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void hybridTest() {
		PersistenceManager pm = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		pm.init();
		
		PatternMatchingController pmc = PatternMatchingControllerFactory
				.create(PatternMatchingControllerEnum.HybridPMC);
		PatternMatchingEngine engine = PatternMatchingEngineFactory
				.create(PatternMatchingEngineEnum.DemoclesEngine);
		pmc.setEngine(engine);
		
		PatternMatchingController pmc2 = createSimplePMC_Democles();
		
		try {
			ReactionRuleModel model1 = pm.loadReactionRuleModel("Bench_C8Entities_Var5PatternSize");
			ReactionContainer model2 = pm.loadReactionContainerModel("Bench_C8Entities_Var5PatternSize");
			/*
			Map<String, biochemsimulation.reactionrules.reactionRules.Pattern> rulePatterns = PatternUtils.getPatterns(model1);
			Map<String, HybridPattern> hybridPatterns = new HashMap<String, HybridPattern>();
			rulePatterns.forEach((name, pattern) -> {
				hybridPatterns.put(name, new HybridPattern(name, pattern));
			});
			hybridPatterns.forEach((name, pattern) -> {
				System.out.println(pattern);
			});
			*/
			
			pmc.loadModels(model1, model2);
			Runtimer.getInstance().measure(pmc, "hybridInitEngine", () -> {
				try {
					pmc.initEngine();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			//pmc.initEngine();
			Runtimer.getInstance().measure(pmc, "hybridInitController", () -> {
				try {
					pmc.initController();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			//pmc.initController();
			Runtimer.getInstance().measure(pmc, "hybridInitCollect", () -> {
				try {
					pmc.collectAllMatches();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			//pmc.collectAllMatches();
			System.out.println(pmc.getMatchCount("destroy_lhs"));
			pmc.discardEngine();
			pm.unloadReactionContainerModel("Bench_C8Entities_Var5PatternSize");
			
			model2 = pm.loadReactionContainerModel("Bench_C8Entities_Var5PatternSize");
			pmc2.loadModels(model1, model2);
			Runtimer.getInstance().measure(pmc2, "simpleInitEngine", () -> {
				try {
					pmc2.initEngine();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			//pmc.initEngine();
			Runtimer.getInstance().measure(pmc2, "simpleInitController", () -> {
				try {
					pmc2.initController();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			//pmc.initController();
			Runtimer.getInstance().measure(pmc2, "simpleInitCollect", () -> {
				try {
					pmc2.collectAllMatches();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			//pmc.collectAllMatches();
			System.out.println(pmc2.getMatchCount("destroy_lhs"));
			pmc2.discardEngine();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Runtimer.getInstance());
	}
	
	public static void hybridGTTest() {
		PersistenceManager pm = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		pm.init();
		
		PatternMatchingController pmc = PatternMatchingControllerFactory
				.create(PatternMatchingControllerEnum.HybridPMC);
		PatternMatchingEngine engine = PatternMatchingEngineFactory
				.create(PatternMatchingEngineEnum.ViatraEngine);
		pmc.setEngine(engine);
		
		
		PatternMatchingController pmc2 = createSimplePMC_Democles();
		
		try {
			ReactionRuleModel model1 = pm.loadReactionRuleModel("GraphTransformTest");
			ReactionContainer model2 = pm.loadReactionContainerModel("GraphTransformTest");
			ReactionRuleTransformer gt = new ReactionRuleTransformer(model1, model2);
			gt.init();
			
			pmc.loadModels(model1, model2);
			pmc.initEngine();
			pmc.initController();
			pmc.collectAllMatches();
			System.out.println(pmc.getMatchCount("bindAndChangeStates_rule_lhs"));
			gt.applyRuleToMatch(pmc.getRandomMatch("bindAndChangeStates_rule_lhs"));
			pmc.collectAllMatches();
			System.out.println(pmc.getMatchCount("bindAndChangeStates_rule_lhs"));
			pmc.discardEngine();
			pm.unloadReactionContainerModel("GraphTransformTest");
			
			/*
			model2 = pm.loadReactionContainerModel("GraphTransformTest");
			gt = new ReactionRuleTransformer(model1, model2);
			gt.init();
			
			pmc2.loadModels(model1, model2);
			pmc2.initEngine();
			pmc2.initController();
			pmc2.collectAllMatches();
			System.out.println(pmc2.getMatchCount("bindAndChangeStates_rule_lhs"));
			gt.applyRuleToMatch(pmc2.getRandomMatch("bindAndChangeStates_rule_lhs"));
			pmc2.collectAllMatches();
			System.out.println(pmc2.getMatchCount("bindAndChangeStates_rule_lhs"));
			
			pmc2.discardEngine();
			*/
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Runtimer.getInstance());
	}
	
	public static void hybridObsTest() {
		PersistenceManager pm = PersistenceManagerFactory.create(PersistenceManagerEnum.SimplePersistence);
		pm.init();
		
		PatternMatchingController pmc = PatternMatchingControllerFactory
				.create(PatternMatchingControllerEnum.SimplePMC);
		PatternMatchingEngine engine = PatternMatchingEngineFactory
				.create(PatternMatchingEngineEnum.ViatraEngine);
		pmc.setEngine(engine);
		
		
		PatternMatchingController pmc2 = createSimplePMC_Democles();
		
		try {
			ReactionRuleModel model1 = pm.loadReactionRuleModel("HybridPatternSandbox");
			ReactionContainer model2 = pm.loadReactionContainerModel("HybridPatternSandbox");
			ReactionRuleTransformer gt = new ReactionRuleTransformer(model1, model2);
			gt.init();
			
			pmc.loadModels(model1, model2);
			pmc.initEngine();
			pmc.initController();
			pmc.collectAllMatches();
			System.out.println(pmc.getMatchCount("r2_lhs"));
			gt.applyRuleToMatch(pmc.getRandomMatch("r2_lhs"));
			pmc.collectAllMatches();
			System.out.println(pmc.getMatchCount("r2_lhs"));
			pmc.discardEngine();
			pm.unloadReactionContainerModel("HybridPatternSandbox");
			
			/*
			model2 = pm.loadReactionContainerModel("GraphTransformTest");
			gt = new ReactionRuleTransformer(model1, model2);
			gt.init();
			
			pmc2.loadModels(model1, model2);
			pmc2.initEngine();
			pmc2.initController();
			pmc2.collectAllMatches();
			System.out.println(pmc2.getMatchCount("bindAndChangeStates_rule_lhs"));
			gt.applyRuleToMatch(pmc2.getRandomMatch("bindAndChangeStates_rule_lhs"));
			pmc2.collectAllMatches();
			System.out.println(pmc2.getMatchCount("bindAndChangeStates_rule_lhs"));
			
			pmc2.discardEngine();
			*/
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Runtimer.getInstance());
	}
	
	public static PatternMatchingController createSimplePMC_Viatra() {
		PatternMatchingController pmc = PatternMatchingControllerFactory
				.create(PatternMatchingControllerEnum.SimplePMC);
		PatternMatchingEngine engine = PatternMatchingEngineFactory
				.create(PatternMatchingEngineEnum.ViatraEngine);
		pmc.setEngine(engine);
		return pmc;
	}
	
	public static PatternMatchingController createSimplePMC_Democles() {
		PatternMatchingController pmc = PatternMatchingControllerFactory
				.create(PatternMatchingControllerEnum.SimplePMC);
		PatternMatchingEngine engine = PatternMatchingEngineFactory
				.create(PatternMatchingEngineEnum.DemoclesEngine);
		pmc.setEngine(engine);
		return pmc;
	}


}
