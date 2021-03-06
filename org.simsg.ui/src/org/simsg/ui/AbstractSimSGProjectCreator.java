package org.simsg.ui;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
//import org.emoflon.ibex.gt.editor.ui.builder.GTNature;
import org.gervarro.eclipse.workspace.autosetup.JavaProjectConfigurator;
import org.gervarro.eclipse.workspace.autosetup.PluginProjectConfigurator;
import org.gervarro.eclipse.workspace.autosetup.ProjectConfigurator;
import org.gervarro.eclipse.workspace.autosetup.WorkspaceAutoSetupModule;
import org.gervarro.eclipse.workspace.util.ProjectUtil;
import org.gervarro.eclipse.workspace.util.WorkspaceTask;
import org.moflon.core.build.nature.MoflonProjectConfigurator;
import org.moflon.core.build.nature.ProjectNatureAndBuilderConfiguratorTask;
import org.moflon.core.plugins.BuildPropertiesFileBuilder;
import org.moflon.core.plugins.PluginProperties;
import org.moflon.core.plugins.manifest.ManifestFileUpdater;
import org.moflon.core.plugins.manifest.ManifestFileUpdater.AttributeUpdatePolicy;
import org.moflon.core.plugins.manifest.PluginManifestConstants;
import org.moflon.core.utilities.WorkspaceHelper;

public abstract class AbstractSimSGProjectCreator extends WorkspaceTask implements ProjectConfigurator {
	private final IProject project;

	private final PluginProperties pluginProperties;

	private final URI projectLocation;
	
	private final SimSGNature projectConfigurator;

	public AbstractSimSGProjectCreator(final IProject project, URI projectLocation, final PluginProperties projectProperties,
			final SimSGNature projectConfigurator) {
		this.projectLocation = projectLocation;
		this.project = project;
		this.pluginProperties = projectProperties;
		this.projectConfigurator = projectConfigurator;
	}

	/**
	 * Returns the list of lines for the .gitignore file to be created in the
	 * project's root folder
	 *
	 * @return the list of lines
	 */
	protected abstract List<String> getGitignoreLines();

	/**
	 * Returns the ID of the nature to be added to .project
	 *
	 * @return the nature ID
	 * @throws CoreException
	 *                           if determining the nature ID fails
	 */
	protected abstract String getNatureId() throws CoreException;

	/**
	 * Returns the ID of the builder to be added to .project
	 *
	 * @return the builder ID
	 * @throws CoreException
	 *                           if determining the builder ID fails
	 */
	protected abstract String getBuilderId() throws CoreException;

	/**
	 * Returns true if optional compiler warnings in /gen shall be ignored The
	 * default behavior is not to ignore warnings.
	 */
	protected boolean shallIgnoreGenWarnings() {
		return false;
	}

	@Override
	public void run(final IProgressMonitor monitor) throws CoreException {
		if (!project.exists()) {
			final String projectName = pluginProperties.getProjectName();
			final SubMonitor subMon = SubMonitor.convert(monitor, "Creating project " + projectName, 13);

			// (1) Create project
			final IProjectDescription description = ResourcesPlugin.getWorkspace().newProjectDescription(projectName);
			if(projectLocation != null) {
				description.setLocationURI(projectLocation);
			}
			
			project.create(description, IWorkspace.AVOID_UPDATE, subMon.split(1));
			project.open(IWorkspace.AVOID_UPDATE, subMon.split(1));

			// (2) Configure natures and builders (.project file)
			final JavaProjectConfigurator javaProjectConfigurator = new JavaProjectConfigurator();
			final MoflonProjectConfigurator simSGProjectConfigurator = this.projectConfigurator;
			final PluginProjectConfigurator pluginProjectConfigurator = new PluginProjectConfigurator();
			final ProjectNatureAndBuilderConfiguratorTask natureAndBuilderConfiguratorTask = new ProjectNatureAndBuilderConfiguratorTask(
					project, false);
			natureAndBuilderConfiguratorTask.updateNatureIDs(simSGProjectConfigurator, true);
			natureAndBuilderConfiguratorTask.updateNatureIDs(javaProjectConfigurator, true);
			natureAndBuilderConfiguratorTask.updateBuildSpecs(javaProjectConfigurator, true);
			natureAndBuilderConfiguratorTask.updateBuildSpecs(simSGProjectConfigurator, true);
			natureAndBuilderConfiguratorTask.updateNatureIDs(pluginProjectConfigurator, true);
			natureAndBuilderConfiguratorTask.updateBuildSpecs(pluginProjectConfigurator, true);
			WorkspaceTask.executeInCurrentThread(natureAndBuilderConfiguratorTask, IWorkspace.AVOID_UPDATE,
					subMon.split(1));
			
//			//Add GT-Nature and GT-Builder
//			WorkspaceHelper.addNature(project, GTNature.NATURE_ID, new NullProgressMonitor());
			//Add Xtext-Nature
			WorkspaceHelper.addNature(project, "org.eclipse.xtext.ui.shared.xtextNature", new NullProgressMonitor());

			// (3) Create folders and files in project
			createFoldersIfNecessary(project, subMon.split(4));
			addGitignoreFile(project, subMon.split(2));
			addGitKeepFiles(project, subMon.split(2));

			// (4) Create MANIFEST.MF file
			createManifestFile();

			// (5) Create build.properties file
			new BuildPropertiesFileBuilder().createBuildProperties(project, subMon.split(1));

			// (6) Configure Java settings (.classpath file)
			final IJavaProject javaProject = JavaCore.create(project);
			final IClasspathEntry srcFolderEntry = JavaCore
					.newSourceEntry(WorkspaceHelper.getSourceFolder(project).getFullPath());
			final IClasspathEntry genFolderEntry = JavaCore
					.newSourceEntry(project.getFolder("gen").getFullPath());
			final IClasspathEntry srcGenFolderEntry = JavaCore
					.newSourceEntry(project.getFolder("src-gen").getFullPath());

			// Integration projects contain a lot of (useful?) boilerplate code in /gen,
			// which requires to ignore warnings such as 'unused variable', 'unused import'
			// etc.
			final IClasspathEntry jreContainerEntry = JavaCore
					.newContainerEntry(new Path("org.eclipse.jdt.launching.JRE_CONTAINER"));
			final IClasspathEntry pdeContainerEntry = JavaCore
					.newContainerEntry(new Path("org.eclipse.pde.core.requiredPlugins"));
			javaProject.setRawClasspath(
					new IClasspathEntry[] { srcFolderEntry, srcGenFolderEntry, genFolderEntry, jreContainerEntry,
							pdeContainerEntry },
					WorkspaceHelper.getBinFolder(project).getFullPath(), true, subMon.split(1));
		}
	}

	/**
	 * Initializes the Manifest.MF file
	 * 
	 * @throws CoreException
	 *                           if an error occurs
	 */
	private void createManifestFile() throws CoreException {
		validatePluginProperties();

		new ManifestFileUpdater().processManifest(project, manifest -> {
			boolean changed = false;
			final String name = pluginProperties.get(PluginProperties.NAME_KEY);
			final String pluginId = pluginProperties.get(PluginProperties.PLUGIN_ID_KEY);
			changed |= ManifestFileUpdater.updateAttribute(manifest, PluginManifestConstants.MANIFEST_VERSION, "1.0",
					AttributeUpdatePolicy.KEEP);
			changed |= ManifestFileUpdater.updateAttribute(manifest, PluginManifestConstants.BUNDLE_MANIFEST_VERSION,
					"2", AttributeUpdatePolicy.KEEP);
			changed |= ManifestFileUpdater.updateAttribute(manifest, PluginManifestConstants.BUNDLE_NAME, name,
					AttributeUpdatePolicy.KEEP);
			changed |= ManifestFileUpdater.updateAttribute(manifest, PluginManifestConstants.BUNDLE_SYMBOLIC_NAME,
					pluginId + ";singleton:=true", AttributeUpdatePolicy.KEEP);
			changed |= ManifestFileUpdater.updateAttribute(manifest, PluginManifestConstants.BUNDLE_VERSION,
					"0.0.1.qualifier", AttributeUpdatePolicy.KEEP);
			changed |= ManifestFileUpdater.updateAttribute(manifest, PluginManifestConstants.BUNDLE_VENDOR, "",
					AttributeUpdatePolicy.KEEP);
			changed |= ManifestFileUpdater.updateAttribute(manifest, PluginManifestConstants.BUNDLE_ACTIVATION_POLICY,
					"lazy", AttributeUpdatePolicy.KEEP);
			changed |= ManifestFileUpdater.updateAttribute(manifest,
					PluginManifestConstants.BUNDLE_EXECUTION_ENVIRONMENT, "JavaSE-1.8", AttributeUpdatePolicy.KEEP);
			changed |= ManifestFileUpdater.updateAttribute(manifest, PluginManifestConstants.AUTOMATIC_MODULE_NAME,
					pluginId, AttributeUpdatePolicy.KEEP);
			return changed;
		});
	}

	/**
	 * Returns the handle to the project that shall be created. Of course, the
	 * project need not exist yet.
	 *
	 * @return the handle to the project to create
	 */
	public final IProject getProject() {
		return project;
	}

	/**
	 * Returns the properties of the plugin project to create
	 *
	 * @return the plugin properties
	 */
	public PluginProperties getPluginProperties() {
		return pluginProperties;
	}

	/**
	 * Validates the presence of the necessary keys for this builder
	 *
	 * @throws CoreException
	 *                           if a required key-value mapping is missing
	 */
	private void validatePluginProperties() throws CoreException {
		validateNotNull(getPluginProperties(), PluginProperties.NAME_KEY);
		validateNotNull(getPluginProperties(), PluginProperties.PLUGIN_ID_KEY);
	}

	/**
	 * Validates that the given key is present in the given properties
	 *
	 * @param pluginProperties
	 *                             the properties to check
	 * @param key
	 *                             the key to check
	 * @throws CoreException
	 *                           if there is no mapping for the given key in the
	 *                           given properties
	 */
	private void validateNotNull(final PluginProperties pluginProperties, final String key) throws CoreException {
		if (!pluginProperties.containsKey(key))
			throw new CoreException(new Status(IStatus.ERROR, WorkspaceHelper.getPluginId(getClass()),
					String.format("Key %s not found in %s", key, pluginProperties)));
	}

	/**
	 * Adds a default .gitignore file to the given project to prevent adding
	 * generated files to the repository
	 *
	 * The contents of the created file are fetched from
	 * {@link #getGitignoreLines()}
	 *
	 * @param project
	 *                    the project for which to generate the .gitignore file
	 * @param monitor
	 *                    the progress monitor
	 */
	public void addGitignoreFile(final IProject project, final IProgressMonitor monitor) throws CoreException {
		final SubMonitor subMon = SubMonitor.convert(monitor, "Creating .gitignore file for " + project, 1);

		WorkspaceHelper.createGitignoreFileIfNotExists(project.getFile(WorkspaceHelper.GITIGNORE_FILENAME), //
				getGitignoreLines(), subMon.split(1));
	}

	public void createFoldersIfNecessary(final IProject project, final IProgressMonitor monitor) throws CoreException {
		final SubMonitor subMon = SubMonitor.convert(monitor, "Creating folders within project " + project, 9);

		WorkspaceHelper.createFolderIfNotExists(WorkspaceHelper.getSourceFolder(project), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(WorkspaceHelper.getBinFolder(project), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(WorkspaceHelper.getModelFolder(project), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(WorkspaceHelper.getGenFolder(project), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(project.getFolder("src-gen"), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(project.getFolder("instances"), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(project.getFolder("instances/simulation_definitions"), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(project.getFolder("instances/simulation_results"), subMon.split(1));
		WorkspaceHelper.createFolderIfNotExists(project.getFolder("instances/simulation_instances"), subMon.split(1));
	}

	/**
	 * Adds dummy files to folders that are / may be empty after project
	 * initialization.
	 *
	 * The dummy files are required because Git does not support versioning empty
	 * folders (unlike SVN).
	 *
	 * @param project
	 *                    the project for which .keep files shall be produced
	 * @param monitor
	 *                    the progress monitor
	 */
	protected void addGitKeepFiles(final IProject project, final IProgressMonitor monitor) {
		// Nothing to do in this class
	}

	@Override
	public String getTaskName() {
		return "Creating SimSG project";
	}

	@Override
	public ISchedulingRule getRule() {
		return ResourcesPlugin.getWorkspace().getRoot();
	}

	@Override
	public String[] updateNatureIDs(String[] natureIDs, final boolean added) throws CoreException {
		final String natureId = getNatureId();
		if (added) {
			if (ProjectUtil.indexOf(natureIDs, natureId) < 0) {
				natureIDs = Arrays.copyOf(natureIDs, natureIDs.length + 1);
				natureIDs[natureIDs.length - 1] = natureId;
			}
		} else {
			final int naturePosition = ProjectUtil.indexOf(natureIDs, natureId);
			if (naturePosition >= 0) {
				natureIDs = WorkspaceAutoSetupModule.remove(natureIDs, naturePosition);
			}
		}
		return natureIDs;
	}

	@Override
	public ICommand[] updateBuildSpecs(final IProjectDescription description, ICommand[] buildSpecs,
			final boolean added) throws CoreException {
		final String builderId = getBuilderId();

		if (added) {
			int javaBuilderPosition = ProjectUtil.indexOf(buildSpecs, "org.eclipse.jdt.core.javabuilder");
			int simsgBuilderPosition = ProjectUtil.indexOf(buildSpecs, builderId);
			if (simsgBuilderPosition < 0) {
				final ICommand manifestBuilder = description.newCommand();
				manifestBuilder.setBuilderName(builderId);
				buildSpecs = Arrays.copyOf(buildSpecs, buildSpecs.length + 1);
				simsgBuilderPosition = buildSpecs.length - 1;
				buildSpecs[simsgBuilderPosition] = manifestBuilder;
			}
			if (javaBuilderPosition < simsgBuilderPosition) {
				final ICommand moflonBuilder = buildSpecs[simsgBuilderPosition];
				System.arraycopy(buildSpecs, javaBuilderPosition, buildSpecs, javaBuilderPosition + 1,
						simsgBuilderPosition - javaBuilderPosition);
				simsgBuilderPosition = javaBuilderPosition++;
				buildSpecs[simsgBuilderPosition] = moflonBuilder;
			}
		} else {
			final int moflonBuilderPosition = ProjectUtil.indexOf(buildSpecs, builderId);
			if (moflonBuilderPosition >= 0) {
				final ICommand[] oldBuilderSpecs = buildSpecs;
				buildSpecs = new ICommand[oldBuilderSpecs.length - 1];
				if (moflonBuilderPosition > 0) {
					System.arraycopy(oldBuilderSpecs, 0, buildSpecs, 0, moflonBuilderPosition);
				}
				if (moflonBuilderPosition == buildSpecs.length) {
					System.arraycopy(oldBuilderSpecs, moflonBuilderPosition + 1, buildSpecs, moflonBuilderPosition,
							buildSpecs.length - moflonBuilderPosition);
				}
			}
		}
		return buildSpecs;
	}
}
