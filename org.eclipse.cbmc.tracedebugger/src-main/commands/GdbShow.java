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
import org.kohsuke.args4j.Option;

import infra.MICommand;
import infra.MIOutput;
import process.Process;
import results.sync.Done;


public class GdbShow extends MICommand {
	@Option(name="--thread-group")
	String threadGroup;
	
	@Override
	public MIOutput perform(Process process) {
		if (threadGroup != null && arguments.contains("language"))
			return new Done(this, "value", "auto", true);
		return new Done(this);
	}

	@Override
	protected int getMinimalNumberOfArguments() {
		return 1;
	}
}
