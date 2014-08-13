package infra;

import process.Process;
import results.sync.Done;


public class NoOpCommand extends MICommand {

	@Override
	public MIOutput perform(Process process) {
		return new Done(this);
	}

}
