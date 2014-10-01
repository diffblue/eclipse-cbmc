package org.eclipse.internal.cbmc.tracedebugger.launcher;

import org.eclipse.cdt.debug.core.ICDTLaunchConfigurationConstants;
import org.eclipse.cdt.debug.mi.core.IMILaunchConfigurationConstants;
import org.eclipse.cdt.dsf.gdb.IGDBLaunchConfigurationConstants;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;

public class CBMCDebug {

	public void launchDebugger(String traceLocation, String functionToStopAt, String cause, String sourceFile) throws CoreException {
		ILaunchManager launchMgr = DebugPlugin.getDefault().getLaunchManager();
		ILaunchConfigurationType lct = launchMgr.getLaunchConfigurationType("org.eclipse.cbmc.debug.CBMCDebugLaunchConfiguration");
		ILaunchConfigurationWorkingCopy newLC = lct.newInstance(null, "Debug counterexample");
		configureLaunchConfiguration(newLC, functionToStopAt, traceLocation);
		DebugUITools.launch(newLC, ILaunchManager.DEBUG_MODE);
		newLC.delete();
	}
	
	private void configureLaunchConfiguration(ILaunchConfigurationWorkingCopy launch, String functionToStopAt, String traceLocation) {
		launch.setAttribute(IMILaunchConfigurationConstants.ATTR_DEBUG_NAME,"cbmc-mi");
		launch.setAttribute(IMILaunchConfigurationConstants.ATTR_GDB_INIT, ".gdbinit");
		launch.setAttribute(IMILaunchConfigurationConstants.ATTR_DEBUGGER_COMMAND_FACTORY, "org.eclipse.cdt.debug.mi.core.standardCommandFactory");
		launch.setAttribute(IMILaunchConfigurationConstants.ATTR_DEBUGGER_VERBOSE_MODE, false);
		launch.setAttribute(IGDBLaunchConfigurationConstants.ATTR_DEBUG_NAME,"/eclipse/cbmc-mi");
		launch.setAttribute(IGDBLaunchConfigurationConstants.ATTR_DEBUGGER_DEBUG_ON_FORK,false);
		launch.setAttribute(IGDBLaunchConfigurationConstants.ATTR_GDB_INIT,".gdbinit");
		launch.setAttribute(IGDBLaunchConfigurationConstants.ATTR_DEBUGGER_NON_STOP, false);
		launch.setAttribute(IGDBLaunchConfigurationConstants.ATTR_DEBUGGER_REVERSE,true);
		launch.setAttribute(IGDBLaunchConfigurationConstants.ATTR_DEBUGGER_UPDATE_THREADLIST_ON_SUSPEND,false);
		launch.setAttribute(ICDTLaunchConfigurationConstants.ATTR_BUILD_BEFORE_LAUNCH, ICDTLaunchConfigurationConstants.BUILD_BEFORE_LAUNCH_DISABLED);
		launch.setAttribute(ICDTLaunchConfigurationConstants.ATTR_DEBUGGER_ID,"cbmc-mi");
		launch.setAttribute(ICDTLaunchConfigurationConstants.ATTR_DEBUGGER_START_MODE, ICDTLaunchConfigurationConstants.DEBUGGER_MODE_RUN);
		launch.setAttribute(ICDTLaunchConfigurationConstants.ATTR_DEBUGGER_STOP_AT_MAIN, true);
		launch.setAttribute(ICDTLaunchConfigurationConstants.ATTR_DEBUGGER_STOP_AT_MAIN_SYMBOL, functionToStopAt != null? functionToStopAt : null);
		launch.setAttribute(ICDTLaunchConfigurationConstants.ATTR_PROGRAM_NAME, traceLocation);
		launch.setAttribute(ICDTLaunchConfigurationConstants.ATTR_USE_TERMINAL,false);
	}
}
