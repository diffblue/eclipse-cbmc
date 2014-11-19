package org.eclipse.internal.cbmc.view;

import java.io.File;
import java.io.IOException;
import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.eclipse.cbmc.Loop;
import org.eclipse.cbmc.Results;
import org.eclipse.cbmc.util.CBMCCliHelper;
import org.eclipse.core.runtime.*;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.internal.cbmc.Activator;
import org.eclipse.internal.cbmc.launcher.ProcessHelper;

public class GenerateLoopsJob extends Job {
	private static final String LOOPS_OUTPUT_CBMC = "loops.output.cbmc"; //$NON-NLS-1$
	private static final String LOOPS_INPUT_XML = "loops.input.xml"; //$NON-NLS-1$
	private static final String TRANSFORM_XSL = "loopsTransform.xsl"; //$NON-NLS-1$
	private static final int SUCCESS_EXITVALUE = 6;

	private CBMCCliHelper cliHelper;
	private EList<Loop> loops;

	public GenerateLoopsJob(String name, CBMCCliHelper cliHelper) {
		super(name);
		this.cliHelper = cliHelper;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try {
			File inputfile = new File(cliHelper.getWorkingDirectory(), LOOPS_INPUT_XML);
			File outputfile = new File(cliHelper.getWorkingDirectory(), LOOPS_OUTPUT_CBMC);
			int exitValue = ProcessHelper.executeCommandWithRedirectOutput(cliHelper.getCommandLineForAllLoops(), inputfile);
			if (exitValue == SUCCESS_EXITVALUE) {
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
				Results results = (Results) resource.getContents().get(0);
				loops = results.getLoops();
			}
		} catch (IOException e) {
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Cannot open the XSLT file for loops: " + TRANSFORM_XSL, e); //$NON-NLS-1$
		} catch (TransformerException e) {
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Cannot transform CBMC loops into the ecore model", e); //$NON-NLS-1$
		}
		return Status.OK_STATUS;
	}

	public EList<Loop> getLoops() {
		return loops;
	}
}
