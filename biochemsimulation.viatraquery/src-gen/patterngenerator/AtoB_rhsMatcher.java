/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/patterngenerator/GeneratedQueryTest.vql
 */
package patterngenerator;

import biochemsimulation.reactionrules.reactionRules.AgentInstance;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import patterngenerator.AtoB_rhsMatch;
import patterngenerator.util.AtoB_rhsQuerySpecification;

/**
 * Generated pattern matcher API of the patterngenerator.AtoB_rhs pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link AtoB_rhsMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern AtoB_rhs( A: AgentInstance,  B: AgentInstance) {
 * 	// Agent pattern for instances of agent A
 * 	AgentInstance.agent.name(A, "A");
 * 		// Site patterns for site x attached to instances of agent A 
 * 		AgentInstance.linkStates(A, A_x_ILS);
 * 		AgentInstanceLinkState.site.name(A_x_ILS, "x");
 * 		AgentInstanceLinkState.linkState.linkState(A_x_ILS, A_x_IL);	
 * 		IndexedLink(A_x_IL);
 * 		AgentInstanceLinkState.site(A_x_ILS, A_x_Site);
 * 		AgentInstanceLinkState.attachedSite(A_x_ILS, B_x_Site);
 * 		AgentInstanceLinkState.attachedAgentInstance(A_x_ILS, B);
 * 	
 * 	// Agent pattern for instances of agent B
 * 	AgentInstance.agent.name(B, "B");
 * 		// Site patterns for site x attached to instances of agent B 
 * 		AgentInstance.linkStates(B, B_x_ILS);
 * 		AgentInstanceLinkState.site.name(B_x_ILS, "x");
 * 		AgentInstanceLinkState.linkState.linkState(B_x_ILS, B_x_IL);	
 * 		IndexedLink(B_x_IL);
 * 		AgentInstanceLinkState.site(B_x_ILS, B_x_Site);
 * 		AgentInstanceLinkState.attachedSite(B_x_ILS, A_x_Site);
 * 		AgentInstanceLinkState.attachedAgentInstance(B_x_ILS, A);
 * }
 * </pre></code>
 * 
 * @see AtoB_rhsMatch
 *  @see AtoB_rhsProcessor
 * @see AtoB_rhsQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class AtoB_rhsMatcher extends BaseMatcher<AtoB_rhsMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static AtoB_rhsMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    AtoB_rhsMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (AtoB_rhsMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static AtoB_rhsMatcher create() throws ViatraQueryException {
    return new AtoB_rhsMatcher();
  }
  
  private final static int POSITION_A = 0;
  
  private final static int POSITION_B = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AtoB_rhsMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private AtoB_rhsMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @param pB the fixed value of pattern parameter B, or null if not bound.
   * @return matches represented as a AtoB_rhsMatch object.
   * 
   */
  public Collection<AtoB_rhsMatch> getAllMatches(final AgentInstance pA, final AgentInstance pB) {
    return rawGetAllMatches(new Object[]{pA, pB});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @param pB the fixed value of pattern parameter B, or null if not bound.
   * @return a match represented as a AtoB_rhsMatch object, or null if no match is found.
   * 
   */
  public AtoB_rhsMatch getOneArbitraryMatch(final AgentInstance pA, final AgentInstance pB) {
    return rawGetOneArbitraryMatch(new Object[]{pA, pB});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @param pB the fixed value of pattern parameter B, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final AgentInstance pA, final AgentInstance pB) {
    return rawHasMatch(new Object[]{pA, pB});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @param pB the fixed value of pattern parameter B, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final AgentInstance pA, final AgentInstance pB) {
    return rawCountMatches(new Object[]{pA, pB});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @param pB the fixed value of pattern parameter B, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final AgentInstance pA, final AgentInstance pB, final IMatchProcessor<? super AtoB_rhsMatch> processor) {
    rawForEachMatch(new Object[]{pA, pB}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @param pB the fixed value of pattern parameter B, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final AgentInstance pA, final AgentInstance pB, final IMatchProcessor<? super AtoB_rhsMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pA, pB}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pA the fixed value of pattern parameter A, or null if not bound.
   * @param pB the fixed value of pattern parameter B, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public AtoB_rhsMatch newMatch(final AgentInstance pA, final AgentInstance pB) {
    return AtoB_rhsMatch.newMatch(pA, pB);
  }
  
  /**
   * Retrieve the set of values that occur in matches for A.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<AgentInstance> rawAccumulateAllValuesOfA(final Object[] parameters) {
    Set<AgentInstance> results = new HashSet<AgentInstance>();
    rawAccumulateAllValues(POSITION_A, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for A.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstance> getAllValuesOfA() {
    return rawAccumulateAllValuesOfA(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for A.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstance> getAllValuesOfA(final AtoB_rhsMatch partialMatch) {
    return rawAccumulateAllValuesOfA(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for A.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstance> getAllValuesOfA(final AgentInstance pB) {
    return rawAccumulateAllValuesOfA(new Object[]{
    null, 
    pB
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for B.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<AgentInstance> rawAccumulateAllValuesOfB(final Object[] parameters) {
    Set<AgentInstance> results = new HashSet<AgentInstance>();
    rawAccumulateAllValues(POSITION_B, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for B.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstance> getAllValuesOfB() {
    return rawAccumulateAllValuesOfB(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for B.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstance> getAllValuesOfB(final AtoB_rhsMatch partialMatch) {
    return rawAccumulateAllValuesOfB(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for B.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstance> getAllValuesOfB(final AgentInstance pA) {
    return rawAccumulateAllValuesOfB(new Object[]{
    pA, 
    null
    });
  }
  
  @Override
  protected AtoB_rhsMatch tupleToMatch(final Tuple t) {
    try {
        return AtoB_rhsMatch.newMatch((AgentInstance) t.get(POSITION_A), (AgentInstance) t.get(POSITION_B));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected AtoB_rhsMatch arrayToMatch(final Object[] match) {
    try {
        return AtoB_rhsMatch.newMatch((AgentInstance) match[POSITION_A], (AgentInstance) match[POSITION_B]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected AtoB_rhsMatch arrayToMatchMutable(final Object[] match) {
    try {
        return AtoB_rhsMatch.newMutableMatch((AgentInstance) match[POSITION_A], (AgentInstance) match[POSITION_B]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<AtoB_rhsMatcher> querySpecification() throws ViatraQueryException {
    return AtoB_rhsQuerySpecification.instance();
  }
}