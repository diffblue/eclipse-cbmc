package org.eclipse.internal.cbmc.view;

import java.io.File;
import java.io.IOException;
import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.eclipse.cbmc.Results;
import org.eclipse.core.runtime.*;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.internal.cbmc.Activator;
import org.eclipse.internal.cbmc.launcher.CBMCCliHelper;

public class AllPropertiesJob extends Job {
	private static final String CLAIMS_OUTPUT_CBMC = "claims.output.cbmc"; //$NON-NLS-1$
	private static final String CLAIMS_INPUT_XML = "claims.input.xml"; //$NON-NLS-1$
	private static final String TRANSFORM_XSL = "cbmcTransform.xsl"; //$NON-NLS-1$

	private CBMCCliHelper cliHelper;

	private Results results;

	public AllPropertiesJob(String name, CBMCCliHelper cliHelper) {
		super(name);
		this.cliHelper = cliHelper;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try {
			File inputfile = new File(cliHelper.getWorkingDirectory(), CLAIMS_INPUT_XML);
			File outputfile = new File(cliHelper.getWorkingDirectory(), CLAIMS_OUTPUT_CBMC);

			//Execute cbmc to generate all properties
			//Here we are not trying to cancel because the generation of the property is fast
			ProcessBuilder pb = new ProcessBuilder(cliHelper.getCommandLineForAllProperties());
			pb.redirectErrorStream(true);
			pb.redirectOutput(inputfile);
			Process process = pb.start();
			process.waitFor();

			//Transform CBMC XML output into something EMF can read
			Source xmlInput = new StreamSource(inputfile);
			Source xsl = new StreamSource(FileLocator.openStream(Platform.getBundle(Activator.PLUGIN_ID), new Path(TRANSFORM_XSL), false));
			Result xmlOutput = new StreamResult(outputfile);
			Transformer transformer = TransformerFactory.newInstance().newTransformer(xsl);
			transformer.transform(xmlInput, xmlOutput);

			//Load newly created file
			URI uri = URI.createFileURI(outputfile.getAbsolutePath());
			ResourceSet resSet = new ResourceSetImpl();
			Resource resource = resSet.getResource(uri, true);
			results = (Results) resource.getContents().get(0);
		} catch (IOException | TransformerException | InterruptedException e) {
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.CBMC_execution_error, e);
		}
		return Status.OK_STATUS;
	}

	public Results getCBMCResults() {
		return results;
	}
}
