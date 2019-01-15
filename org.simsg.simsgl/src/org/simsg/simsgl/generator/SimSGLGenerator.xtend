/*
 * generated by Xtext 2.16.0
 */
package org.simsg.simsgl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.simsg.simsgl.simSGL.impl.SimSGLModelImpl
import java.io.IOException
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.XMIResource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SimSGLGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		saveResource(resource)
	}
	
	def saveResource(Resource resource) {
		val model = resource.getContents().get(0) as SimSGLModelImpl
		val name = model.model.name
		val projectPath = this.getClass().getProtectionDomain().getCodeSource().getLocation().path
		val uriName = "file:"+projectPath+"model/instances/"+name+".xmi"
		val uri1 = URI.createURI(uriName);
		var uri2 = resource.URI
		uri2 = uri2.trimFileExtension
		uri2 = uri2.appendFileExtension("xmi")
		saveModelToURI(model, name, uri1)
		saveModelToURI(model, name, uri2)
	}
	
	def saveModelToURI(EObject model, String name, URI uri){
		val Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		var m = reg.getExtensionToFactoryMap();
		m.put(name, new XMIResourceFactoryImpl());
		var resourceSet = new ResourceSetImpl();
		var resource = resourceSet.createResource(uri) as XMIResource;
		resource.getContents().add(model);
		
		val saveOptions = resource.getDefaultSaveOptions()
		saveOptions.put(XMIResource.OPTION_ENCODING,"UTF-8")
		saveOptions.put(XMIResource.OPTION_USE_XMI_TYPE, Boolean.TRUE)
		saveOptions.put(XMIResource.OPTION_SAVE_TYPE_INFORMATION,Boolean.TRUE)
		saveOptions.put(XMIResource.OPTION_SCHEMA_LOCATION_IMPLEMENTATION, Boolean.TRUE)
		
		try {
			resource.save(saveOptions);
			println("Model saved to: "+uri.path)
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
