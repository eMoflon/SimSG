/**
 * generated by Xtext 2.12.0
 */
package biochemsimulation.reactionrules.scoping;

import biochemsimulation.reactionrules.reactionRules.Agent;
import biochemsimulation.reactionrules.reactionRules.ArithmeticVariable;
import biochemsimulation.reactionrules.reactionRules.BoundAnyOfTypeLink;
import biochemsimulation.reactionrules.reactionRules.BoundAnyOfTypeLinkAgent;
import biochemsimulation.reactionrules.reactionRules.BoundAnyOfTypeLinkSite;
import biochemsimulation.reactionrules.reactionRules.NumericFromVariable;
import biochemsimulation.reactionrules.reactionRules.Site;
import biochemsimulation.reactionrules.reactionRules.SitePattern;
import biochemsimulation.reactionrules.reactionRules.SitePatterns;
import biochemsimulation.reactionrules.reactionRules.SiteState;
import biochemsimulation.reactionrules.reactionRules.State;
import biochemsimulation.reactionrules.reactionRules.States;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;
import biochemsimulation.reactionrules.scoping.AbstractReactionRulesScopeProvider;
import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import java.util.LinkedList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.FilteringScope;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class ReactionRulesScopeProvider extends AbstractReactionRulesScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    if ((context instanceof SiteState)) {
      return this.siteStateScope(context, reference);
    }
    if ((context instanceof BoundAnyOfTypeLinkAgent)) {
      return this.exactLinkAgentScope(context, reference);
    }
    if ((context instanceof BoundAnyOfTypeLinkSite)) {
      return this.exactLinkSiteScope(context, reference);
    }
    if ((context instanceof SitePattern)) {
      return this.sitePatternScope(context, reference);
    }
    if ((context instanceof NumericFromVariable)) {
      return this.numericVariableScope(context, reference);
    }
    if ((context instanceof ValidAgentPattern)) {
    }
    return super.getScope(context, reference);
  }
  
  public FilteringScope validAgentPatternScope(final EObject context, final EReference reference) {
    final EObject rootElement = EcoreUtil2.getRootContainer(context);
    final LinkedList<EObject> list = new LinkedList<EObject>();
    list.addAll(EcoreUtil2.<Agent>getAllContentsOfType(rootElement, Agent.class));
    final IScope existingScope = Scopes.scopeFor(list);
    final Predicate<IEObjectDescription> _function = (IEObjectDescription it) -> {
      EObject _eObjectOrProxy = it.getEObjectOrProxy();
      return (!Objects.equal(_eObjectOrProxy, context));
    };
    return new FilteringScope(existingScope, _function);
  }
  
  public FilteringScope numericVariableScope(final EObject context, final EReference reference) {
    final EObject rootElement = EcoreUtil2.getRootContainer(context);
    final LinkedList<EObject> list = new LinkedList<EObject>();
    list.addAll(EcoreUtil2.<ArithmeticVariable>getAllContentsOfType(rootElement, ArithmeticVariable.class));
    final IScope existingScope = Scopes.scopeFor(list);
    final Predicate<IEObjectDescription> _function = (IEObjectDescription it) -> {
      EObject _eObjectOrProxy = it.getEObjectOrProxy();
      return (!Objects.equal(_eObjectOrProxy, context));
    };
    return new FilteringScope(existingScope, _function);
  }
  
  public IScope siteStateScope(final EObject context, final EReference reference) {
    final SiteState siteState = ((SiteState) context);
    SitePattern sitePattern = ((SitePattern) null);
    EObject _eContainer = siteState.eContainer();
    boolean _tripleNotEquals = (_eContainer != null);
    if (_tripleNotEquals) {
      EObject _eContainer_1 = siteState.eContainer();
      sitePattern = ((SitePattern) _eContainer_1);
    }
    if ((sitePattern == null)) {
      return super.getScope(context, reference);
    }
    States _states = sitePattern.getSite().getStates();
    boolean _tripleEquals = (_states == null);
    if (_tripleEquals) {
      return super.getScope(context, reference);
    }
    EList<State> list = sitePattern.getSite().getStates().getState();
    final IScope existingScope = Scopes.scopeFor(list);
    final Predicate<IEObjectDescription> _function = (IEObjectDescription it) -> {
      EObject _eObjectOrProxy = it.getEObjectOrProxy();
      return (!Objects.equal(_eObjectOrProxy, context));
    };
    return new FilteringScope(existingScope, _function);
  }
  
  public FilteringScope exactLinkAgentScope(final EObject context, final EReference reference) {
    final EObject rootElement = EcoreUtil2.getRootContainer(context);
    final LinkedList<EObject> list = new LinkedList<EObject>();
    list.addAll(EcoreUtil2.<Agent>getAllContentsOfType(rootElement, Agent.class));
    final IScope existingScope = Scopes.scopeFor(list);
    final Predicate<IEObjectDescription> _function = (IEObjectDescription it) -> {
      EObject _eObjectOrProxy = it.getEObjectOrProxy();
      return (!Objects.equal(_eObjectOrProxy, context));
    };
    return new FilteringScope(existingScope, _function);
  }
  
  public IScope exactLinkSiteScope(final EObject context, final EReference reference) {
    BoundAnyOfTypeLinkSite linkSite = ((BoundAnyOfTypeLinkSite) context);
    Agent agent = ((Agent) null);
    EObject _eContainer = linkSite.eContainer();
    boolean _tripleNotEquals = (_eContainer != null);
    if (_tripleNotEquals) {
      EObject _eContainer_1 = linkSite.eContainer();
      final BoundAnyOfTypeLink exactLink = ((BoundAnyOfTypeLink) _eContainer_1);
      BoundAnyOfTypeLinkAgent _linkAgent = exactLink.getLinkAgent();
      boolean _tripleNotEquals_1 = (_linkAgent != null);
      if (_tripleNotEquals_1) {
        agent = exactLink.getLinkAgent().getAgent();
      }
    }
    if ((agent == null)) {
      return super.getScope(context, reference);
    }
    EList<Site> list = agent.getSites().getSites();
    final IScope existingScope = Scopes.scopeFor(list);
    final Predicate<IEObjectDescription> _function = (IEObjectDescription it) -> {
      EObject _eObjectOrProxy = it.getEObjectOrProxy();
      return (!Objects.equal(_eObjectOrProxy, context));
    };
    return new FilteringScope(existingScope, _function);
  }
  
  public FilteringScope sitePatternScope(final EObject context, final EReference reference) {
    SitePattern sitePattern = ((SitePattern) context);
    Agent agent = ((Agent) null);
    EObject _eContainer = sitePattern.eContainer();
    boolean _tripleNotEquals = (_eContainer != null);
    if (_tripleNotEquals) {
      EObject _eContainer_1 = sitePattern.eContainer();
      final SitePatterns sitePatterns = ((SitePatterns) _eContainer_1);
      EObject _eContainer_2 = sitePatterns.eContainer();
      boolean _tripleNotEquals_1 = (_eContainer_2 != null);
      if (_tripleNotEquals_1) {
        EObject _eContainer_3 = sitePatterns.eContainer();
        final ValidAgentPattern agentPattern = ((ValidAgentPattern) _eContainer_3);
        agent = agentPattern.getAgent();
      }
    }
    final LinkedList<EObject> relevantSites = new LinkedList<EObject>();
    relevantSites.addAll(agent.getSites().getSites());
    final IScope existingScope = Scopes.scopeFor(relevantSites);
    final Predicate<IEObjectDescription> _function = (IEObjectDescription it) -> {
      EObject _eObjectOrProxy = it.getEObjectOrProxy();
      return (!Objects.equal(_eObjectOrProxy, context));
    };
    return new FilteringScope(existingScope, _function);
  }
}
