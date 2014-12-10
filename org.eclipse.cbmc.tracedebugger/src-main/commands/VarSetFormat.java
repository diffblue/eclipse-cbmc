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
import results.data.Vars;
import results.sync.Done;

//This command does implement the format change.
//It just returns the value as is.

//	48-var-set-format var4 natural
//	48^done,format="natural",value="0"
public class VarSetFormat extends MICommand {
	
	@Override
	public MIOutput perform(Process process) {                                                            
		String expression = arguments.get(0);          
		String newFormat = arguments.get(1);
		
		Vars v = new Vars();
		v.value = process.getVariableManager().getValue(expression).getUserFriendlyRepresentation(false);
		v.format = newFormat;
		
		return new Done(this, v);
	}

	@Override
	protected int getMinimalNumberOfArguments() {
		return 2;
	}
}
