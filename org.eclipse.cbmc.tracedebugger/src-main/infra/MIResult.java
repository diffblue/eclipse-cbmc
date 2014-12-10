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

import com.google.gson.GsonBuilder;

public abstract class MIResult extends MIOutput {
	private MICommand cmd;

	public MIResult(MICommand cmd) {
		this.cmd = cmd;
	}
	
	protected String toJson(Object o) {
		return new GsonBuilder().disableHtmlEscaping().create().toJson(o);
	}
	
	public MICommand getCommand() {
		return cmd;
	}
}
