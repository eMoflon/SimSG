/**
 * generated by Xtext 2.12.0
 */
package biochemsimulation.reactionrules.reactionRules.util;

import biochemsimulation.reactionrules.reactionRules.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage
 * @generated
 */
public class ReactionRulesSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ReactionRulesPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReactionRulesSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ReactionRulesPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ReactionRulesPackage.REACTION_RULE_MODEL:
      {
        ReactionRuleModel reactionRuleModel = (ReactionRuleModel)theEObject;
        T result = caseReactionRuleModel(reactionRuleModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.MODEL_URI:
      {
        ModelUri modelUri = (ModelUri)theEObject;
        T result = caseModelUri(modelUri);
        if (result == null) result = caseModelLocation(modelUri);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.MODEL_PATH:
      {
        ModelPath modelPath = (ModelPath)theEObject;
        T result = caseModelPath(modelPath);
        if (result == null) result = caseModelLocation(modelPath);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.MODEL_LOCATION:
      {
        ModelLocation modelLocation = (ModelLocation)theEObject;
        T result = caseModelLocation(modelLocation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.REACTION_CONTAINER:
      {
        ReactionContainer reactionContainer = (ReactionContainer)theEObject;
        T result = caseReactionContainer(reactionContainer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.AGENT_INSTANCE_SITE_STATE:
      {
        AgentInstanceSiteState agentInstanceSiteState = (AgentInstanceSiteState)theEObject;
        T result = caseAgentInstanceSiteState(agentInstanceSiteState);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.AGENT_INSTANCE_LINK_STATE:
      {
        AgentInstanceLinkState agentInstanceLinkState = (AgentInstanceLinkState)theEObject;
        T result = caseAgentInstanceLinkState(agentInstanceLinkState);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.AGENT_INSTANCE:
      {
        AgentInstance agentInstance = (AgentInstance)theEObject;
        T result = caseAgentInstance(agentInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.REACTION_PROPERTY:
      {
        ReactionProperty reactionProperty = (ReactionProperty)theEObject;
        T result = caseReactionProperty(reactionProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.ARITHMETIC_VALUE:
      {
        ArithmeticValue arithmeticValue = (ArithmeticValue)theEObject;
        T result = caseArithmeticValue(arithmeticValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.STATE:
      {
        State state = (State)theEObject;
        T result = caseState(state);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.STATES:
      {
        States states = (States)theEObject;
        T result = caseStates(states);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.SITE:
      {
        Site site = (Site)theEObject;
        T result = caseSite(site);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.SITES:
      {
        Sites sites = (Sites)theEObject;
        T result = caseSites(sites);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.AGENT:
      {
        Agent agent = (Agent)theEObject;
        T result = caseAgent(agent);
        if (result == null) result = caseReactionProperty(agent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.PATTERN_VARIABLE:
      {
        PatternVariable patternVariable = (PatternVariable)theEObject;
        T result = casePatternVariable(patternVariable);
        if (result == null) result = caseVariable(patternVariable);
        if (result == null) result = caseReactionProperty(patternVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.ARITHMETIC_VARIABLE:
      {
        ArithmeticVariable arithmeticVariable = (ArithmeticVariable)theEObject;
        T result = caseArithmeticVariable(arithmeticVariable);
        if (result == null) result = caseVariable(arithmeticVariable);
        if (result == null) result = caseReactionProperty(arithmeticVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = caseReactionProperty(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.LINK_STATE:
      {
        LinkState linkState = (LinkState)theEObject;
        T result = caseLinkState(linkState);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.EXACT_LINK_AGENT:
      {
        ExactLinkAgent exactLinkAgent = (ExactLinkAgent)theEObject;
        T result = caseExactLinkAgent(exactLinkAgent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.EXACT_LINK_SITE:
      {
        ExactLinkSite exactLinkSite = (ExactLinkSite)theEObject;
        T result = caseExactLinkSite(exactLinkSite);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.SITE_STATE:
      {
        SiteState siteState = (SiteState)theEObject;
        T result = caseSiteState(siteState);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.SITE_PATTERN:
      {
        SitePattern sitePattern = (SitePattern)theEObject;
        T result = caseSitePattern(sitePattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.SITE_PATTERNS:
      {
        SitePatterns sitePatterns = (SitePatterns)theEObject;
        T result = caseSitePatterns(sitePatterns);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.AGENT_PATTERN:
      {
        AgentPattern agentPattern = (AgentPattern)theEObject;
        T result = caseAgentPattern(agentPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.PATTERN:
      {
        Pattern pattern = (Pattern)theEObject;
        T result = casePattern(pattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.OBSERVATION:
      {
        Observation observation = (Observation)theEObject;
        T result = caseObservation(observation);
        if (result == null) result = caseReactionProperty(observation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.NUMERIC_FROM_LITERAL:
      {
        NumericFromLiteral numericFromLiteral = (NumericFromLiteral)theEObject;
        T result = caseNumericFromLiteral(numericFromLiteral);
        if (result == null) result = caseNumericAssignment(numericFromLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.NUMERIC_FROM_VARIABLE:
      {
        NumericFromVariable numericFromVariable = (NumericFromVariable)theEObject;
        T result = caseNumericFromVariable(numericFromVariable);
        if (result == null) result = caseNumericAssignment(numericFromVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.NUMERIC_ASSIGNMENT:
      {
        NumericAssignment numericAssignment = (NumericAssignment)theEObject;
        T result = caseNumericAssignment(numericAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.INITIAL:
      {
        Initial initial = (Initial)theEObject;
        T result = caseInitial(initial);
        if (result == null) result = caseReactionProperty(initial);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.ASSIGN_FROM_PATTERN:
      {
        AssignFromPattern assignFromPattern = (AssignFromPattern)theEObject;
        T result = caseAssignFromPattern(assignFromPattern);
        if (result == null) result = casePatternAssignment(assignFromPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.ASSIGN_FROM_VARIABLE:
      {
        AssignFromVariable assignFromVariable = (AssignFromVariable)theEObject;
        T result = caseAssignFromVariable(assignFromVariable);
        if (result == null) result = casePatternAssignment(assignFromVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.PATTERN_ASSIGNMENT:
      {
        PatternAssignment patternAssignment = (PatternAssignment)theEObject;
        T result = casePatternAssignment(patternAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.RULE_VARIABLES:
      {
        RuleVariables ruleVariables = (RuleVariables)theEObject;
        T result = caseRuleVariables(ruleVariables);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.RULE_BODY:
      {
        RuleBody ruleBody = (RuleBody)theEObject;
        T result = caseRuleBody(ruleBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.RULE:
      {
        Rule rule = (Rule)theEObject;
        T result = caseRule(rule);
        if (result == null) result = caseReactionProperty(rule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.SEMI_LINK:
      {
        SemiLink semiLink = (SemiLink)theEObject;
        T result = caseSemiLink(semiLink);
        if (result == null) result = caseLinkState(semiLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.FREE_LINK:
      {
        FreeLink freeLink = (FreeLink)theEObject;
        T result = caseFreeLink(freeLink);
        if (result == null) result = caseLinkState(freeLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.WHAT_EVER:
      {
        WhatEver whatEver = (WhatEver)theEObject;
        T result = caseWhatEver(whatEver);
        if (result == null) result = caseLinkState(whatEver);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.INDEXED_LINK:
      {
        IndexedLink indexedLink = (IndexedLink)theEObject;
        T result = caseIndexedLink(indexedLink);
        if (result == null) result = caseLinkState(indexedLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReactionRulesPackage.EXACT_LINK:
      {
        ExactLink exactLink = (ExactLink)theEObject;
        T result = caseExactLink(exactLink);
        if (result == null) result = caseLinkState(exactLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reaction Rule Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reaction Rule Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReactionRuleModel(ReactionRuleModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Uri</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Uri</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelUri(ModelUri object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Path</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Path</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelPath(ModelPath object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Location</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Location</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelLocation(ModelLocation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reaction Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reaction Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReactionContainer(ReactionContainer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Agent Instance Site State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Agent Instance Site State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAgentInstanceSiteState(AgentInstanceSiteState object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Agent Instance Link State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Agent Instance Link State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAgentInstanceLinkState(AgentInstanceLinkState object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Agent Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Agent Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAgentInstance(AgentInstance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reaction Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reaction Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReactionProperty(ReactionProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arithmetic Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arithmetic Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArithmeticValue(ArithmeticValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseState(State object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>States</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>States</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStates(States object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Site</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Site</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSite(Site object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sites</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sites</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSites(Sites object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Agent</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Agent</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAgent(Agent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pattern Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pattern Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePatternVariable(PatternVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arithmetic Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arithmetic Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArithmeticVariable(ArithmeticVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinkState(LinkState object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exact Link Agent</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exact Link Agent</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExactLinkAgent(ExactLinkAgent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exact Link Site</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exact Link Site</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExactLinkSite(ExactLinkSite object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Site State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Site State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSiteState(SiteState object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Site Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Site Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSitePattern(SitePattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Site Patterns</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Site Patterns</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSitePatterns(SitePatterns object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Agent Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Agent Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAgentPattern(AgentPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePattern(Pattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObservation(Observation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Numeric From Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numeric From Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumericFromLiteral(NumericFromLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Numeric From Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numeric From Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumericFromVariable(NumericFromVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Numeric Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numeric Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumericAssignment(NumericAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Initial</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Initial</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitial(Initial object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assign From Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assign From Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignFromPattern(AssignFromPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assign From Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assign From Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignFromVariable(AssignFromVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pattern Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pattern Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePatternAssignment(PatternAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule Variables</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule Variables</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRuleVariables(RuleVariables object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRuleBody(RuleBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRule(Rule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Semi Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Semi Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSemiLink(SemiLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Free Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Free Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFreeLink(FreeLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>What Ever</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>What Ever</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhatEver(WhatEver object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Indexed Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Indexed Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndexedLink(IndexedLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exact Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exact Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExactLink(ExactLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ReactionRulesSwitch