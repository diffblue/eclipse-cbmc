package commands;

import infra.MICommand;
import infra.MIOutput;

import org.kohsuke.args4j.Option;

import process.Process;
import results.sync.Done;

public class FileExecAndSymbols extends MICommand {
	@Option(name="--thread-group")
	String groupId = null;
	
	@Override
	public MIOutput perform(Process process) {
		process.setGroupThreadId(groupId);
		process.setExecutableName(arguments.get(0));
		return new Done(this);
	}

	protected int getMinimalNumberOfArguments() {
		return 1;
	}
}
