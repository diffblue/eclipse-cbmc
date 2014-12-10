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

import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import infra.MIAsync;

public abstract class MIStopped extends MIAsync {
	String reason;
	public @SerializedName("thread-id") String threadId;
	public @SerializedName("stopped-threads") String stoppedThreads;
	
	@Override
	public List<String> serialize() {
		String jsonRepresentation = new Gson().toJson(this);
		//strip first { and last }
		return Arrays.asList("*stopped," + jsonRepresentation.subSequence(1,jsonRepresentation.length()-1));
	}
}
