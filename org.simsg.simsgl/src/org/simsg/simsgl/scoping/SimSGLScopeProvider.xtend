/*
 * generated by Xtext 2.16.0
 */
package org.simsg.simsgl.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.FilteringScope
import java.util.LinkedList
import org.simsg.simsgl.simSGL.SiteState
import org.simsg.simsgl.simSGL.BoundAnyOfTypeLinkAgent
import org.simsg.simsgl.simSGL.BoundAnyOfTypeLinkSite
import org.simsg.simsgl.simSGL.SitePattern
import org.simsg.simsgl.simSGL.NumericFromVariable
import org.simsg.simsgl.simSGL.ValidAgentPattern
import org.simsg.simsgl.simSGL.States
import org.simsg.simsgl.simSGL.MultiLinkSitePattern
import org.simsg.simsgl.simSGL.SingleSitePattern
import org.simsg.simsgl.simSGL.Agent
import org.simsg.simsgl.simSGL.BoundAnyOfTypeLink
import org.simsg.simsgl.simSGL.SitePatterns
import org.simsg.simsgl.simSGL.ArithmeticVariable
import org.simsg.simsgl.simSGL.SimSGLModel
import org.simsg.simsgl.simSGL.Site
import org.simsg.simsgl.simSGL.Attribute
import org.simsg.simsgl.simSGL.AgentState
import org.simsg.simsgl.simSGL.Constraint
import org.simsg.simsgl.simSGL.Pattern
import org.simsg.simsgl.simSGL.AgentPattern
import org.simsg.simsgl.simSGL.AttributeOperand
import org.simsg.simsgl.simSGL.Attributes

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class SimSGLScopeProvider extends AbstractSimSGLScopeProvider {
	
	var root = null as SimSGLModel
	
	override getScope(EObject context, EReference reference) {
	    if (context instanceof SiteState) {
	        return siteStateScope(context, reference)
	    }
	    if (context instanceof BoundAnyOfTypeLinkAgent) {
	    	return exactLinkAgentScope(context, reference)
	    }
	    if (context instanceof BoundAnyOfTypeLinkSite) {
	    	return exactLinkSiteScope(context, reference)
	    }
	    if (context instanceof SitePattern) {
	       return sitePatternScope(context, reference)
	    }
	    if (context instanceof NumericFromVariable) {
	    	return numericVariableScope(context, reference)
	    }
	    if (context instanceof ValidAgentPattern) {
	    	return validAgentPatternScope(context, reference)
	    }
	    if (context instanceof AgentState) {
	    	return agentStateScope(context, reference)
	    }
	    if (context instanceof Constraint) {
	    	return constraintScope(context, reference)
	    }
	    if (context instanceof AttributeOperand) {
	    	return attributeOperandScope(context, reference)
	    }
	    return super.getScope(context, reference);
	}
	
	def SimSGLModel getRoot(EObject context) {
		if(root === null) {
			root = EcoreUtil2.getRootContainer(context) as SimSGLModel
		}
		return root;
	}
	
	def validAgentPatternScope(EObject context, EReference reference){
		val list = new LinkedList<EObject>
	    list.addAll(EcoreUtil2.getAllContentsOfType(getRoot(context), Agent))
	    list.addAll(EcoreUtil2.getAllContentsOfType(getRoot(context), Site))
	    list.addAll(EcoreUtil2.getAllContentsOfType(getRoot(context), Attribute))
	    val existingScope = Scopes.scopeFor(list)
	    return new FilteringScope(existingScope, [getEObjectOrProxy != context])
	}
	
	def agentStateScope(EObject context, EReference reference) {
		val agentState = context as AgentState
		
		var vap = null as ValidAgentPattern
		if(agentState.eContainer !== null) {
	    	vap = agentState.eContainer as ValidAgentPattern
	    }
	    
	    if(vap === null) {
	    	return super.getScope(context, reference);
	    }
	    
	    var states = vap.agent.states as States
	    if(states === null){
	    	return super.getScope(context, reference);
	    }
	    
	    var list = states.state
	    val existingScope = Scopes.scopeFor(list)
	    
	    return new FilteringScope(existingScope, [getEObjectOrProxy != context])
	    
	}
	
	def attributeOperandScope(EObject context, EReference reference) {
		val attributeOperand = context as AttributeOperand
		val operandAgent = attributeOperand.agent
		
		val attributes = operandAgent.attributes as Attributes
	   	if(attributes === null) {
	   		return super.getScope(context, reference);
	   	}
	   	if(attributes.attributes === null) {
	   		return super.getScope(context, reference);
	   	}
	   	
	   	val list = new LinkedList<EObject>
	   	list.addAll(attributes.attributes)
	   	list.addAll(EcoreUtil2.getAllContentsOfType(getRoot(context), Agent))
	   	
	   	val existingScope = Scopes.scopeFor(list)
	    return new FilteringScope(existingScope, [getEObjectOrProxy != context])
	}
	
	def constraintScope(EObject context, EReference reference) {
		val constraint = context as Constraint
		var pattern = null as Pattern
		if(constraint.eContainer !== null) {
	    	pattern = constraint.eContainer as Pattern
	    }
	    
	   	var list = new LinkedList<Agent>
	   	for(AgentPattern ap : pattern.agentPatterns) {
	   		if(ap instanceof ValidAgentPattern) {
	   			val vap = ap as ValidAgentPattern
	   			list.add(vap.agent)
	   		}	
	   	}
	   	
	   	val existingScope = Scopes.scopeFor(list)
	    return new FilteringScope(existingScope, [getEObjectOrProxy != context])
	}
	
	def numericVariableScope(EObject context, EReference reference){
		val list = new LinkedList<EObject>
	    list.addAll(EcoreUtil2.getAllContentsOfType(getRoot(context), ArithmeticVariable))
	    val existingScope = Scopes.scopeFor(list)
	    return new FilteringScope(existingScope, [getEObjectOrProxy != context])
	}
	
	def siteStateScope(EObject context, EReference reference) {
	    val siteState = context as SiteState
	   
	    var sitePattern = null as SitePattern
	    if(siteState.eContainer !== null) {
	    	sitePattern = siteState.eContainer as SitePattern
	    }
	    
	    if(sitePattern === null) {
	    	return super.getScope(context, reference);
	    }
	    
	    var states = null as States
	    
	    if(sitePattern instanceof MultiLinkSitePattern) {
	    	val mlsp = sitePattern as MultiLinkSitePattern
	    	states = mlsp.site.states
	    }else {
	    	val slsp = sitePattern as SingleSitePattern
	    	states = slsp.site.states
	    }
	    
	    if(states === null){
	    	return super.getScope(context, reference);
	    }
	    
	    var list = states.state
	    val existingScope = Scopes.scopeFor(list)
	    
	    return new FilteringScope(existingScope, [getEObjectOrProxy != context])
	    
	}
	
	def exactLinkAgentScope(EObject context, EReference reference) {
	    val list = new LinkedList<EObject>
	    list.addAll(EcoreUtil2.getAllContentsOfType(getRoot(context), Agent))
	    val existingScope = Scopes.scopeFor(list)
	    return new FilteringScope(existingScope, [getEObjectOrProxy != context])
	}
	
	def exactLinkSiteScope(EObject context, EReference reference) {
	    
	    var linkSite = context as BoundAnyOfTypeLinkSite
	   
	    var agent = null as Agent
	    if(linkSite.eContainer !== null) {
	    	val exactLink = linkSite.eContainer as BoundAnyOfTypeLink
	    	if(exactLink.linkAgent !== null) {
	    		agent = exactLink.linkAgent.agent
	    	}
	    }
	    
	    if(agent === null) {
	     	return super.getScope(context, reference);
	    }
	    
	    var list = agent.sites.sites
	    val existingScope = Scopes.scopeFor(list)
	    
	    return new FilteringScope(existingScope, [getEObjectOrProxy != context])
	}
	
	def sitePatternScope(EObject context, EReference reference) {
	    var sitePattern = context as SitePattern
	        
	    var agent = null as Agent
	    if(sitePattern.eContainer !== null) {
	    	val sitePatterns = sitePattern.eContainer as SitePatterns
	    	if(sitePatterns.eContainer !== null) {
	    		val agentPattern = sitePatterns.eContainer as ValidAgentPattern
	    		agent = agentPattern.agent
	    	}
	    } 
	    val relevantSites = new LinkedList<EObject>
	    relevantSites.addAll(agent.sites.sites)
	    val existingScope = Scopes.scopeFor(relevantSites)
	        
	    return new FilteringScope(existingScope, [getEObjectOrProxy != context])
	}
}
