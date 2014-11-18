package commands;

import org.kohsuke.args4j.Option;

import infra.CompositeOutput;
import infra.MICommand;
import infra.MIOutput;
import infra.StringOutput;
import process.Breakpoint;
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
			hit.bkptno = ((Breakpoint) startReturnCode.getObject()).getId();
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
		
		return new CompositeOutput(result, new results.sync.Running(this), running, startReturnCodeAsMIOuput); 
	}
}
