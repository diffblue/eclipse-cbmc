package commands;

import infra.MICommand;
import infra.MIOutput;
import process.Process;
import results.sync.Done;

public class BreakDelete extends MICommand {

	public MIOutput perform(Process process) {
		for (String toRemove : arguments) {
			process.Breakpoint bkpt = process.getBreakpointManager().getBreakpointsById().get(toRemove);
			if(bkpt != null){
				process.getBreakpointManager().getBreakpointsByLocation().remove(bkpt);
				process.getBreakpointManager().getBreakpointsById().remove(bkpt);
			}
		}
		return new Done(this, "bkpt", null);			
	}
	
	@Override
	protected int getMinimalNumberOfArguments() {
		return 1;
	}
}

