/**
 * generated by Xtext 2.16.0
 */
package org.simsg.simsgl.generator;

import java.io.IOException;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.simsg.simsgl.simSGL.impl.SimSGLModelImpl;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class SimSGLGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    this.saveResource(resource);
  }
  
  public String saveResource(final Resource resource) {
    String _xblockexpression = null;
    {
      EObject _get = resource.getContents().get(0);
      final SimSGLModelImpl model = ((SimSGLModelImpl) _get);
      final String name = model.getModel().getName();
      final String projectPath = this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
      final String uriName = (((("file:" + projectPath) + "model/instances/") + name) + ".xmi");
      final URI uri1 = URI.createURI(uriName);
      URI uri2 = resource.getURI();
      uri2 = uri2.trimFileExtension();
      uri2 = uri2.appendFileExtension("xmi");
      this.saveModelToURI(model, name, uri1);
      _xblockexpression = this.saveModelToURI(model, name, uri2);
    }
    return _xblockexpression;
  }
  
  public String saveModelToURI(final EObject model, final String name, final URI uri) {
    String _xblockexpression = null;
    {
      final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
      Map<String, Object> m = reg.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      m.put(name, _xMIResourceFactoryImpl);
      ResourceSetImpl resourceSet = new ResourceSetImpl();
      Resource _createResource = resourceSet.createResource(uri);
      XMIResource resource = ((XMIResource) _createResource);
      resource.getContents().add(model);
      final Map<Object, Object> saveOptions = resource.getDefaultSaveOptions();
      saveOptions.put(XMIResource.OPTION_ENCODING, "UTF-8");
      saveOptions.put(XMIResource.OPTION_USE_XMI_TYPE, Boolean.TRUE);
      saveOptions.put(XMIResource.OPTION_SAVE_TYPE_INFORMATION, Boolean.TRUE);
      saveOptions.put(XMIResource.OPTION_SCHEMA_LOCATION_IMPLEMENTATION, Boolean.TRUE);
      String _xtrycatchfinallyexpression = null;
      try {
        String _xblockexpression_1 = null;
        {
          resource.save(saveOptions);
          String _path = uri.path();
          String _plus = ("Model saved to: " + _path);
          _xblockexpression_1 = InputOutput.<String>println(_plus);
        }
        _xtrycatchfinallyexpression = _xblockexpression_1;
      } catch (final Throwable _t) {
        if (_t instanceof IOException) {
          final IOException e = (IOException)_t;
          e.printStackTrace();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = _xtrycatchfinallyexpression;
    }
    return _xblockexpression;
  }
}