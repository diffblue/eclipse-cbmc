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
package infra;

import process.Process;
import results.sync.Done;
import results.sync.Error;


public class NoOpCommand extends MICommand {

	@Override
	//Override argument parsing since we don't care at all about these commands
	//so we would not want to be bothered by args4j complaining about unknown arguments
	public Error parseParameters(String[] parameters) {
		return null;
	}
	
	@Override
	public MIOutput perform(Process process) {
		return new Done(this);
	}

}
