/**
 * generated by Xtext 2.16.0
 */
package org.simsg.simsgl.validation;

import com.google.common.base.Objects;
import java.util.HashSet;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.validation.Check;
import org.simsg.simsgl.simSGL.Agent;
import org.simsg.simsgl.simSGL.AgentPattern;
import org.simsg.simsgl.simSGL.ArithmeticValue;
import org.simsg.simsgl.simSGL.ArithmeticVariable;
import org.simsg.simsgl.simSGL.AssignFromPattern;
import org.simsg.simsgl.simSGL.AssignFromVariable;
import org.simsg.simsgl.simSGL.BoundAnyLink;
import org.simsg.simsgl.simSGL.BoundAnyOfTypeLink;
import org.simsg.simsgl.simSGL.BoundLink;
import org.simsg.simsgl.simSGL.IndexedFreeLink;
import org.simsg.simsgl.simSGL.Initial;
import org.simsg.simsgl.simSGL.LinkState;
import org.simsg.simsgl.simSGL.MultiLinkSitePattern;
import org.simsg.simsgl.simSGL.NumericAssignment;
import org.simsg.simsgl.simSGL.NumericFromLiteral;
import org.simsg.simsgl.simSGL.NumericFromVariable;
import org.simsg.simsgl.simSGL.Observation;
import org.simsg.simsgl.simSGL.Pattern;
import org.simsg.simsgl.simSGL.PatternAssignment;
import org.simsg.simsgl.simSGL.Rule;
import org.simsg.simsgl.simSGL.RuleBody;
import org.simsg.simsgl.simSGL.SimSGLPackage;
import org.simsg.simsgl.simSGL.SingleSite;
import org.simsg.simsgl.simSGL.SingleSitePattern;
import org.simsg.simsgl.simSGL.Site;
import org.simsg.simsgl.simSGL.SitePattern;
import org.simsg.simsgl.simSGL.SiteState;
import org.simsg.simsgl.simSGL.ValidAgentPattern;
import org.simsg.simsgl.simSGL.Variable;
import org.simsg.simsgl.simSGL.VoidAgentPattern;
import org.simsg.simsgl.simSGL.WhatEver;
import org.simsg.simsgl.validation.AbstractSimSGLValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class SimSGLValidator extends AbstractSimSGLValidator {
  @Check
  public void checkAgentIdUnique(final Agent agent) {
    final EObject rootElement = EcoreUtil2.getRootContainer(agent);
    List<Agent> candidates = EcoreUtil2.<Agent>getAllContentsOfType(rootElement, Agent.class);
    int c = 0;
    for (final Agent candidate : candidates) {
      {
        Agent current = ((Agent) candidate);
        boolean _equals = current.getName().equals(agent.getName());
        if (_equals) {
          c++;
        }
        if ((c > 1)) {
          this.error("Agent IDs must be unique.", null);
          c = 1;
        }
      }
    }
  }
  
  @Check
  public void checkVariableIdUnique(final Variable variable) {
    final EObject rootElement = EcoreUtil2.getRootContainer(variable);
    List<Variable> candidates = EcoreUtil2.<Variable>getAllContentsOfType(rootElement, Variable.class);
    int c = 0;
    for (final Variable candidate : candidates) {
      {
        Variable current = ((Variable) candidate);
        boolean _equals = current.getName().equals(variable.getName());
        if (_equals) {
          c++;
        }
        if ((c > 1)) {
          this.error("Variable IDs must be unique.", null);
          c = 1;
        }
      }
    }
  }
  
  @Check
  public boolean checkArithmeticVariableFormat(final ArithmeticVariable aVar) {
    boolean _contains = aVar.getValue().getValue().contains(" ");
    if (_contains) {
      this.error("Arithmetic variables may not contain any whitespaces!", null);
      return false;
    }
    return true;
  }
  
  @Check
  public void checkInitialIdUnique(final Initial initial) {
    final EObject rootElement = EcoreUtil2.getRootContainer(initial);
    List<Initial> candidates = EcoreUtil2.<Initial>getAllContentsOfType(rootElement, Initial.class);
    int c = 0;
    for (final Initial candidate : candidates) {
      {
        Initial current = ((Initial) candidate);
        boolean _equals = current.getName().equals(initial.getName());
        if (_equals) {
          c++;
        }
        if ((c > 1)) {
          this.error("Initial IDs must be unique.", null);
          c = 1;
        }
      }
    }
  }
  
  @Check
  public void checkInitialCountInteger(final Initial initial) {
    final NumericAssignment countVar = initial.getCount();
    ArithmeticValue arithVal = ((ArithmeticValue) null);
    if ((countVar instanceof NumericFromVariable)) {
      final NumericFromVariable numVar = ((NumericFromVariable) countVar);
      arithVal = numVar.getValueVar().getValue();
    } else {
      final NumericFromLiteral numLit = ((NumericFromLiteral) countVar);
      arithVal = numLit.getValue();
    }
    boolean _matches = arithVal.getValue().matches("^(\\d)*$");
    boolean _not = (!_matches);
    if (_not) {
      this.error("Initial count variable must be of type unsigned integer.", null);
    } else {
      final Integer num = Integer.valueOf(arithVal.getValue());
      if (((num).intValue() == 0)) {
        this.warning("Initial count variables equal to 0 will lead to zero instantiated agents.", null);
      }
    }
  }
  
  @Check
  public void checkInitialIllegalLinkStates(final Initial initial) {
    final Pattern pattern = this.patternFromPatternAssignment(initial.getInitialPattern());
    EList<AgentPattern> _agentPatterns = pattern.getAgentPatterns();
    for (final AgentPattern ap : _agentPatterns) {
      if ((ap instanceof ValidAgentPattern)) {
        final ValidAgentPattern vap = ((ValidAgentPattern) ap);
        EList<SitePattern> _sitePatterns = vap.getSitePatterns().getSitePatterns();
        for (final SitePattern sp : _sitePatterns) {
          if ((sp instanceof SingleSitePattern)) {
            final SingleSitePattern slsp = ((SingleSitePattern) sp);
            final LinkState linkState = slsp.getLinkState().getLinkState();
            if ((((linkState instanceof BoundAnyLink) || (linkState instanceof WhatEver)) || (linkState instanceof BoundAnyOfTypeLink))) {
              this.error("Illegal initial link state! A pattern may only be instantiated with link states of Type: FreeLink(\"free\"), IndexedLink(\"INT\")", null);
            }
          } else {
          }
        }
      }
    }
  }
  
  public Pattern patternFromPatternAssignment(final PatternAssignment pa) {
    if ((pa instanceof AssignFromPattern)) {
      final AssignFromPattern afp = ((AssignFromPattern) pa);
      return afp.getPattern();
    } else {
      final AssignFromVariable afv = ((AssignFromVariable) pa);
      return afv.getPatternVar().getPattern();
    }
  }
  
  @Check
  public void checkObservationIdUnique(final Observation observation) {
    final EObject rootElement = EcoreUtil2.getRootContainer(observation);
    List<Observation> candidates = EcoreUtil2.<Observation>getAllContentsOfType(rootElement, Observation.class);
    int c = 0;
    for (final Observation candidate : candidates) {
      {
        Observation current = ((Observation) candidate);
        boolean _equals = current.getName().equals(observation.getName());
        if (_equals) {
          c++;
        }
        if ((c > 1)) {
          this.error("Observation IDs must be unique.", null);
          c = 1;
        }
      }
    }
  }
  
  @Check
  public void checkRuleIdUnique(final Rule rule) {
    final EObject rootElement = EcoreUtil2.getRootContainer(rule);
    List<Rule> candidates = EcoreUtil2.<Rule>getAllContentsOfType(rootElement, Rule.class);
    int c = 0;
    for (final Rule candidate : candidates) {
      {
        Rule current = ((Rule) candidate);
        boolean _equals = current.getName().equals(rule.getName());
        if (_equals) {
          c++;
        }
        if ((c > 1)) {
          this.error("Rule IDs must be unique.", null);
          c = 1;
        }
      }
    }
  }
  
  @Check
  public void checkSiteIdUnique(final Agent agent) {
    List<Site> candidates = EcoreUtil2.<Site>getAllContentsOfType(agent, Site.class);
    int c = 0;
    for (final Site candidate : candidates) {
      {
        Site current = ((Site) candidate);
        String name = current.getName();
        for (final Site candidate2 : candidates) {
          {
            Site current2 = ((Site) candidate2);
            String name2 = current2.getName();
            boolean _equals = name.equals(name2);
            if (_equals) {
              c++;
            }
            if ((c > 1)) {
              this.error("Site IDs within Agents must be unique.", SimSGLPackage.Literals.AGENT__SITES);
              c = 1;
            }
          }
        }
        c = 0;
      }
    }
  }
  
  @Check
  public void checkStateIdUnique(final Site site) {
    List<org.simsg.simsgl.simSGL.State> candidates = EcoreUtil2.<org.simsg.simsgl.simSGL.State>getAllContentsOfType(site, org.simsg.simsgl.simSGL.State.class);
    int c = 0;
    for (final org.simsg.simsgl.simSGL.State candidate : candidates) {
      {
        org.simsg.simsgl.simSGL.State current = ((org.simsg.simsgl.simSGL.State) candidate);
        String name = current.getName();
        for (final org.simsg.simsgl.simSGL.State candidate2 : candidates) {
          {
            org.simsg.simsgl.simSGL.State current2 = ((org.simsg.simsgl.simSGL.State) candidate2);
            String name2 = current2.getName();
            boolean _equals = name.equals(name2);
            if (_equals) {
              c++;
            }
            if ((c > 1)) {
              this.error("State IDs within Sites must be unique.", SimSGLPackage.Literals.SITE__STATES);
              c = 1;
            }
          }
        }
        c = 0;
      }
    }
  }
  
  @Check
  public void checkRuleVariables(final RuleBody ruleBody) {
    String op = ruleBody.getOperator();
    EList<NumericAssignment> variables = ruleBody.getVariables().getVariables();
    boolean _equals = op.equals("<->");
    if (_equals) {
      int _size = variables.size();
      boolean _notEquals = (_size != 2);
      if (_notEquals) {
        this.error("Bi-Directional rules must have two reaction rate variables.", SimSGLPackage.Literals.RULE_BODY__VARIABLES);
      }
    } else {
      int _size_1 = variables.size();
      boolean _notEquals_1 = (_size_1 != 1);
      if (_notEquals_1) {
        this.error("Uni-Directional rules must have one reaction rate variable.", SimSGLPackage.Literals.RULE_BODY__VARIABLES);
      }
    }
    for (final NumericAssignment variable : variables) {
      {
        String value = this.valueOfNumericAssignment(variable);
        boolean faulty = false;
        boolean _contains = value.contains(" ");
        if (_contains) {
          this.error("Arithmetic variables may not contain any white spaces!", SimSGLPackage.Literals.RULE_BODY__VARIABLES);
          faulty = true;
        }
        if ((((!value.matches("^(-)?(\\d)+(\\.)(\\d)+E(-|\\+)(\\d)+$")) && (!value.matches("^(-)?(\\d)*$"))) && (!value.matches("^(-)?(\\d)+(\\.)(\\d)+$")))) {
          this.error("Given expression uses an unknown number format.", SimSGLPackage.Literals.RULE_BODY__VARIABLES);
          faulty = true;
        }
        if ((!faulty)) {
          Double numValue = Double.valueOf(value);
          if (((numValue).doubleValue() < 0)) {
            this.error("Uni-Directional rules must have positive reaction rates.", SimSGLPackage.Literals.RULE_BODY__VARIABLES);
          }
          if (((numValue).doubleValue() == 0)) {
            this.warning("Uni-Directional rules with rates equal to 0 will be inactive.", SimSGLPackage.Literals.RULE_BODY__VARIABLES);
          }
        }
      }
    }
  }
  
  @Check
  public void checkRuleArgs(final RuleBody ruleBody) {
    final Pattern lhs = this.patternFromPatternAssignment(ruleBody.getLhs());
    final Pattern rhs = this.patternFromPatternAssignment(ruleBody.getRhs());
    boolean equalNumOfArgs = true;
    int _size = lhs.getAgentPatterns().size();
    int _size_1 = rhs.getAgentPatterns().size();
    boolean _notEquals = (_size != _size_1);
    if (_notEquals) {
      this.error("Number of arguments on the left hand side of the rule, must match number of arguments on the right hand side.", 
        SimSGLPackage.Literals.RULE_BODY__LHS);
      this.error("Number of arguments on the right hand side of the rule, must match number of arguments on the left hand side.", 
        SimSGLPackage.Literals.RULE_BODY__RHS);
      equalNumOfArgs = false;
    }
    if (equalNumOfArgs) {
      int idx = 0;
      EList<AgentPattern> _agentPatterns = lhs.getAgentPatterns();
      for (final AgentPattern ap : _agentPatterns) {
        {
          if ((ap instanceof VoidAgentPattern)) {
            final AgentPattern ap2 = rhs.getAgentPatterns().get(idx);
            if ((ap2 instanceof VoidAgentPattern)) {
              this.error("Two arguments at the same index on lhs and rhs can not be of void type.", 
                SimSGLPackage.Literals.RULE_BODY__LHS);
              this.error("Two arguments at the same index on lhs and rhs can not be of void type.", 
                SimSGLPackage.Literals.RULE_BODY__RHS);
            }
          } else {
            final ValidAgentPattern ap_1 = ((ValidAgentPattern) ap);
            final AgentPattern ap2_1 = rhs.getAgentPatterns().get(idx);
            if ((!(ap2_1 instanceof VoidAgentPattern))) {
              final ValidAgentPattern ap_2 = ((ValidAgentPattern) ap2_1);
              boolean _equals = ap_1.getAgent().getName().equals(ap_2.getAgent().getName());
              boolean _not = (!_equals);
              if (_not) {
                this.error("Two arguments at the same index on lhs and rhs must have the same agent type.", 
                  SimSGLPackage.Literals.RULE_BODY__LHS);
                this.error("Two arguments at the same index on lhs and rhs must have the same agent type.", 
                  SimSGLPackage.Literals.RULE_BODY__RHS);
              }
            }
            if ((!(ap2_1 instanceof VoidAgentPattern))) {
              final ValidAgentPattern ap_2_1 = ((ValidAgentPattern) ap2_1);
              int _size_2 = ap_1.getSitePatterns().getSitePatterns().size();
              int _size_3 = ap_2_1.getSitePatterns().getSitePatterns().size();
              boolean _notEquals_1 = (_size_2 != _size_3);
              if (_notEquals_1) {
                this.error("Two arguments at the same index on lhs and rhs must have the same amount of sites.", 
                  SimSGLPackage.Literals.RULE_BODY__LHS);
                this.error("Two arguments at the same index on lhs and rhs must have the same amount of sites.", 
                  SimSGLPackage.Literals.RULE_BODY__RHS);
              }
              for (int i = 0; (i < ap_1.getSitePatterns().getSitePatterns().size()); i++) {
                {
                  final SitePattern sp_1 = ap_1.getSitePatterns().getSitePatterns().get(i);
                  final SitePattern sp_2 = ap_2_1.getSitePatterns().getSitePatterns().get(i);
                  if (((sp_1 instanceof SingleSitePattern) && (sp_2 instanceof SingleSitePattern))) {
                    final SingleSitePattern ssp_1 = ((SingleSitePattern) sp_1);
                    final SingleSitePattern ssp_2 = ((SingleSitePattern) sp_2);
                    SingleSite _site = ssp_1.getSite();
                    SingleSite _site_1 = ssp_2.getSite();
                    boolean _notEquals_2 = (!Objects.equal(_site, _site_1));
                    if (_notEquals_2) {
                      this.error("Two arguments at the same index on lhs and rhs must have the same sites.", 
                        SimSGLPackage.Literals.RULE_BODY__LHS);
                      this.error("Two arguments at the same index on lhs and rhs must have the same sites.", 
                        SimSGLPackage.Literals.RULE_BODY__RHS);
                    }
                    final SiteState st_1 = ssp_1.getState();
                    final SiteState st_2 = ssp_2.getState();
                    if (((st_1 == null) && (st_2 != null))) {
                      this.error("If an argument on the rhs defines a state, the corresponding argument on the lhs must define a state as well.", 
                        SimSGLPackage.Literals.RULE_BODY__RHS);
                    }
                    if (((st_2 == null) && (st_1 != null))) {
                      this.error("If an argument on the lhs defines a state, the corresponding argument on the rhs must define a state as well.", 
                        SimSGLPackage.Literals.RULE_BODY__LHS);
                    }
                  }
                }
              }
            }
          }
          idx++;
        }
      }
    }
  }
  
  public String valueOfNumericAssignment(final NumericAssignment na) {
    String value = "0";
    if ((na instanceof NumericFromLiteral)) {
      final NumericFromLiteral nl = ((NumericFromLiteral) na);
      value = nl.getValue().getValue();
    } else {
      final NumericFromVariable nv = ((NumericFromVariable) na);
      final ArithmeticValue ae = nv.getValueVar().getValue();
      value = ae.getValue();
    }
    return value;
  }
  
  @Check
  public void checkAgentPatternSites(final ValidAgentPattern agentPattern) {
    List<SitePattern> candidates = EcoreUtil2.<SitePattern>getAllContentsOfType(agentPattern, SitePattern.class);
    EList<Site> sites = agentPattern.getAgent().getSites().getSites();
    int _size = sites.size();
    HashSet<Site> siteSet = new HashSet<Site>(_size);
    siteSet.addAll(sites);
    HashSet<Site> sitePatternSet = new HashSet<Site>();
    for (final SitePattern candidate : candidates) {
      {
        Site site = ((Site) null);
        if ((candidate instanceof SingleSitePattern)) {
          site = ((SingleSitePattern) candidate).getSite();
        } else {
          site = ((MultiLinkSitePattern) candidate).getSite();
        }
        boolean _contains = siteSet.contains(site);
        boolean _not = (!_contains);
        if (_not) {
          String _name = site.getName();
          String _plus = ("This Agent does not have a site with ID=" + _name);
          this.error(_plus, SimSGLPackage.Literals.VALID_AGENT_PATTERN__SITE_PATTERNS);
        }
        boolean _contains_1 = sitePatternSet.contains(site);
        if (_contains_1) {
          this.error("You may not redefine the same site multiple times.", SimSGLPackage.Literals.VALID_AGENT_PATTERN__SITE_PATTERNS);
        } else {
          sitePatternSet.add(site);
        }
      }
    }
  }
  
  @Check
  public void checkIndexedLinkConstraint(final BoundLink boundLink) {
    Pattern pattern = ((Pattern) null);
    EObject eObj = boundLink.eContainer();
    while (((!(eObj instanceof Pattern)) && (eObj != null))) {
      eObj = eObj.eContainer();
    }
    if ((eObj instanceof Pattern)) {
      pattern = ((Pattern)eObj);
    }
    List<BoundLink> candidates = EcoreUtil2.<BoundLink>getAllContentsOfType(pattern, BoundLink.class);
    int c = 1;
    final Integer thisNum = Integer.valueOf(boundLink.getState());
    for (final BoundLink cnd : candidates) {
      {
        final BoundLink candidate = ((BoundLink) cnd);
        final Integer cNum = Integer.valueOf(candidate.getState());
        if ((Objects.equal(cNum, thisNum) && (!candidate.equals(boundLink)))) {
          c++;
        }
        if ((c > 2)) {
          this.error("This indexed link refers to more than two end-points aka. sites.", SimSGLPackage.Literals.BOUND_LINK__STATE);
        }
      }
    }
    if ((c < 2)) {
      this.error("This indexed link must refer to exactly two end-points aka. sites.", SimSGLPackage.Literals.BOUND_LINK__STATE);
    }
  }
  
  @Check
  public void checkIndexedFreeLinkConstraint(final IndexedFreeLink freeLink) {
    Pattern pattern = ((Pattern) null);
    EObject eObj = freeLink.eContainer();
    while (((!(eObj instanceof Pattern)) && (eObj != null))) {
      eObj = eObj.eContainer();
    }
    if ((eObj instanceof Pattern)) {
      pattern = ((Pattern)eObj);
    }
    List<IndexedFreeLink> candidates = EcoreUtil2.<IndexedFreeLink>getAllContentsOfType(pattern, IndexedFreeLink.class);
    int c = 1;
    final Integer thisNum = Integer.valueOf(freeLink.getState());
    for (final IndexedFreeLink cnd : candidates) {
      {
        final IndexedFreeLink candidate = ((IndexedFreeLink) cnd);
        final Integer cNum = Integer.valueOf(candidate.getState());
        if ((Objects.equal(cNum, thisNum) && (!candidate.equals(freeLink)))) {
          c++;
        }
        if ((c > 2)) {
          this.error("This indexed link deletion refers to more than two end-points aka. sites.", SimSGLPackage.Literals.INDEXED_FREE_LINK__STATE);
        }
      }
    }
    if ((c < 2)) {
      this.error("This indexed link deletion must refer to exactly two end-points aka. sites.", SimSGLPackage.Literals.INDEXED_FREE_LINK__STATE);
    }
  }
}
