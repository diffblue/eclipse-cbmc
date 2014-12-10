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

import org.eclipse.cdt.dsf.debug.service.IProcesses;
import org.eclipse.cdt.dsf.gdb.service.GdbDebugServicesFactoryNS;
import org.eclipse.cdt.dsf.mi.service.IMIBackend;
import org.eclipse.cdt.dsf.service.DsfSession;
import org.eclipse.debug.core.ILaunchConfiguration;

public class CBMCDebugServiceFactory extends GdbDebugServicesFactoryNS {

	public CBMCDebugServiceFactory(String version) {
		super(version);
	}

	@Override
	protected IMIBackend createBackendGDBService(DsfSession session, ILaunchConfiguration lc) {
		return new CBMCDebugBackend(session, lc);
	}
	
	@Override
	//We override the process service in order to avoid the creation of the Inferior process.
	//If we used the normal code, the inferior process would cause us problem to terminate the debugging session
	protected IProcesses createProcessesService(DsfSession session) {
		return new CBMCDebugProcesses(session);
	}
}
