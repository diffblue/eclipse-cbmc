package commands;

import infra.MICommand;
import infra.MIOutput;

import java.util.ArrayList;
import java.util.List;

import org.kohsuke.args4j.Option;

import process.Process;
import results.data.Frame;
import results.sync.Done;

public class StackListFrames extends MICommand {
	@Option(name="--thread", required=true)
	int threadId;
	
	@Override
	public MIOutput perform(Process process) {
		int lowerStack = -1;
		int upperStack = -1;
		
		if (arguments.size() == 2) {
			lowerStack = Integer.valueOf(arguments.get(0));
			upperStack = Integer.valueOf(arguments.get(1));
		}

		int numberOfRequestedFrames = Integer.MAX_VALUE;
		if (lowerStack != -1 && upperStack != -1)
			numberOfRequestedFrames = (upperStack - lowerStack) + 1;
		
		List<Frame> result = new ArrayList<Frame>();
		Frame.toFrames(result, process.getThread(threadId).getStack(), 0, numberOfRequestedFrames);
		return new Done(this, "stack", Frame.serializeAsFrameOutput(result), false);
	}
}
