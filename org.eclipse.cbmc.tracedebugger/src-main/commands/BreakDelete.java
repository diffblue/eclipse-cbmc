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
import results.sync.Done;

public class BreakDelete extends MICommand {

	public MIOutput perform(Process process) {
		for (String toRemove : arguments) {
			process.Breakpoint bkpt = process.getBreakpointManager().getBreakpointsById().get(toRemove);
			if(bkpt != null){
				process.getBreakpointManager().getBreakpointsByLocation().remove(bkpt);
				process.getBreakpointManager().getBreakpointsById().remove(bkpt);
			}
		}
		return new Done(this, "bkpt", null);			
	}
	
	@Override
	protected int getMinimalNumberOfArguments() {
		return 1;
	}
}

