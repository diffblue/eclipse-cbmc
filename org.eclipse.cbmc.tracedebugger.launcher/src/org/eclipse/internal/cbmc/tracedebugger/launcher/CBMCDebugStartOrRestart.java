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
package org.eclipse.internal.cbmc.tracedebugger.launcher;

import java.util.Map;

import org.eclipse.cdt.dsf.concurrent.DataRequestMonitor;
import org.eclipse.cdt.dsf.concurrent.DsfExecutor;
import org.eclipse.cdt.dsf.concurrent.RequestMonitor;
import org.eclipse.cdt.dsf.debug.service.IRunControl.IContainerDMContext;
import org.eclipse.cdt.dsf.gdb.service.StartOrRestartProcessSequence_7_0;

public class CBMCDebugStartOrRestart extends StartOrRestartProcessSequence_7_0 {
	public CBMCDebugStartOrRestart(DsfExecutor executor,
			IContainerDMContext containerDmc, Map<String, Object> attributes,
			boolean restart, DataRequestMonitor<IContainerDMContext> rm) {
		super(executor, containerDmc, attributes, restart, rm);
	}

	@Override
	@Execute
	public void stepCreateConsole(RequestMonitor rm) {
		rm.done();
		return;
	}
}
