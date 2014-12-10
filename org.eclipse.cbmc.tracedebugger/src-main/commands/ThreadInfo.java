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

import infra.MICommand;
import infra.MIOutput;
import process.Process;
import results.data.MIThread;
import results.sync.Done;

//32-thread-info 1
public class ThreadInfo extends MICommand {
	
	@Override
	public MIOutput perform(Process process) {
		process.Thread currentThread = process.getThread(Integer.valueOf(arguments.get(0)));
		MIThread mi = new MIThread(currentThread);
		return new Done(this, "threads", new MIThread[] {mi});
	}

	protected int getMinimalNumberOfArguments() {
		return 1;
	}
}
