/**
 * generated by Xtext 2.16.0
 */
package org.simsg.simsgl.simSGL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.simsg.simsgl.simSGL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimSGLFactoryImpl extends EFactoryImpl implements SimSGLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SimSGLFactory init()
  {
    try
    {
      SimSGLFactory theSimSGLFactory = (SimSGLFactory)EPackage.Registry.INSTANCE.getEFactory(SimSGLPackage.eNS_URI);
      if (theSimSGLFactory != null)
      {
        return theSimSGLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SimSGLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimSGLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SimSGLPackage.SIM_SGL_MODEL: return createSimSGLModel();
      case SimSGLPackage.MODEL: return createModel();
      case SimSGLPackage.SIM_SGL_PROPERTY: return createSimSGLProperty();
      case SimSGLPackage.ARITHMETIC_VALUE: return createArithmeticValue();
      case SimSGLPackage.STATE: return createState();
      case SimSGLPackage.STATES: return createStates();
      case SimSGLPackage.SITE: return createSite();
      case SimSGLPackage.SITES: return createSites();
      case SimSGLPackage.AGENT: return createAgent();
      case SimSGLPackage.PATTERN_VARIABLE: return createPatternVariable();
      case SimSGLPackage.ARITHMETIC_VARIABLE: return createArithmeticVariable();
      case SimSGLPackage.VARIABLE: return createVariable();
      case SimSGLPackage.LINK_STATE: return createLinkState();
      case SimSGLPackage.BOUND_ANY_OF_TYPE_LINK_AGENT: return createBoundAnyOfTypeLinkAgent();
      case SimSGLPackage.BOUND_ANY_OF_TYPE_LINK_SITE: return createBoundAnyOfTypeLinkSite();
      case SimSGLPackage.SITE_STATE: return createSiteState();
      case SimSGLPackage.MULTI_LINK_STATE: return createMultiLinkState();
      case SimSGLPackage.SITE_PATTERN: return createSitePattern();
      case SimSGLPackage.SITE_PATTERNS: return createSitePatterns();
      case SimSGLPackage.VALID_AGENT_PATTERN: return createValidAgentPattern();
      case SimSGLPackage.VOID_AGENT_PATTERN: return createVoidAgentPattern();
      case SimSGLPackage.AGENT_PATTERN: return createAgentPattern();
      case SimSGLPackage.PATTERN: return createPattern();
      case SimSGLPackage.OBSERVATION: return createObservation();
      case SimSGLPackage.NUMERIC_FROM_LITERAL: return createNumericFromLiteral();
      case SimSGLPackage.NUMERIC_FROM_VARIABLE: return createNumericFromVariable();
      case SimSGLPackage.NUMERIC_ASSIGNMENT: return createNumericAssignment();
      case SimSGLPackage.INITIAL: return createInitial();
      case SimSGLPackage.ASSIGN_FROM_PATTERN: return createAssignFromPattern();
      case SimSGLPackage.ASSIGN_FROM_VARIABLE: return createAssignFromVariable();
      case SimSGLPackage.PATTERN_ASSIGNMENT: return createPatternAssignment();
      case SimSGLPackage.RULE_VARIABLES: return createRuleVariables();
      case SimSGLPackage.RULE_BODY: return createRuleBody();
      case SimSGLPackage.RULE: return createRule();
      case SimSGLPackage.ITERATIONS: return createIterations();
      case SimSGLPackage.TIME: return createTime();
      case SimSGLPackage.POPULATION: return createPopulation();
      case SimSGLPackage.TERMINATION_CONDITION: return createTerminationCondition();
      case SimSGLPackage.TERMINATE: return createTerminate();
      case SimSGLPackage.SINGLE_SITE: return createSingleSite();
      case SimSGLPackage.MULTI_SITE: return createMultiSite();
      case SimSGLPackage.BOUND_ANY_LINK: return createBoundAnyLink();
      case SimSGLPackage.FREE_LINK: return createFreeLink();
      case SimSGLPackage.INDEXED_FREE_LINK: return createIndexedFreeLink();
      case SimSGLPackage.TYPED_FREE_LINK: return createTypedFreeLink();
      case SimSGLPackage.WHAT_EVER: return createWhatEver();
      case SimSGLPackage.BOUND_LINK: return createBoundLink();
      case SimSGLPackage.MULTI_LINK: return createMultiLink();
      case SimSGLPackage.BOUND_ANY_OF_TYPE_LINK: return createBoundAnyOfTypeLink();
      case SimSGLPackage.SINGLE_SITE_PATTERN: return createSingleSitePattern();
      case SimSGLPackage.MULTI_LINK_SITE_PATTERN: return createMultiLinkSitePattern();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimSGLModel createSimSGLModel()
  {
    SimSGLModelImpl simSGLModel = new SimSGLModelImpl();
    return simSGLModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimSGLProperty createSimSGLProperty()
  {
    SimSGLPropertyImpl simSGLProperty = new SimSGLPropertyImpl();
    return simSGLProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArithmeticValue createArithmeticValue()
  {
    ArithmeticValueImpl arithmeticValue = new ArithmeticValueImpl();
    return arithmeticValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public States createStates()
  {
    StatesImpl states = new StatesImpl();
    return states;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Site createSite()
  {
    SiteImpl site = new SiteImpl();
    return site;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sites createSites()
  {
    SitesImpl sites = new SitesImpl();
    return sites;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Agent createAgent()
  {
    AgentImpl agent = new AgentImpl();
    return agent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternVariable createPatternVariable()
  {
    PatternVariableImpl patternVariable = new PatternVariableImpl();
    return patternVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArithmeticVariable createArithmeticVariable()
  {
    ArithmeticVariableImpl arithmeticVariable = new ArithmeticVariableImpl();
    return arithmeticVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkState createLinkState()
  {
    LinkStateImpl linkState = new LinkStateImpl();
    return linkState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoundAnyOfTypeLinkAgent createBoundAnyOfTypeLinkAgent()
  {
    BoundAnyOfTypeLinkAgentImpl boundAnyOfTypeLinkAgent = new BoundAnyOfTypeLinkAgentImpl();
    return boundAnyOfTypeLinkAgent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoundAnyOfTypeLinkSite createBoundAnyOfTypeLinkSite()
  {
    BoundAnyOfTypeLinkSiteImpl boundAnyOfTypeLinkSite = new BoundAnyOfTypeLinkSiteImpl();
    return boundAnyOfTypeLinkSite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SiteState createSiteState()
  {
    SiteStateImpl siteState = new SiteStateImpl();
    return siteState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiLinkState createMultiLinkState()
  {
    MultiLinkStateImpl multiLinkState = new MultiLinkStateImpl();
    return multiLinkState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SitePattern createSitePattern()
  {
    SitePatternImpl sitePattern = new SitePatternImpl();
    return sitePattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SitePatterns createSitePatterns()
  {
    SitePatternsImpl sitePatterns = new SitePatternsImpl();
    return sitePatterns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValidAgentPattern createValidAgentPattern()
  {
    ValidAgentPatternImpl validAgentPattern = new ValidAgentPatternImpl();
    return validAgentPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VoidAgentPattern createVoidAgentPattern()
  {
    VoidAgentPatternImpl voidAgentPattern = new VoidAgentPatternImpl();
    return voidAgentPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AgentPattern createAgentPattern()
  {
    AgentPatternImpl agentPattern = new AgentPatternImpl();
    return agentPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pattern createPattern()
  {
    PatternImpl pattern = new PatternImpl();
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Observation createObservation()
  {
    ObservationImpl observation = new ObservationImpl();
    return observation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericFromLiteral createNumericFromLiteral()
  {
    NumericFromLiteralImpl numericFromLiteral = new NumericFromLiteralImpl();
    return numericFromLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericFromVariable createNumericFromVariable()
  {
    NumericFromVariableImpl numericFromVariable = new NumericFromVariableImpl();
    return numericFromVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericAssignment createNumericAssignment()
  {
    NumericAssignmentImpl numericAssignment = new NumericAssignmentImpl();
    return numericAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Initial createInitial()
  {
    InitialImpl initial = new InitialImpl();
    return initial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignFromPattern createAssignFromPattern()
  {
    AssignFromPatternImpl assignFromPattern = new AssignFromPatternImpl();
    return assignFromPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignFromVariable createAssignFromVariable()
  {
    AssignFromVariableImpl assignFromVariable = new AssignFromVariableImpl();
    return assignFromVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternAssignment createPatternAssignment()
  {
    PatternAssignmentImpl patternAssignment = new PatternAssignmentImpl();
    return patternAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleVariables createRuleVariables()
  {
    RuleVariablesImpl ruleVariables = new RuleVariablesImpl();
    return ruleVariables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleBody createRuleBody()
  {
    RuleBodyImpl ruleBody = new RuleBodyImpl();
    return ruleBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Iterations createIterations()
  {
    IterationsImpl iterations = new IterationsImpl();
    return iterations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Time createTime()
  {
    TimeImpl time = new TimeImpl();
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Population createPopulation()
  {
    PopulationImpl population = new PopulationImpl();
    return population;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TerminationCondition createTerminationCondition()
  {
    TerminationConditionImpl terminationCondition = new TerminationConditionImpl();
    return terminationCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Terminate createTerminate()
  {
    TerminateImpl terminate = new TerminateImpl();
    return terminate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleSite createSingleSite()
  {
    SingleSiteImpl singleSite = new SingleSiteImpl();
    return singleSite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiSite createMultiSite()
  {
    MultiSiteImpl multiSite = new MultiSiteImpl();
    return multiSite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoundAnyLink createBoundAnyLink()
  {
    BoundAnyLinkImpl boundAnyLink = new BoundAnyLinkImpl();
    return boundAnyLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FreeLink createFreeLink()
  {
    FreeLinkImpl freeLink = new FreeLinkImpl();
    return freeLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndexedFreeLink createIndexedFreeLink()
  {
    IndexedFreeLinkImpl indexedFreeLink = new IndexedFreeLinkImpl();
    return indexedFreeLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedFreeLink createTypedFreeLink()
  {
    TypedFreeLinkImpl typedFreeLink = new TypedFreeLinkImpl();
    return typedFreeLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhatEver createWhatEver()
  {
    WhatEverImpl whatEver = new WhatEverImpl();
    return whatEver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoundLink createBoundLink()
  {
    BoundLinkImpl boundLink = new BoundLinkImpl();
    return boundLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiLink createMultiLink()
  {
    MultiLinkImpl multiLink = new MultiLinkImpl();
    return multiLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoundAnyOfTypeLink createBoundAnyOfTypeLink()
  {
    BoundAnyOfTypeLinkImpl boundAnyOfTypeLink = new BoundAnyOfTypeLinkImpl();
    return boundAnyOfTypeLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleSitePattern createSingleSitePattern()
  {
    SingleSitePatternImpl singleSitePattern = new SingleSitePatternImpl();
    return singleSitePattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiLinkSitePattern createMultiLinkSitePattern()
  {
    MultiLinkSitePatternImpl multiLinkSitePattern = new MultiLinkSitePatternImpl();
    return multiLinkSitePattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimSGLPackage getSimSGLPackage()
  {
    return (SimSGLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SimSGLPackage getPackage()
  {
    return SimSGLPackage.eINSTANCE;
  }

} //SimSGLFactoryImpl