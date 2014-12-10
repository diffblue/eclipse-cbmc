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

import java.util.ArrayList;
import java.util.List;


public class CompositeOutput extends MIOutput {
	private MICommand command; //This is added in order to help deal with the testing
	private MIOutput[] outputs;

	public CompositeOutput(MICommand command, MIOutput... outputs) {
		this.outputs = outputs;
		this.command = command;
	}
	
	public List<String> serialize() {
		List<String> results = new ArrayList<String>();
		for (MIOutput miOutput : outputs) {
			results.addAll(miOutput.serialize());
		}
		return results;
	}
	
	public MICommand getCommand() {
		return command;
	}
}
