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
import infra.VarHelpers;

import java.util.Collections;
import java.util.List;

import process.Process;
import results.sync.Done;
import trace.Assignment;

// 47^done,changelist=[{name="var1",value="3",in_scope="true",type_changed="false",has_more="0"\
// for structs - [{name="var3.x",value="1",in_scope="true",type_changed="false",has_more="\0"}]
public class VarUpdate extends MICommand {
	
	@Override
	public MIOutput perform(Process process) {                                                       
		String expression = arguments.get(1);          
		if ("*".equals(expression))
			return new results.sync.Error(this, "The * parameter is not supported");
		
		String requestedVariable = VarHelpers.getVariableName(expression);
		Assignment previousAssignment = process.getVariableManager().getAssignment(requestedVariable);
		Assignment newAssignement = VarHelpers.getAssignment(process, previousAssignment.getBaseName(), previousAssignment.getThread(), 0);
		List<Object> changes = null;
		if (previousAssignment == newAssignement) {
			changes = Collections.emptyList();
		} else {
			changes = newAssignement.getValue().compare(requestedVariable, previousAssignment.getValue());
			process.getVariableManager().getPreviousValues().put(requestedVariable, newAssignement);
			process.getVariableManager().getVariables().put(requestedVariable, newAssignement);
		}
		return new Done(this, "changelist", changes);
	}

	@Override
	protected int getMinimalNumberOfArguments() {
		return 2;
	}
}
