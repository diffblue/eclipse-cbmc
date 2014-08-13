package org.eclipse.internal.cbmc.tracedebugger.launcher;

import java.io.File;

import org.eclipse.cdt.debug.core.ICDTLaunchConfigurationConstants;
import org.eclipse.cdt.dsf.debug.service.IDsfDebugServicesFactory;
import org.eclipse.cdt.dsf.gdb.launching.GdbLaunchDelegate;
import org.eclipse.cdt.dsf.gdb.service.GdbDebugServicesFactory;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.debug.core.ILaunchConfiguration;

public class CBMCDebugLaunchDelegate extends GdbLaunchDelegate {
	protected IDsfDebugServicesFactory newServiceFactory(ILaunchConfiguration config, String version) {
		return new CBMCDebugServiceFactory(version);
	}
	
	@Override
	protected IPath checkBinaryDetails(ILaunchConfiguration config) throws CoreException {
		verifyCProject(config);
		verifyTraceFile(config);
		return null;
	}

	private void verifyTraceFile(ILaunchConfiguration config) throws CoreException {
		String traceFile = config.getAttribute(ICDTLaunchConfigurationConstants.ATTR_PROGRAM_NAME, (String) null);
		if (!new File(traceFile).exists())
			abort("Trace file " +  traceFile + "could not be found", null, 1000);
	}
	
	@Override
	protected String getGDBVersion(ILaunchConfiguration config)
			throws CoreException {
		return GdbDebugServicesFactory.GDB_7_7_VERSION;
	}
	
}
