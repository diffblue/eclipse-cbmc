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

//31-stack-info-depth --thread 0 11
public class StackInfoDepth extends MICommand {
	@Option(name="--thread", required=true)
	int threadId;
	
	@Override
	public MIOutput perform(Process process) {
		//We ignore the depth attribute because it is not interesting
		
		int realDepth = process.getThread(threadId).getStackDepth();
		return new Done(this, "depth", String.valueOf(realDepth), true);
	}

}
