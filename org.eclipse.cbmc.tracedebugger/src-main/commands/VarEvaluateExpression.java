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
import trace.Value;

public class VarEvaluateExpression extends MICommand {
	@Option(name="-f")
	String format;
	
	@Override
	public MIOutput perform(Process process) {
		String expression = arguments.get(0);
		Value v = process.getVariableManager().getValue(expression);
		return new Done(this, "value", v.getUserFriendlyRepresentation(false));
	}
	
	@Override
	protected int getMinimalNumberOfArguments() {
		return 1;
	}
	
	@Override
	protected int getMaximumNumberOfArguments() {
		return 1;
	}
}
