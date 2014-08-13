package commands;

import process.Process;
import results.sync.Done;
import results.sync.Error;
import infra.MICommand;
import infra.MIOutput;

public class StackInfoDepth extends MICommand {

	@Override
	public MIOutput perform(Process process) {
		//31-stack-info-depth --thread 0 11
		//We ignore the depth attribute because it is not interesting
		String[] tokens = parameters.split(" ");
		int threadId = 0;
		if (tokens.length < 2)
			return new Error(this, "Missing arguments");
		
		if (tokens[0].equals("--thread"))
			threadId = Integer.valueOf(tokens[1]);
		
		int realDepth = process.getThread(threadId).getStackDepth();
		return new Done(this, "depth", String.valueOf(realDepth), true);
	}

}
