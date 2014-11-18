package commands;
import org.kohsuke.args4j.Option;

import infra.MICommand;
import infra.MIOutput;
import process.Process;
import results.sync.Done;


public class GdbShow extends MICommand {
	@Option(name="--thread-group")
	String threadGroup;
	
	@Override
	public MIOutput perform(Process process) {
		if (threadGroup != null && arguments.contains("language"))
			return new Done(this, "value", "auto", true);
		return new Done(this);
	}

	@Override
	protected int getMinimalNumberOfArguments() {
		return 1;
	}
}
