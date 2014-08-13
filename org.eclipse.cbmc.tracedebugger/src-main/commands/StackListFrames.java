package commands;

import infra.MICommand;
import infra.MIOutput;

import java.util.ArrayList;
import java.util.List;

import process.Process;
import results.data.Frame;
import results.sync.Done;
import results.sync.Error;

public class StackListFrames extends MICommand {

	@Override
	public MIOutput perform(Process process) {
		//stack-list-frames
		int threadId = 0;
		int lowerStack = -1;
		int upperStack = -1;
		
		String[] tokens = parameters.split(" ");
		if (tokens.length < 2)
			return new Error(this, "Missing arguments");
		
		if (tokens[0].equals("--thread"))
			threadId = Integer.valueOf(tokens[1]);

		if (tokens.length == 4) {
			lowerStack = Integer.valueOf(tokens[2]);
			upperStack = Integer.valueOf(tokens[3]);
		}

		int numberOfRequestedFrames = Integer.MAX_VALUE;
		if (lowerStack != -1 && upperStack != -1)
			numberOfRequestedFrames = (upperStack - lowerStack) + 1;
		
		List<Frame> result = new ArrayList<Frame>();
		Frame.toFrames(result, process.getThread(threadId).getStack(), 0, numberOfRequestedFrames);
		return new Done(this, "stack", Frame.serializeAsFrameOutput(result), false);
	}

}
