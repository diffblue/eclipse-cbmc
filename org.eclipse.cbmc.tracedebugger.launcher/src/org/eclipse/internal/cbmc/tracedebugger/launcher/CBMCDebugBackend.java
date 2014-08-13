package org.eclipse.internal.cbmc.tracedebugger.launcher;

import java.io.IOException;

import org.eclipse.cdt.debug.core.ICDTLaunchConfigurationConstants;
import org.eclipse.cdt.dsf.gdb.internal.GdbPlugin;
import org.eclipse.cdt.dsf.gdb.service.GDBBackend;
import org.eclipse.cdt.dsf.service.DsfSession;
import org.eclipse.cdt.utils.spawner.ProcessFactory;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunchConfiguration;

public class CBMCDebugBackend extends GDBBackend {
	 ILaunchConfiguration launchConfig;
	 
	public CBMCDebugBackend(DsfSession session, ILaunchConfiguration lc) {
		super(session, lc);
		launchConfig = lc;
	}

	protected String getGDBCommandLine() {
		String classpath = new PathsUtils().getClasspath(Platform.getBundle("org.eclipse.cbmc.tracedebugger"));
		String traceLocation = null;
		try {
			traceLocation = launchConfig.getAttribute(ICDTLaunchConfigurationConstants.ATTR_PROGRAM_NAME, (String) null);
		} catch (CoreException e) {
			//Can't happen
		}
		String command = "java -classpath " + classpath + " main.TraceDebugger " + traceLocation;
		return command;
	}

	
	protected Process launchGDBProcess(String commandLine) throws CoreException {
        Process proc = null;
		try {
			proc = ProcessFactory.getFactory().exec(commandLine);
		} catch (IOException e) {
            String message = "Error while launching command " + commandLine;   //$NON-NLS-1$
            throw new CoreException(new Status(IStatus.ERROR, GdbPlugin.PLUGIN_ID, -1, message, e));
		}
		
		return proc;
	}
}
