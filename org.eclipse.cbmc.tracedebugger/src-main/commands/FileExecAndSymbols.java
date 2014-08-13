package commands;

import infra.MICommand;
import infra.MIOutput;
import process.Process;
import results.sync.Done;
import results.sync.Error;

public class FileExecAndSymbols extends MICommand {

	@Override
	public MIOutput perform(Process process) {
		String groupId = null;

		String[] tokens = parameters.split(" ");
		if (tokens.length < 3)
			return new Error(this, "Missing arguments");
		
		if (tokens[0].equals("--thread-group"))
			groupId = tokens[1];

		process.setGroupThreadId(groupId);
		process.setExecutableName(tokens[2]);
		return new Done(this);
	}

}
