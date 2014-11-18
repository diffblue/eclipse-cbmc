package commands;

import infra.MICommand;
import infra.MIOutput;
import process.Process;
import results.data.MIThread;
import results.sync.Done;

//32-thread-info 1
public class ThreadInfo extends MICommand {
	
	@Override
	public MIOutput perform(Process process) {
		process.Thread currentThread = process.getThread(Integer.valueOf(arguments.get(0)));
		MIThread mi = new MIThread(currentThread);
		return new Done(this, "threads", new MIThread[] {mi});
	}

	protected int getMinimalNumberOfArguments() {
		return 1;
	}
}
