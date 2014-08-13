package infra;

import process.Process;

public class UnknownCommand extends MICommand {

	@Override
	public MIOutput perform(Process process) {
		return new results.sync.Error(this, "unsupported command");
	}

}
