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

import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

import process.Process;
import results.sync.Error;

public abstract class MICommand {
	protected String id;
	
	@Argument
	protected List<String> arguments = new ArrayList<String>();

	public String getId() {
		return id;
	}

	public Error initialize(String id, String parameters) {
		this.id = id;
		return parseParameters(parameters.length() == 0 ? new String[0] : parameters.split(" "));
	}

	public int checkArgumentsCount() {
		if (arguments.size() < getMinimalNumberOfArguments())
			return -1;
		if (arguments.size()> getMaximumNumberOfArguments())
			return +1;
		return 0;
			
	}
	
	public results.sync.Error parseParameters(String[] parameters) {
		CmdLineParser parser = new CmdLineParser(this);
		try {
			parser.parseArgument(parameters);
			int status = checkArgumentsCount();
			if (status < 0)
				return new results.sync.Error(this, "Too few arguments");
			if (status > 0)
				return new results.sync.Error(this, "Too many arguments");
		} catch (CmdLineException e) {
			return new results.sync.Error(this, e.getMessage());
		}
		return null;
	}
	
	protected int getMinimalNumberOfArguments() {
		return Integer.MIN_VALUE;
	}
	
	protected int getMaximumNumberOfArguments() {
		return Integer.MAX_VALUE;
	}
	
	public abstract MIOutput perform(Process process);
}
