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

import infra.CompositeOutput;
import infra.MICommand;
import infra.MIOutput;
import infra.StringOutput;

import org.kohsuke.args4j.Option;

import process.Process;
import process.StepResult;
import process.SteppingResult;
import results.async.BreakpointHit;
import results.async.EndSteppingRange;
import results.async.Running;
import results.data.Frame;

// 645,360 25-exec-run --thread-group i1
// 645,362 =thread-group-started,id="i1",pid="7234"
// 645,363 =thread-created,id="1",group-id="i1
// 645,483 25^running
public class ExecRun extends MICommand {
	@Option(name="--thread-group", required = true)
	private String threadGroup = null;

	@Override
	public MIOutput perform(Process process) {
		StepResult startReturnCode = process.start();
		
		process.Thread newThread = process.getActiveThreads().get(0);
		String groupStarted = "=thread-group-started,id=\"" + process.getGroupThreadId() + "\",pid=\"" + process.getProcessNumber() + "\"";
		String threadCreated = "=thread-created,id=\"" + newThread.getId() + "\",group-id=\"" + process.getGroupThreadId() + "\"";
		StringOutput result = new StringOutput(groupStarted, threadCreated);

		Frame currentFrame = new Frame(newThread.getStack().getCurrentStep(), newThread.getStack().getFunctionName());
		MIOutput startReturnCodeAsMIOuput = null;
		if (startReturnCode.getCode().equals(SteppingResult.BREAKPOINT_HIT)) {
			BreakpointHit hit = new BreakpointHit();
			hit.bkptno = startReturnCode.getBreakpoint().getId();
			hit.disp = "del";
			hit.frame = currentFrame;
			hit.stoppedThreads = "all";
			hit.threadId = String.valueOf(newThread.getId());
			startReturnCodeAsMIOuput = hit;
		} else {
			EndSteppingRange endRange = new EndSteppingRange();
			endRange.frame = currentFrame;
			endRange.stoppedThreads="all";
			endRange.threadId=String.valueOf(process.getActiveThreads().get(0).getId());
			startReturnCodeAsMIOuput = endRange;
		}
		Running running = new Running();
		running.threadId = "all";
		
		return new CompositeOutput(this, result, new results.sync.Running(this), running, startReturnCodeAsMIOuput); 
	}
}
