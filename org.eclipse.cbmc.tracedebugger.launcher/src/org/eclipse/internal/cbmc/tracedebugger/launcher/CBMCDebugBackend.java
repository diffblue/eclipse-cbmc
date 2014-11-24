package org.eclipse.internal.cbmc.tracedebugger.launcher;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.cdt.debug.core.ICDTLaunchConfigurationConstants;
import org.eclipse.cdt.dsf.concurrent.RequestMonitor;
import org.eclipse.cdt.dsf.gdb.service.GDBBackend;
import org.eclipse.cdt.dsf.service.DsfSession;
import org.eclipse.cdt.utils.spawner.ProcessFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunchConfiguration;

public class CBMCDebugBackend extends GDBBackend {
	private static final Logger logger = Logger.getLogger(CBMCDebugBackend.class.getName());
	ILaunchConfiguration launchConfig;
	IMarker marker;
	
	public CBMCDebugBackend(DsfSession session, ILaunchConfiguration lc) {
		super(session, lc);
		launchConfig = lc;
	}

	private void createErrorMarker() throws CoreException {
		Path path = new Path(launchConfig.getAttribute(CBMCDebug.LC_CBMC_FILE_IN_ERROR, (String) null));
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(path);
		if (file == null)
			return;
		
		marker = file.createMarker(IMarker.PROBLEM);
		marker.setAttribute(IMarker.TRANSIENT, "true");
		marker.setAttribute(IMarker.LINE_NUMBER, launchConfig.getAttribute(CBMCDebug.LC_CBMC_LINE, 0));
		marker.setAttribute(IMarker.MESSAGE, launchConfig.getAttribute(CBMCDebug.LC_CBMC_DESCRIPTION, "Failed property"));
		marker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
		marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
	}
	
	private void clearErrorMarker() {
		if (marker == null)
			return;

		try {
			marker.delete();
		} catch (CoreException e) {
			// TODO we could log
		}
	}
	
	private String getJavaLocation() {
		String javaHome = System.getProperty("java.home");
		String javaLocation = null;
		if (javaHome != null)
			javaLocation = javaHome + "/bin/java";
		else 
			javaLocation = "java";
		return javaLocation;
	}
	
	private String[] getCommandLine() {
		ArrayList<String> cli = new ArrayList<>();
		cli.add(getJavaLocation());
		cli.add("-classpath");
		cli.add(new PathsUtils().getClasspath());
		cli.add("main.TraceDebugger");
		try {
			cli.add(launchConfig.getAttribute(ICDTLaunchConfigurationConstants.ATTR_PROGRAM_NAME, (String) null));
		} catch (CoreException e) {
			//Can't happen
		}
		
		logger.log(Level.INFO, "Backend CLI: " + cli);
		return cli.toArray(new String[cli.size()]);
	}
	
	protected Process launchGDBProcess(String commandLine) throws CoreException {
		createErrorMarker();
        Process proc = null;
		try {
			proc = ProcessFactory.getFactory().exec(getCommandLine());
		} catch (IOException e) {
            String message = "Error while launching command " + commandLine;   //$NON-NLS-1$
            clearErrorMarker();
            throw new CoreException(new Status(IStatus.ERROR, "org.eclipse.cbmc.tracedebugger.launcher", -1, message, e));
		}
		
		return proc;
	}
	
	@Override
	public void shutdown(RequestMonitor requestMonitor) {
		super.shutdown(requestMonitor);
		clearErrorMarker();
	}
}
