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
package org.eclipse.internal.cbmc.launcher;

import java.io.*;
import java.util.concurrent.TimeUnit;
import org.eclipse.core.runtime.*;
import org.eclipse.internal.cbmc.Activator;

public class ProcessHelper {

	private static final int SUCCESS_EXITVALUE = 0;

	public static boolean executeCommand(String... cli) {
		return (Boolean) executeCommand(cli, false, null, null)[0];
	}

	public static String executeCommandWithOutput(String... cli) {
		Object[] result = executeCommand(cli, true, null, null);
		if (result[0].equals(Boolean.TRUE))
			return (String) result[2];
		return null;
	}

	public static Object[] executeCommandWithSuccessFlagAndOutput(String... cli) {
		Object[] result = executeCommand(cli, true, null, null);
		return new Object[] {result[0], result[2]};
	}

	public static int executeCommandWithRedirectOutput(String[] cli, File redirectOutput, IProgressMonitor monitor) {
		return (int) executeCommand(cli, false, redirectOutput, monitor)[1];
	}

	private static Object[] executeCommand(String[] cli, boolean returnOutput, File redirectOutput, IProgressMonitor monitor) {
		String output = null;
		boolean success = false;
		int exitValue = -1;
		try {
			ProcessBuilder pb = new ProcessBuilder(cli);
			pb.redirectErrorStream(true);
			if (redirectOutput != null) {
				pb.redirectOutput(redirectOutput);
			}
			Process process = pb.start();
			if (monitor != null) {
				while (!process.waitFor(1, TimeUnit.SECONDS)) {
					if (monitor.isCanceled()) {
						process.destroyForcibly();
					}
				}
			} else {
				process.waitFor();
			}
			if (returnOutput) {
				BufferedReader buffer = new BufferedReader(new InputStreamReader(process.getInputStream()));
				String currentline;
				while ((currentline = buffer.readLine()) != null) {
					output = (output == null ? "" : " " + output) + currentline; //$NON-NLS-1$ //$NON-NLS-2$
				}
				buffer.close();
			}
			exitValue = process.exitValue();
			success = (exitValue == SUCCESS_EXITVALUE);
			//			if (!success) {
			//				log(IStatus.ERROR, "Command execution failed (" + cliToString(cli) + "): exitValue=" + process.exitValue(), null); //$NON-NLS-1$//$NON-NLS-2$
			//			}

		} catch (IOException | InterruptedException e) {
			logError("Cannot execute the command: " + cliToString(cli), e); //$NON-NLS-1$
		}
		return new Object[] {success, exitValue, output};
	}

	private static String cliToString(String... cli) {
		String cliString = ""; //$NON-NLS-1$
		for (int i = 0; i < cli.length; i++) {
			cliString += " " + cli[i]; //$NON-NLS-1$
		}
		return cliString;
	}

	private static void logError(String message, Exception e) {
		Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, message, e));
	}
}
