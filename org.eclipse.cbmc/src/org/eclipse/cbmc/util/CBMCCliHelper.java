package org.eclipse.cbmc.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.text.SimpleDateFormat;
import java.util.*;
import org.eclipse.cbmc.*;
import org.eclipse.core.runtime.CoreException;
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

	private ILaunchConfiguration configuration;
	private File workingDirectory;
	private List<String> baseCli = new ArrayList<String>();

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
			CheckAllPropertiesOption[] options = CheckAllPropertiesOption.values();
			for (int i = 0; i < options.length; i++) {
				CheckAllPropertiesOption option = options[i];
				if (configuration.getAttribute(LC_CBMC_OPTIONPREFIX + option.getName(), false)) {
					baseCli.add(option.getName());
				}
			}
			baseCli = Collections.unmodifiableList(baseCli);
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
		result.add(CBMC_ARG_SHOW_PROPERTIES);
		result.add(CBMC_ARG_XML_UI);
		return result;
	}

	public ArrayList<String> getCommandLineForAllLoops() {
		ArrayList<String> result = new ArrayList<String>(baseCli);
		result.add(CBMC_ARG_SHOW_LOOPS);
		result.add(CBMC_ARG_XML_UI);
		return result;
	}

	public ArrayList<String> getCommandLineForPropertyCheck(Property property) {
		ArrayList<String> result = new ArrayList<String>(baseCli);
		try {
			if (configuration.getAttribute(LC_CBMC_UNWIND, NO_VALUE) != NO_VALUE) {
				result.add(CBMC_ARG_UNWIND);
				result.add(String.valueOf(configuration.getAttribute(LC_CBMC_UNWIND, NO_VALUE)));
			}
			Results model = (Results) (property.eContainer());
			if (model.getLoops() != null && !model.getLoops().isEmpty()) {
				ArrayList<String> unwindsets = new ArrayList<String>();
				for (Loop loop : model.getLoops()) {
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
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		result.add(CBMC_ARG_PROPERTY);
		result.add(property.getNumber());
		result.add(CBMC_ARG_XML_UI);
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

	public boolean showLoops() {
		try {
			return configuration.getAttribute(LC_CBMC_SHOW_LOOPS, true);
		} catch (CoreException e) {
			//Ignore those for now
		}
		return true;
	}

	public String cliStringify(ArrayList<String> cli) {
		String cliString = ""; //$NON-NLS-1$
		for (Iterator<String> iterator = cli.iterator(); iterator.hasNext();) {
			String string = iterator.next();
			cliString += " " + string; //$NON-NLS-1$
		}
		return cliString;
	}
}
