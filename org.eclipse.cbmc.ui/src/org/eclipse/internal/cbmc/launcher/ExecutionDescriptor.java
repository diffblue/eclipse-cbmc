package org.eclipse.internal.cbmc.launcher;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.eclipse.cbmc.*;
import org.eclipse.core.runtime.*;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.internal.cbmc.Activator;

public class ExecutionDescriptor {
	static final String LC_CBMC_OPTIONPREFIX = "cbmc."; //$NON-NLS-1$
	static final String LC_CBMC_FUNCTION = "cbmc.function"; //$NON-NLS-1$
	static final String LC_CBMC_FILE = "cbmc.file"; //$NON-NLS-1$
	static final String LC_CBMC_EXECUTABLE = "cbmc.executable"; //$NON-NLS-1$

	private ILaunchConfiguration configuration;
	private String DIRECTORY_PATH;
	private final ArrayList<String> baseCli;

	public ExecutionDescriptor(ILaunchConfiguration configuration) throws CoreException {
		this.configuration = configuration;
		this.DIRECTORY_PATH = "/tmp/" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		new File(this.DIRECTORY_PATH).mkdir();
		baseCli = getCommandLineFromConfiguration();
	}

	private ArrayList<String> getCommandLineFromConfiguration() throws CoreException {
		ArrayList<String> cli = new ArrayList<String>();
		cli.add(configuration.getAttribute(LC_CBMC_EXECUTABLE, (String) null));
		cli.add(configuration.getAttribute(LC_CBMC_FILE, ""));
		if (configuration.getAttribute(LC_CBMC_FUNCTION, "").length() > 0) {
			cli.add("--function " + configuration.getAttribute(LC_CBMC_FUNCTION, ""));
		}
		CommandOption[] options = CommandOption.values();
		for (int i = 0; i < options.length; i++) {
			CommandOption option = options[i];
			if (configuration.getAttribute(LC_CBMC_OPTIONPREFIX + option.getLiteral(), false)) {
				cli.add("--" + option.getLiteral());
			}
		}
		return cli;
	}

	public static ExecutionDescriptor createFromLaunchConfiguration(ILaunchConfiguration configuration) throws CoreException {
		ExecutionDescriptor result = new ExecutionDescriptor(configuration);
		return result;
	}

	public Results getAllProperties() throws IOException, InterruptedException, TransformerFactoryConfigurationError, TransformerException {
		File inputfile = new File(DIRECTORY_PATH + "/claims.input.xml");
		File outputfile = new File(DIRECTORY_PATH + "/claims.output.cbmc");
		@SuppressWarnings("unchecked")
		ArrayList<String> cli = (ArrayList<String>) baseCli.clone();
		cli.add("--show-claims"); //$NON-NLS-1$
		cli.add("--xml-ui"); //$NON-NLS-1$
		System.out.println(cli);
		ProcessBuilder pb = new ProcessBuilder(cli);
		pb.redirectErrorStream(true);
		pb.redirectOutput(inputfile);
		Process process = pb.start();
		process.waitFor();
		Source xmlInput = new StreamSource(inputfile);
		Source xsl = new StreamSource(FileLocator.openStream(Platform.getBundle(Activator.PLUGIN_ID), new Path("cbmcTransform.xsl"), false)); //$NON-NLS-1$
		Result xmlOutput = new StreamResult(outputfile);
		Transformer transformer = TransformerFactory.newInstance().newTransformer(xsl);
		transformer.transform(xmlInput, xmlOutput);
		URI uri = URI.createFileURI(outputfile.getAbsolutePath());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(uri, true);
		Results results = (Results) resource.getContents().get(0);
		return results;
	}

	public String resolveProperty(Property property) throws IOException, InterruptedException {
		File file = new File(DIRECTORY_PATH + "/counterexample." + property.getNumber() + ".txt");
		@SuppressWarnings("unchecked")
		ArrayList<String> cli = (ArrayList<String>) baseCli.clone();
		cli.add("--property"); //$NON-NLS-1$
		cli.add(property.getNumber());
		System.out.println(cli);
		ProcessBuilder pb = new ProcessBuilder(cli);
		pb.redirectErrorStream(true);
		pb.redirectOutput(file);
		Process process = pb.start();
		process.waitFor();
		return process.exitValue() == 0 ? null : file.getAbsolutePath();
	}
}
