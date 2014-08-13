package commands;

import infra.CompositeOutput;
import infra.MICommand;
import infra.MIOutput;
import process.Breakpoint;
import process.Process;
import process.StepResult;
import process.SteppingResult;
import process.impl.FunctionExecutionImpl;
import results.async.BreakpointHit;
import results.async.EndSteppingRange;
import results.async.Running;
import results.data.Frame;
import results.sync.Error;

public class ExecNext extends MICommand {

	@Override
	public MIOutput perform(Process process) {
		int threadId = 0;
		
		String[] tokens = parameters.split(" ");
		if (tokens.length < 2)
			return new Error(this, "Missing arguments");
		
		if (tokens[0].equals("--thread"))
			threadId = Integer.valueOf(tokens[1]);
		
		//TODO we don't deal with the last argument
		
		//Step in the model
		process.Thread thread = process.getThread(threadId);
		StepResult stepResult = thread.step(FunctionExecutionImpl.NEXT_LINE);
		
		//Build result
		Frame currentFrame = new Frame(thread.getStack().getCurrentStep(), thread.getStack().getFunctionName());
		MIOutput result = null;
		if (stepResult.getCode().equals(SteppingResult.BREAKPOINT_HIT)) {
			BreakpointHit hit = new BreakpointHit();
			hit.bkptno = ((Breakpoint) stepResult.getObject()).getId();
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
		
		return new CompositeOutput(new results.sync.Running(this), running, result); 
	}
	
}
