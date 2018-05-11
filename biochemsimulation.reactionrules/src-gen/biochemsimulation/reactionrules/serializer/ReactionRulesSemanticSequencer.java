/*
 * generated by Xtext 2.12.0
 */
package biochemsimulation.reactionrules.serializer;

import biochemsimulation.reactionrules.reactionRules.Agent;
import biochemsimulation.reactionrules.reactionRules.AgentPattern;
import biochemsimulation.reactionrules.reactionRules.ArithmeticValue;
import biochemsimulation.reactionrules.reactionRules.ArithmeticVariable;
import biochemsimulation.reactionrules.reactionRules.ExactLink;
import biochemsimulation.reactionrules.reactionRules.ExactLinkAgent;
import biochemsimulation.reactionrules.reactionRules.ExactLinkSite;
import biochemsimulation.reactionrules.reactionRules.FreeLink;
import biochemsimulation.reactionrules.reactionRules.Initial;
import biochemsimulation.reactionrules.reactionRules.LimitLink;
import biochemsimulation.reactionrules.reactionRules.LinkState;
import biochemsimulation.reactionrules.reactionRules.Observation;
import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.PatternAssignment;
import biochemsimulation.reactionrules.reactionRules.PatternVariable;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage;
import biochemsimulation.reactionrules.reactionRules.Rule;
import biochemsimulation.reactionrules.reactionRules.RuleBody;
import biochemsimulation.reactionrules.reactionRules.RuleVariables;
import biochemsimulation.reactionrules.reactionRules.SemiLink;
import biochemsimulation.reactionrules.reactionRules.Site;
import biochemsimulation.reactionrules.reactionRules.SitePattern;
import biochemsimulation.reactionrules.reactionRules.SitePatterns;
import biochemsimulation.reactionrules.reactionRules.SiteState;
import biochemsimulation.reactionrules.reactionRules.Sites;
import biochemsimulation.reactionrules.reactionRules.State;
import biochemsimulation.reactionrules.reactionRules.States;
import biochemsimulation.reactionrules.reactionRules.WhatEver;
import biochemsimulation.reactionrules.services.ReactionRulesGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ReactionRulesSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ReactionRulesGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ReactionRulesPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ReactionRulesPackage.AGENT:
				sequence_Agent(context, (Agent) semanticObject); 
				return; 
			case ReactionRulesPackage.AGENT_PATTERN:
				sequence_AgentPattern(context, (AgentPattern) semanticObject); 
				return; 
			case ReactionRulesPackage.ARITHMETIC_VALUE:
				sequence_ArithmeticValue(context, (ArithmeticValue) semanticObject); 
				return; 
			case ReactionRulesPackage.ARITHMETIC_VARIABLE:
				sequence_ArithmeticVariable(context, (ArithmeticVariable) semanticObject); 
				return; 
			case ReactionRulesPackage.EXACT_LINK:
				sequence_ExactLink(context, (ExactLink) semanticObject); 
				return; 
			case ReactionRulesPackage.EXACT_LINK_AGENT:
				sequence_ExactLinkAgent(context, (ExactLinkAgent) semanticObject); 
				return; 
			case ReactionRulesPackage.EXACT_LINK_SITE:
				sequence_ExactLinkSite(context, (ExactLinkSite) semanticObject); 
				return; 
			case ReactionRulesPackage.FREE_LINK:
				sequence_FreeLink(context, (FreeLink) semanticObject); 
				return; 
			case ReactionRulesPackage.INITIAL:
				sequence_Initial(context, (Initial) semanticObject); 
				return; 
			case ReactionRulesPackage.LIMIT_LINK:
				sequence_LimitLink(context, (LimitLink) semanticObject); 
				return; 
			case ReactionRulesPackage.LINK_STATE:
				sequence_LinkState(context, (LinkState) semanticObject); 
				return; 
			case ReactionRulesPackage.OBSERVATION:
				sequence_Observation(context, (Observation) semanticObject); 
				return; 
			case ReactionRulesPackage.PATTERN:
				sequence_Pattern(context, (Pattern) semanticObject); 
				return; 
			case ReactionRulesPackage.PATTERN_ASSIGNMENT:
				if (rule == grammarAccess.getPatternAssignmentRule()) {
					sequence_AssignFromPattern_AssignFromVariable(context, (PatternAssignment) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getAssignFromPatternRule()) {
					sequence_AssignFromPattern(context, (PatternAssignment) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getAssignFromVariableRule()) {
					sequence_AssignFromVariable(context, (PatternAssignment) semanticObject); 
					return; 
				}
				else break;
			case ReactionRulesPackage.PATTERN_VARIABLE:
				sequence_PatternVariable(context, (PatternVariable) semanticObject); 
				return; 
			case ReactionRulesPackage.REACTION_RULE_MODEL:
				sequence_ReactionRuleModel(context, (ReactionRuleModel) semanticObject); 
				return; 
			case ReactionRulesPackage.RULE:
				sequence_Rule(context, (Rule) semanticObject); 
				return; 
			case ReactionRulesPackage.RULE_BODY:
				if (rule == grammarAccess.getBidirectionalRuleRule()) {
					sequence_BidirectionalRule(context, (RuleBody) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getRuleBodyRule()) {
					sequence_BidirectionalRule_UnidirectionalRule(context, (RuleBody) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getUnidirectionalRuleRule()) {
					sequence_UnidirectionalRule(context, (RuleBody) semanticObject); 
					return; 
				}
				else break;
			case ReactionRulesPackage.RULE_VARIABLES:
				sequence_RuleVariables(context, (RuleVariables) semanticObject); 
				return; 
			case ReactionRulesPackage.SEMI_LINK:
				sequence_SemiLink(context, (SemiLink) semanticObject); 
				return; 
			case ReactionRulesPackage.SITE:
				sequence_Site(context, (Site) semanticObject); 
				return; 
			case ReactionRulesPackage.SITE_PATTERN:
				sequence_SitePattern(context, (SitePattern) semanticObject); 
				return; 
			case ReactionRulesPackage.SITE_PATTERNS:
				sequence_SitePatterns(context, (SitePatterns) semanticObject); 
				return; 
			case ReactionRulesPackage.SITE_STATE:
				sequence_SiteState(context, (SiteState) semanticObject); 
				return; 
			case ReactionRulesPackage.SITES:
				sequence_Sites(context, (Sites) semanticObject); 
				return; 
			case ReactionRulesPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case ReactionRulesPackage.STATES:
				sequence_States(context, (States) semanticObject); 
				return; 
			case ReactionRulesPackage.WHAT_EVER:
				sequence_WhatEver(context, (WhatEver) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AgentPattern returns AgentPattern
	 *
	 * Constraint:
	 *     (agent=[Agent|ID] sitePatterns=SitePatterns)
	 */
	protected void sequence_AgentPattern(ISerializationContext context, AgentPattern semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.AGENT_PATTERN__AGENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.AGENT_PATTERN__AGENT));
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.AGENT_PATTERN__SITE_PATTERNS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.AGENT_PATTERN__SITE_PATTERNS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAgentPatternAccess().getAgentAgentIDTerminalRuleCall_1_0_1(), semanticObject.eGet(ReactionRulesPackage.Literals.AGENT_PATTERN__AGENT, false));
		feeder.accept(grammarAccess.getAgentPatternAccess().getSitePatternsSitePatternsParserRuleCall_3_0(), semanticObject.getSitePatterns());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ReactionProperty returns Agent
	 *     Agent returns Agent
	 *
	 * Constraint:
	 *     (name=ID sites=Sites)
	 */
	protected void sequence_Agent(ISerializationContext context, Agent semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.REACTION_PROPERTY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.REACTION_PROPERTY__NAME));
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.AGENT__SITES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.AGENT__SITES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAgentAccess().getSitesSitesParserRuleCall_2_0(), semanticObject.getSites());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ArithmeticValue returns ArithmeticValue
	 *
	 * Constraint:
	 *     value=ArithmeticType
	 */
	protected void sequence_ArithmeticValue(ISerializationContext context, ArithmeticValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.ARITHMETIC_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.ARITHMETIC_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getArithmeticValueAccess().getValueArithmeticTypeParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ReactionProperty returns ArithmeticVariable
	 *     ArithmeticVariable returns ArithmeticVariable
	 *     Variable returns ArithmeticVariable
	 *
	 * Constraint:
	 *     (name=ID value=ArithmeticValue)
	 */
	protected void sequence_ArithmeticVariable(ISerializationContext context, ArithmeticVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.REACTION_PROPERTY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.REACTION_PROPERTY__NAME));
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.ARITHMETIC_VARIABLE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.ARITHMETIC_VARIABLE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getArithmeticVariableAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getArithmeticVariableAccess().getValueArithmeticValueParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PatternAssignment returns PatternAssignment
	 *
	 * Constraint:
	 *     (pattern+=Pattern | patternVar+=[PatternVariable|ID])
	 */
	protected void sequence_AssignFromPattern_AssignFromVariable(ISerializationContext context, PatternAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AssignFromPattern returns PatternAssignment
	 *
	 * Constraint:
	 *     pattern+=Pattern
	 */
	protected void sequence_AssignFromPattern(ISerializationContext context, PatternAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AssignFromVariable returns PatternAssignment
	 *
	 * Constraint:
	 *     patternVar+=[PatternVariable|ID]
	 */
	protected void sequence_AssignFromVariable(ISerializationContext context, PatternAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BidirectionalRule returns RuleBody
	 *
	 * Constraint:
	 *     (lhs=PatternAssignment operator=BI rhs=PatternAssignment variables=RuleVariables)
	 */
	protected void sequence_BidirectionalRule(ISerializationContext context, RuleBody semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.RULE_BODY__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.RULE_BODY__LHS));
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.RULE_BODY__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.RULE_BODY__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.RULE_BODY__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.RULE_BODY__RHS));
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.RULE_BODY__VARIABLES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.RULE_BODY__VARIABLES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBidirectionalRuleAccess().getLhsPatternAssignmentParserRuleCall_0_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getBidirectionalRuleAccess().getOperatorBITerminalRuleCall_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getBidirectionalRuleAccess().getRhsPatternAssignmentParserRuleCall_2_0(), semanticObject.getRhs());
		feeder.accept(grammarAccess.getBidirectionalRuleAccess().getVariablesRuleVariablesParserRuleCall_5_0(), semanticObject.getVariables());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RuleBody returns RuleBody
	 *
	 * Constraint:
	 *     (
	 *         (lhs=PatternAssignment operator=UNI rhs=PatternAssignment variables=RuleVariables) | 
	 *         (lhs=PatternAssignment operator=BI rhs=PatternAssignment variables=RuleVariables)
	 *     )
	 */
	protected void sequence_BidirectionalRule_UnidirectionalRule(ISerializationContext context, RuleBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExactLinkAgent returns ExactLinkAgent
	 *
	 * Constraint:
	 *     agent=[Agent|ID]
	 */
	protected void sequence_ExactLinkAgent(ISerializationContext context, ExactLinkAgent semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.EXACT_LINK_AGENT__AGENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.EXACT_LINK_AGENT__AGENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExactLinkAgentAccess().getAgentAgentIDTerminalRuleCall_1_0_1(), semanticObject.eGet(ReactionRulesPackage.Literals.EXACT_LINK_AGENT__AGENT, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExactLinkSite returns ExactLinkSite
	 *
	 * Constraint:
	 *     site=[Site|ID]
	 */
	protected void sequence_ExactLinkSite(ISerializationContext context, ExactLinkSite semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.EXACT_LINK_SITE__SITE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.EXACT_LINK_SITE__SITE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExactLinkSiteAccess().getSiteSiteIDTerminalRuleCall_1_0_1(), semanticObject.eGet(ReactionRulesPackage.Literals.EXACT_LINK_SITE__SITE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExactLink returns ExactLink
	 *
	 * Constraint:
	 *     (linkAgent=ExactLinkAgent linkSite=ExactLinkSite)
	 */
	protected void sequence_ExactLink(ISerializationContext context, ExactLink semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.EXACT_LINK__LINK_AGENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.EXACT_LINK__LINK_AGENT));
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.EXACT_LINK__LINK_SITE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.EXACT_LINK__LINK_SITE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExactLinkAccess().getLinkAgentExactLinkAgentParserRuleCall_1_0(), semanticObject.getLinkAgent());
		feeder.accept(grammarAccess.getExactLinkAccess().getLinkSiteExactLinkSiteParserRuleCall_3_0(), semanticObject.getLinkSite());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FreeLink returns FreeLink
	 *
	 * Constraint:
	 *     {FreeLink}
	 */
	protected void sequence_FreeLink(ISerializationContext context, FreeLink semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ReactionProperty returns Initial
	 *     Initial returns Initial
	 *
	 * Constraint:
	 *     (name=ID count=UnsignedInteger initialPattern=PatternAssignment)
	 */
	protected void sequence_Initial(ISerializationContext context, Initial semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.REACTION_PROPERTY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.REACTION_PROPERTY__NAME));
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.INITIAL__COUNT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.INITIAL__COUNT));
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.INITIAL__INITIAL_PATTERN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.INITIAL__INITIAL_PATTERN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInitialAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getInitialAccess().getCountUnsignedIntegerParserRuleCall_2_0(), semanticObject.getCount());
		feeder.accept(grammarAccess.getInitialAccess().getInitialPatternPatternAssignmentParserRuleCall_3_0(), semanticObject.getInitialPattern());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LimitLink returns LimitLink
	 *
	 * Constraint:
	 *     state=UnsignedInteger
	 */
	protected void sequence_LimitLink(ISerializationContext context, LimitLink semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.LIMIT_LINK__STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.LIMIT_LINK__STATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLimitLinkAccess().getStateUnsignedIntegerParserRuleCall_1_0(), semanticObject.getState());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LinkState returns LinkState
	 *
	 * Constraint:
	 *     (linkState=SemiLink | linkState=FreeLink | linkState=ExactLink | linkState=LimitLink | linkState=WhatEver)
	 */
	protected void sequence_LinkState(ISerializationContext context, LinkState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ReactionProperty returns Observation
	 *     Observation returns Observation
	 *
	 * Constraint:
	 *     (name=ID observationPattern=PatternAssignment)
	 */
	protected void sequence_Observation(ISerializationContext context, Observation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.REACTION_PROPERTY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.REACTION_PROPERTY__NAME));
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.OBSERVATION__OBSERVATION_PATTERN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.OBSERVATION__OBSERVATION_PATTERN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getObservationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getObservationAccess().getObservationPatternPatternAssignmentParserRuleCall_2_0(), semanticObject.getObservationPattern());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ReactionProperty returns PatternVariable
	 *     PatternVariable returns PatternVariable
	 *     Variable returns PatternVariable
	 *
	 * Constraint:
	 *     (name=ID pattern=Pattern)
	 */
	protected void sequence_PatternVariable(ISerializationContext context, PatternVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.REACTION_PROPERTY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.REACTION_PROPERTY__NAME));
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.PATTERN_VARIABLE__PATTERN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.PATTERN_VARIABLE__PATTERN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPatternVariableAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPatternVariableAccess().getPatternPatternParserRuleCall_3_0(), semanticObject.getPattern());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Pattern returns Pattern
	 *
	 * Constraint:
	 *     (agentPatterns+=AgentPattern agentPatterns+=AgentPattern*)?
	 */
	protected void sequence_Pattern(ISerializationContext context, Pattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ReactionRuleModel returns ReactionRuleModel
	 *
	 * Constraint:
	 *     reactionProperties+=ReactionProperty+
	 */
	protected void sequence_ReactionRuleModel(ISerializationContext context, ReactionRuleModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RuleVariables returns RuleVariables
	 *
	 * Constraint:
	 *     (variables+=[ArithmeticVariable|ID] variables+=[ArithmeticVariable|ID]*)
	 */
	protected void sequence_RuleVariables(ISerializationContext context, RuleVariables semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ReactionProperty returns Rule
	 *     Rule returns Rule
	 *
	 * Constraint:
	 *     (name=ID rule=RuleBody)
	 */
	protected void sequence_Rule(ISerializationContext context, Rule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.REACTION_PROPERTY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.REACTION_PROPERTY__NAME));
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.RULE__RULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.RULE__RULE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRuleAccess().getRuleRuleBodyParserRuleCall_2_0(), semanticObject.getRule());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SemiLink returns SemiLink
	 *
	 * Constraint:
	 *     {SemiLink}
	 */
	protected void sequence_SemiLink(ISerializationContext context, SemiLink semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SitePattern returns SitePattern
	 *
	 * Constraint:
	 *     (site=[Site|ID] state=SiteState? linkState=LinkState?)
	 */
	protected void sequence_SitePattern(ISerializationContext context, SitePattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SitePatterns returns SitePatterns
	 *
	 * Constraint:
	 *     (sitePatterns+=SitePattern sitePatterns+=SitePattern*)?
	 */
	protected void sequence_SitePatterns(ISerializationContext context, SitePatterns semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SiteState returns SiteState
	 *
	 * Constraint:
	 *     state=[State|ID]
	 */
	protected void sequence_SiteState(ISerializationContext context, SiteState semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.SITE_STATE__STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.SITE_STATE__STATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSiteStateAccess().getStateStateIDTerminalRuleCall_1_0_1(), semanticObject.eGet(ReactionRulesPackage.Literals.SITE_STATE__STATE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Site returns Site
	 *
	 * Constraint:
	 *     (name=ID states=States)
	 */
	protected void sequence_Site(ISerializationContext context, Site semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.SITE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.SITE__NAME));
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.SITE__STATES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.SITE__STATES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSiteAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSiteAccess().getStatesStatesParserRuleCall_1_0(), semanticObject.getStates());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Sites returns Sites
	 *
	 * Constraint:
	 *     (sites+=Site sites+=Site*)?
	 */
	protected void sequence_Sites(ISerializationContext context, Sites semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.STATE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.STATE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     States returns States
	 *
	 * Constraint:
	 *     (state+=State state+=State*)?
	 */
	protected void sequence_States(ISerializationContext context, States semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UnidirectionalRule returns RuleBody
	 *
	 * Constraint:
	 *     (lhs=PatternAssignment operator=UNI rhs=PatternAssignment variables=RuleVariables)
	 */
	protected void sequence_UnidirectionalRule(ISerializationContext context, RuleBody semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.RULE_BODY__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.RULE_BODY__LHS));
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.RULE_BODY__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.RULE_BODY__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.RULE_BODY__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.RULE_BODY__RHS));
			if (transientValues.isValueTransient(semanticObject, ReactionRulesPackage.Literals.RULE_BODY__VARIABLES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReactionRulesPackage.Literals.RULE_BODY__VARIABLES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUnidirectionalRuleAccess().getLhsPatternAssignmentParserRuleCall_0_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getUnidirectionalRuleAccess().getOperatorUNITerminalRuleCall_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getUnidirectionalRuleAccess().getRhsPatternAssignmentParserRuleCall_2_0(), semanticObject.getRhs());
		feeder.accept(grammarAccess.getUnidirectionalRuleAccess().getVariablesRuleVariablesParserRuleCall_5_0(), semanticObject.getVariables());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     WhatEver returns WhatEver
	 *
	 * Constraint:
	 *     {WhatEver}
	 */
	protected void sequence_WhatEver(ISerializationContext context, WhatEver semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
