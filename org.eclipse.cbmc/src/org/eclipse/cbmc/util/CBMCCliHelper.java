package org.eclipse.cbmc.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.text.SimpleDateFormat;
import java.util.*;
import org.eclipse.cbmc.CommandOption;
import org.eclipse.cbmc.Property;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;

public class CBMCCliHelper {
	private static final String NO_VALUE = ""; //$NON-NLS-1$
	private static final String CBMC_ARG_PROPERTY = "--property"; //$NON-NLS-1$
	private static final String CBMC_ARG_PREFIX = "--"; //$NON-NLS-1$
	private static final String CBMC_ARG_SHOW_CLAIMS = "--show-claims"; //$NON-NLS-1$
	private static final String CBMC_ARG_FUNCTION = "--function"; //$NON-NLS-1$
	private static final String CBMC_ARG_XML_UI = "--xml-ui"; //$NON-NLS-1$

	public static final String LC_CBMC_OPTIONPREFIX = "cbmc."; //$NON-NLS-1$
	public static final String LC_CBMC_FUNCTION = "cbmc.function"; //$NON-NLS-1$
	public static final String LC_CBMC_FILE = "cbmc.file"; //$NON-NLS-1$
	public static final String LC_CBMC_EXECUTABLE = "cbmc.executable"; //$NON-NLS-1$
	public static final String LC_CBMC_AUTORUN = "cbmc.autorun"; //$NON-NLS-1$

	private ILaunchConfiguration configuration;
	private File workingDirectory;
	private List<String> baseCli = new ArrayList<String>();

	private CBMCCliHelper(ILaunchConfiguration config) throws IOException {
		configuration = config;
		Path tmpDir = Files.createTempDirectory("cbmc", new FileAttribute[0]); //$NON-NLS-1$
		workingDirectory = new File(tmpDir.toFile(), new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())); //$NON-NLS-1$
		workingDirectory.mkdirs();
	}

	private void initializeBaseCommandLine() {
		try {
			baseCli.add(configuration.getAttribute(LC_CBMC_EXECUTABLE, NO_VALUE));
			baseCli.add(configuration.getAttribute(LC_CBMC_FILE, NO_VALUE));
			if (configuration.getAttribute(LC_CBMC_FUNCTION, NO_VALUE).length() > 0) {
				baseCli.add(CBMC_ARG_FUNCTION);
				baseCli.add(configuration.getAttribute(LC_CBMC_FUNCTION, NO_VALUE));
			}
			CommandOption[] options = CommandOption.values();
			for (int i = 0; i < options.length; i++) {
				CommandOption option = options[i];
				if (configuration.getAttribute(LC_CBMC_OPTIONPREFIX + option.getLiteral(), false)) {
					baseCli.add(CBMC_ARG_PREFIX + option.getLiteral());
				}
			}
			baseCli = (List<String>) Collections.unmodifiableList(baseCli);
		} catch (CoreException e) {
			//Ignore those for now
		}
	}

	public static CBMCCliHelper create(ILaunchConfiguration config) throws IOException {
		CBMCCliHelper bridge = new CBMCCliHelper(config);
		bridge.initializeBaseCommandLine();
		return bridge;
	}

	public ArrayList<String> getCommandLineForAllProperties() {
		ArrayList<String> result = new ArrayList<String>(baseCli);
		result.add(CBMC_ARG_SHOW_CLAIMS);
		result.add(CBMC_ARG_XML_UI);
		return result;
	}

	public ArrayList<String> getCommandLineForPropertyCheck(Property property) {
		ArrayList<String> result = new ArrayList<String>(baseCli);
		result.add(CBMC_ARG_PROPERTY);
		result.add(property.getNumber());
		return result;
	}

	public File getWorkingDirectory() {
		return workingDirectory;
	}

	public boolean isAutoRun() {
		try {
			return configuration.getAttribute(LC_CBMC_AUTORUN, true);
		} catch (CoreException e) {
			//Ignore those for now
		}
		return true;
	}
}
