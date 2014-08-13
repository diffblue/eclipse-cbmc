package commands;

import infra.MICommand;
import infra.MIOutput;
import process.Process;
import results.data.MIThread;
import results.sync.Done;

public class ThreadInfo extends MICommand {

	@Override
	public MIOutput perform(Process process) {
		//32-thread-info 1
		process.Thread currentThread = process.getThread(Integer.valueOf(parameters));
		MIThread mi = new MIThread(currentThread);
		return new Done(this, "threads", new MIThread[] {mi});
	}

}
