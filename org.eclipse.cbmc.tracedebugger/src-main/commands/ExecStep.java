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

import org.kohsuke.args4j.Option;

import process.Process;
import process.StepGoal;
import process.StepResult;
import process.SteppingResult;
import results.async.BreakpointHit;
import results.async.EndSteppingRange;
import results.async.Running;
import results.data.Frame;

public class ExecStep extends MICommand {
	@Option(name = "--thread", required = true)
	int threadId = 0;
	
	@Override
	public MIOutput perform(Process process) {
		//Step in the model
		process.Thread thread = process.getThread(threadId);
		StepResult stepResult = thread.step(StepGoal.ENTER_OR_NEXT_LINE);
		
		//Build result
		Frame currentFrame = new Frame(thread.getStack().getCurrentStep(), thread.getStack().getFunctionName());
		MIOutput result = null;
		if (stepResult.getCode().equals(SteppingResult.BREAKPOINT_HIT)) {
			BreakpointHit hit = new BreakpointHit();
			hit.bkptno = stepResult.getBreakpoint().getId();
			hit.disp = "del";
			hit.frame = currentFrame;
			hit.stoppedThreads = "all";
			hit.threadId = String.valueOf(threadId);
			result = hit;
		} else {
			EndSteppingRange endRange = new EndSteppingRange();
			endRange.frame = currentFrame;
			endRange.stoppedThreads="all";
			endRange.threadId=String.valueOf(process.getActiveThreads().get(0).getId());
			result = endRange;
		}
		Running running = new Running();
		running.threadId = "all";
		
		return new CompositeOutput(this, new results.sync.Running(this), running, result); 
	}
}
