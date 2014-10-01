package org.eclipse.internal.cbmc.tracedebugger.launcher;

import java.util.Map;

import org.eclipse.cdt.dsf.concurrent.DataRequestMonitor;
import org.eclipse.cdt.dsf.concurrent.DsfExecutor;
import org.eclipse.cdt.dsf.concurrent.Sequence;
import org.eclipse.cdt.dsf.debug.service.IRunControl.IContainerDMContext;
import org.eclipse.cdt.dsf.gdb.service.GDBProcesses_7_4;
import org.eclipse.cdt.dsf.service.DsfSession;

public class CBMCDebugProcesses extends GDBProcesses_7_4 {

	public CBMCDebugProcesses(DsfSession session) {
		super(session);
	}

	@Override
	protected Sequence getStartOrRestartProcessSequence(DsfExecutor executor,
			IContainerDMContext containerDmc, Map<String, Object> attributes,
			boolean restart, DataRequestMonitor<IContainerDMContext> rm) {
		return new CBMCDebugStartOrRestart(executor, containerDmc, attributes,
				restart, rm);
	}
}
