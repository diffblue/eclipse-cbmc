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
package commands;

import org.eclipse.emf.common.util.EList;
import org.kohsuke.args4j.Option;

import infra.MICommand;
import infra.MIOutput;
import process.Process;
import process.Thread;
import results.data.MIThread;
import results.data.MIThreadGroup;
import results.sync.Done;
import results.sync.Error;

public class ListThreadGroups extends MICommand {
	@Option(name="--available")
	boolean available;
	
	@Override
	public MIOutput perform(Process process) {
		if (arguments.size() == 0 || available) {
			MIThreadGroup threadGroup = new MIThreadGroup();
			threadGroup.id = process.getGroupThreadId();  
			threadGroup.pid = process.getProcessNumber();
			threadGroup.type = "process";
			threadGroup.executable = process.getExecutableName();
			return new Done(this, "groups", new Object[] {threadGroup});
		}
		
		if (!process.isStarted())
			return new Error(this, "Application not started. Can't fetch data now");
		
		if (process.getGroupThreadId().equals(arguments.get(0))) {
			EList<Thread> activeThreads = process.getActiveThreads();
			MIThread[] activeThreadsResponse = new MIThread[activeThreads.size()];
			int i = 0;
			for (Thread thread : activeThreads) {
				activeThreadsResponse[i] = new MIThread(thread);
			}
			return new Done(this, "threads", activeThreadsResponse);
		}
		return new Error(this, "Unsupported command option or unmatched parameter ");
	}
}
