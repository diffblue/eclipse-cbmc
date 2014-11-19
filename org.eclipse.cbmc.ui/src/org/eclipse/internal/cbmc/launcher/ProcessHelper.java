package org.eclipse.internal.cbmc.launcher;

import java.io.*;
import java.util.concurrent.TimeUnit;
import org.eclipse.core.runtime.*;
import org.eclipse.internal.cbmc.Activator;

public class ProcessHelper {

	public static boolean executeCommand(String... cli) {
		return (Boolean) executeCommand(cli, false, null, null)[0];
	}

	public static String executeCommandWithOutput(String... cli) {
		Object[] result = executeCommand(cli, true, null, null);
		if (result[0].equals(Boolean.TRUE))
			return (String) result[1];
		return null;
	}

	public static boolean executeCommandWithRedirectOutput(String[] cli, File redirectOutput) {
		return executeCommandWithRedirectOutput(cli, redirectOutput, null);
	}

	public static boolean executeCommandWithRedirectOutput(String[] cli, File redirectOutput, IProgressMonitor monitor) {
		return (Boolean) executeCommand(cli, false, redirectOutput, monitor)[0];
	}

	private static Object[] executeCommand(String[] cli, boolean returnOutput, File redirectOutput, IProgressMonitor monitor) {
		String output = null;
		boolean success = false;
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
						process.destroy();
					}
				}
			} else {
				process.waitFor();
			}
			if (returnOutput) {
				BufferedReader buffer = new BufferedReader(new InputStreamReader(process.getInputStream()));
				output = buffer.readLine();
				buffer.close();
			}
			success = (process.exitValue() == 0);
			//			if (!success) {
			//				log(IStatus.ERROR, "Command execution failed (" + cliToString(cli) + "): exitValue=" + process.exitValue(), null); //$NON-NLS-1$//$NON-NLS-2$
			//			}

		} catch (IOException | InterruptedException e) {
			logError("Cannot execute the command: " + cliToString(cli), e); //$NON-NLS-1$
		}
		return new Object[] {success, output};
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
