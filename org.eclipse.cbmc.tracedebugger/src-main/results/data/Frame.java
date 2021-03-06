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
package results.data;

import java.util.List;

import process.FunctionExecution;
import trace.Step;

import com.google.gson.Gson;

//https://sourceware.org/gdb/onlinedocs/gdb/GDB_002fMI-Frame-Information.html#GDB_002fMI-Frame-Information
//	frame={level="0",addr="0x\
//			//				0000000100000f36",func="main",args=[{name="argc",value="1"},{name="argv",value="0x7fff5fbff628"}],fi\
//			//				le="../src/H.c",fullname="/Users/estelle/dev/Oxford/target/wokspace/H/src/H.c",line="20"},state="sto\
//			//				pped"}]
public class Frame {
	public String level;
	public String func;
	public String addr;
	public String file;
	public String fullname;
	public String line;

	// Map<String, String> args;

	public Frame() {

	}

	public Frame(Step step, String funcName) {
		func = funcName;

		file = step.getLocation().getFile();
		fullname = file;
		line = String.valueOf(step.getLocation().getLine());

	}

	public Frame(Step step, String funcName, int depth) {
		this(step, funcName);
		level = String.valueOf(depth);
	}

	public static void toFrames(List<Frame> frames, FunctionExecution execution, int lowFrame, int highFrame, int depth) {
		if (execution == null)
			return;

		if (depth > highFrame)
			return;
		
		if (depth >= lowFrame) {
			String funcName = execution.getFunctionName();
			frames.add(new Frame(execution.getCurrentStep(), funcName, depth));
		}
		if (execution.getParent() != null)
			toFrames(frames, execution.getParent(), lowFrame, highFrame, depth+1);
			
	}

	//This method exists because the serialization format of Stack is not standard.
	public static String serializeAsFrameOutput(List<Frame> frames) {
		StringBuilder result = new StringBuilder(200);
		result.append('[');
		for (Frame frame : frames) {
			result.append("frame=");
			result.append(new Gson().toJson(frame));
			result.append(',');
		}
		result.deleteCharAt(result.length() - 1);
		result.append(']');
		return result.toString();
	}
}
