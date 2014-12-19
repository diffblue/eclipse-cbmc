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
package org.eclipse.internal.cbmc.view;

import java.io.File;
import java.io.IOException;
import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.eclipse.cbmc.Results;
import org.eclipse.cbmc.util.CBMCCliHelper;
import org.eclipse.core.runtime.*;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.internal.cbmc.Activator;
import org.eclipse.internal.cbmc.launcher.ProcessHelper;

public class GeneratePropertiesJob extends Job {
	private static final String PROPERTIES_OUTPUT_CBMC = "properties.output.cbmc"; //$NON-NLS-1$
	private static final String PROPERTIES_INPUT_XML = "properties.input.xml"; //$NON-NLS-1$
	private static final String TRANSFORM_XSL = "cbmcTransform.xsl"; //$NON-NLS-1$

	private CBMCCliHelper cliHelper;

	private Results results;

	private int exitValue = 0;

	public GeneratePropertiesJob(String name, CBMCCliHelper cliHelper) {
		super(name);
		this.cliHelper = cliHelper;
	}

	public synchronized int getExitCode() {
		return exitValue;
	}

	public void setExitCode(int code) {
		exitValue = code;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try {
			File inputfile = new File(cliHelper.getWorkingDirectory(), PROPERTIES_INPUT_XML);
			File outputfile = new File(cliHelper.getWorkingDirectory(), PROPERTIES_OUTPUT_CBMC);
			setExitCode(ProcessHelper.executeCommandWithRedirectOutput(cliHelper.getCommandLineForAllProperties(), inputfile, monitor));
			if (getExitCode() == 0) {
				Source xmlInput = new StreamSource(inputfile);
				Source xsl = new StreamSource(FileLocator.openStream(Platform.getBundle(Activator.PLUGIN_ID), new Path(TRANSFORM_XSL), false));
				Result xmlOutput = new StreamResult(outputfile);
				Transformer transformer = TransformerFactory.newInstance().newTransformer(xsl);
				transformer.transform(xmlInput, xmlOutput);

				URI uri = URI.createFileURI(outputfile.getAbsolutePath());
				ResourceSet resSet = new ResourceSetImpl();
				Resource resource = resSet.getResource(uri, true);
				results = (Results) resource.getContents().get(0);
				results.setCBMCHelper(cliHelper);
				if (!results.getErrorMessage().isEmpty()) {
					Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error while getting properties. Reason: " + results.getErrorMessage(), null)); //$NON-NLS-1$
				}
			} else {
				return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "An error occurred while retrieving the properties. Please make sure the launch configuration validates and that the code to analyze does not have any compile error."); //$NON-NLS-1$
			}
		} catch (TransformerException e) {
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Cannot transform the CBMC properties into the ecore model", e); //$NON-NLS-1$
		} catch (IOException e) {
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Cannot open transform XSL:" + TRANSFORM_XSL, e); //$NON-NLS-1$
		}
		if (results == null)
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Cannot retrieve properties", null); //$NON-NLS-1$
		return Status.OK_STATUS;
	}

	public Results getCBMCResults() {
		return results;
	}
}
