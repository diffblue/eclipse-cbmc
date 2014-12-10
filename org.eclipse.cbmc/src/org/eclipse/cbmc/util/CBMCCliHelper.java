/*******************************************************************************
 * Copyright (c) 2014 Rapicorp, Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Rapicorp, Inc - initial API and implementation
 *******************************************************************************/
package org.eclipse.cbmc.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.text.SimpleDateFormat;
import java.util.*;
import org.eclipse.cbmc.*;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.*;
import org.eclipse.debug.core.ILaunchConfiguration;

public class CBMCCliHelper {
	public static final String NO_VALUE = ""; //$NON-NLS-1$
	private static final String CBMC_ARG_PROPERTY = "--property"; //$NON-NLS-1$
	private static final String CBMC_ARG_SHOW_PROPERTIES = "--show-properties"; //$NON-NLS-1$
	private static final String CBMC_ARG_SHOW_LOOPS = "--show-loops"; //$NON-NLS-1$
	private static final String CBMC_ARG_FUNCTION = "--function"; //$NON-NLS-1$
	private static final String CBMC_ARG_UNWIND = "--unwind"; //$NON-NLS-1$
	private static final String CBMC_ARG_UNWINDSET = "--unwindset"; //$NON-NLS-1$
	private static final String CBMC_ARG_XML_UI = "--xml-ui"; //$NON-NLS-1$

	public static final String LC_CBMC_OPTIONPREFIX = "cbmc."; //$NON-NLS-1$
	public static final String LC_CBMC_FUNCTION = "cbmc.function"; //$NON-NLS-1$
	public static final String LC_CBMC_FILE = "cbmc.file"; //$NON-NLS-1$
	public static final String LC_CBMC_EXECUTABLE = "cbmc.executable"; //$NON-NLS-1$
	public static final String LC_CBMC_AUTORUN = "cbmc.autorun"; //$NON-NLS-1$
	public static final String LC_CBMC_SHOW_LOOPS = "cbmc.show-loops"; //$NON-NLS-1$
	public static final String LC_CBMC_UNWIND = "cbmc.unwind"; //$NON-NLS-1$

	private File workingDirectory;
	private List<String> baseCli = new ArrayList<String>();
	private static final String PLUGIN_ID = "org.eclipse.cbmc"; //$NON-NLS-1$
	private static final Object C_EXTENSION = "c"; //$NON-NLS-1$
	private static final Object CPP_EXTENSION = "cpp"; //$NON-NLS-1$
	private ILog logger = Platform.getPlugin(PLUGIN_ID).getLog();
	private String lcCBMCFileToCheck;
	private String lcCBMCExecutable;
	private String lcCBMCFunction;
	private boolean lcCBMCShowLoops;
	private List<String> lcCBMCOptions;
	private String lcCBMCUnwind;
	private boolean lcCBMCAutoRun;
	private Collection<String> filesToCheck;

	public enum CheckAllPropertiesOption {
		NO_ASSERTIONS("--no-assertions", "ignore user assertions"), //$NON-NLS-1$//$NON-NLS-2$
		NO_ASSUMPTIONS("--no-assumptions", "ignore user assumptions"), //$NON-NLS-1$//$NON-NLS-2$
		DIV_BY_ZERO_CHECK("--div-by-zero-check", "enable division by zero checks"), //$NON-NLS-1$//$NON-NLS-2$
		POINTER_CHECK("--pointer-check", "enable pointer checks"), //$NON-NLS-1$//$NON-NLS-2$
		SIGNED_OVERFLOW_CHECK("--signed-overflow-check", "enable arithmetic over- and underflow checks"), //$NON-NLS-1$//$NON-NLS-2$
		UNSIGNED_OVERFLOW_CHECK("--unsigned-overflow-check", "enable arithmetic over- and underflow checks"), //$NON-NLS-1$//$NON-NLS-2$
		NAN_CHECK("--nan-check", "check floating-point for NaN"), //$NON-NLS-1$//$NON-NLS-2$
		BOUNDS_CHECK("--bounds-check", "enable array bounds checks"), //$NON-NLS-1$//$NON-NLS-2$
		UNDEFINED_SHIFT_CHECK("--undefined-shift-check", ""), //$NON-NLS-1$//$NON-NLS-2$
		MEMORY_LEAK_CHECK("--memory-leak-check", "enable memory leak checks"), //$NON-NLS-1$//$NON-NLS-2$
		FLOAT_OVERFLOW_CHECK("--float-overflow-check", "check floating-point for +/-Inf"), //$NON-NLS-1$//$NON-NLS-2$
		COVER_ASSERTIONS("--cover-assertions", "check which assertions are reachable"), //$NON-NLS-1$//$NON-NLS-2$
		NO_UNWINDING_ASSERTIONS("--no-unwinding-assertions", "ignore unwuinding assertions");//$NON-NLS-1$//$NON-NLS-2$
		private String name;
		private String description;
		List<Loop> loops;

		private CheckAllPropertiesOption(String name, String description) {
			this.name = name;
			this.description = description;
		}

		public String getName() {
			return name;
		}

		public String getDescription() {
			return description;
		}
	}

	private CBMCCliHelper(ILaunchConfiguration config) {
		try {
			lcCBMCExecutable = config.getAttribute(LC_CBMC_EXECUTABLE, NO_VALUE);
			lcCBMCFileToCheck = config.getAttribute(LC_CBMC_FILE, NO_VALUE);
			lcCBMCFunction = config.getAttribute(LC_CBMC_FUNCTION, NO_VALUE);
			lcCBMCShowLoops = config.getAttribute(LC_CBMC_SHOW_LOOPS, true);
			lcCBMCUnwind = config.getAttribute(LC_CBMC_UNWIND, NO_VALUE);
			lcCBMCAutoRun = config.getAttribute(LC_CBMC_AUTORUN, true);
			lcCBMCOptions = new ArrayList<String>();
			CheckAllPropertiesOption[] options = CheckAllPropertiesOption.values();
			for (int i = 0; i < options.length; i++) {
				CheckAllPropertiesOption option = options[i];
				if (config.getAttribute(LC_CBMC_OPTIONPREFIX + option.getName(), false)) {
					lcCBMCOptions.add(option.getName());
				}
			}
		} catch (CoreException e) {
			logger.log(new Status(IStatus.ERROR, PLUGIN_ID, "Error retrieving attributes from the launch configuration", e)); //$NON-NLS-1$
		}
		try {
			Path tmpDir = Files.createTempDirectory("cbmc", new FileAttribute[0]); //$NON-NLS-1$
			workingDirectory = new File(tmpDir.toFile(), new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())); //$NON-NLS-1$
			workingDirectory.mkdirs();
		} catch (IOException e) {
			logger.log(new Status(IStatus.ERROR, PLUGIN_ID, "Cannot create a temporary directory", e)); //$NON-NLS-1$
		}
	}

	private void initializeBaseCommandLine() {
		baseCli.add(lcCBMCExecutable);
		filesToCheck = computeFilesToCheck();
		baseCli.addAll(filesToCheck);
		if (lcCBMCFunction.length() > 0) {
			baseCli.add(CBMC_ARG_FUNCTION);
			baseCli.add(lcCBMCFunction);
		}
		baseCli.addAll(lcCBMCOptions);
		baseCli = Collections.unmodifiableList(baseCli);
	}

	private Collection<String> computeFilesToCheck() {
		ArrayList<String> files = new ArrayList<String>();
		if (isFileToCheckASourceFile()) {
			IProject currentProject = getCurrentProject();
			if (currentProject != null && currentProject.isOpen() && currentProject.exists()) {
				recursiveFindInProject(files, currentProject.getLocation(), ResourcesPlugin.getWorkspace().getRoot());
			}
		} else
			files.add(lcCBMCFileToCheck);
		return files;
	}

	private boolean isFileToCheckASourceFile() {
		return lcCBMCFileToCheck.endsWith("." + C_EXTENSION) || lcCBMCFileToCheck.endsWith("." + CPP_EXTENSION); //$NON-NLS-1$//$NON-NLS-2$
	}

	private IProject getCurrentProject() {
		org.eclipse.core.runtime.Path path = new org.eclipse.core.runtime.Path(lcCBMCFileToCheck);
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(path);
		if (file != null)
			return file.getProject();
		return null;
	}

	private void recursiveFindInProject(Collection<String> files, IPath path, IWorkspaceRoot workspaceRoot) {
		IContainer container = workspaceRoot.getContainerForLocation(path);
		try {
			IResource[] iResources;
			iResources = container.members();
			for (IResource resource : iResources) {
				String extension = resource.getFileExtension();
				if (extension != null && (extension.equals(C_EXTENSION) || extension.equals(CPP_EXTENSION)))
					files.add(resource.getRawLocation().makeAbsolute().toString());
				if (resource.getType() == IResource.FOLDER) {
					IPath tempPath = resource.getLocation();
					recursiveFindInProject(files, tempPath, workspaceRoot);
				}
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static CBMCCliHelper create(ILaunchConfiguration config) {
		CBMCCliHelper bridge = new CBMCCliHelper(config);
		bridge.initializeBaseCommandLine();
		return bridge;
	}

	public String[] getCommandLineForAllProperties() {
		ArrayList<String> result = new ArrayList<String>(baseCli);
		result.add(CBMC_ARG_SHOW_PROPERTIES);
		result.add(CBMC_ARG_XML_UI);
		return result.toArray(new String[result.size()]);
	}

	public String[] getCommandLineForAllLoops() {
		ArrayList<String> result = new ArrayList<String>();
		result.add(lcCBMCExecutable);
		result.addAll(filesToCheck);
		result.add(CBMC_ARG_SHOW_LOOPS);
		result.add(CBMC_ARG_XML_UI);
		return result.toArray(new String[result.size()]);
	}

	public String[] getCommandLineForPropertyCheck(Property property) {
		ArrayList<String> result = new ArrayList<String>(baseCli);
		if (lcCBMCUnwind != NO_VALUE) {
			result.add(CBMC_ARG_UNWIND);
			result.add(String.valueOf(lcCBMCUnwind));
		}
		Results model = (Results) (property.eContainer());
		if (model.getLoopResults() != null && !model.getLoopResults().getLoops().isEmpty()) {
			ArrayList<String> unwindsets = new ArrayList<String>();
			for (Loop loop : model.getLoopResults().getLoops()) {
				if (!loop.getUnwind().isEmpty()) {
					unwindsets.add(loop.getId().concat(":").concat(loop.getUnwind())); //$NON-NLS-1$
				}
			}
			if (!unwindsets.isEmpty()) {
				String unwindstring = ""; //$NON-NLS-1$
				for (String s : unwindsets) {
					unwindstring += (unwindstring.length() == 0 ? "" : ",") + s; //$NON-NLS-1$ //$NON-NLS-2$
				}
				result.add(CBMC_ARG_UNWINDSET);
				result.add(unwindstring);
			}
		}

		result.add(CBMC_ARG_PROPERTY);
		result.add(property.getNumber());
		result.add(CBMC_ARG_XML_UI);
		return result.toArray(new String[result.size()]);
	}

	public File getWorkingDirectory() {
		return workingDirectory;
	}

	public boolean isAutoRun() {
		return lcCBMCAutoRun;
	}

	public boolean showLoops() {
		return lcCBMCShowLoops;
	}
}
