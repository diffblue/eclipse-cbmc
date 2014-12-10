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

import org.kohsuke.args4j.Option;

import process.Process;
import results.sync.Done;

public class FileExecAndSymbols extends MICommand {
	@Option(name="--thread-group")
	String groupId = null;
	
	@Override
	public MIOutput perform(Process process) {
		process.setGroupThreadId(groupId);
		process.setExecutableName(arguments.get(0));
		return new Done(this);
	}

	protected int getMinimalNumberOfArguments() {
		return 1;
	}
}
