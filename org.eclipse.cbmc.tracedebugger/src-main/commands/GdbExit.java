package commands;

import process.Process;
import results.sync.Done;
import infra.MICommand;
import infra.MIOutput;

public class GdbExit extends MICommand {

	@Override
	public MIOutput perform(Process process) {
		return new Done(this);
	}

}
