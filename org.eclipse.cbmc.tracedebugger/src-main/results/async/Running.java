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
import infra.MIAsync;

import java.util.Arrays;
import java.util.List;


public class Running extends MIAsync {
	public String threadId;
	
	@Override
	public List<String> serialize() {
		return Arrays.asList("*running,thread-id=\"" + threadId + '"');
	}

}
