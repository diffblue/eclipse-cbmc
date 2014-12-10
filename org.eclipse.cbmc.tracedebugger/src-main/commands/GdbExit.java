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

import process.Process;
import results.sync.Done;
import infra.MICommand;
import infra.MIOutput;

public class GdbExit extends MICommand {

	@Override
	public MIOutput perform(Process process) {
		return new Done(this);
	}

}
