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
package results.async;

import results.data.Frame;

public class BreakpointHit extends MIStopped {
	public String disp;
	public String bkptno;
	public Frame frame;

	public BreakpointHit() {
		reason = "breakpoint-hit";
	}
}
