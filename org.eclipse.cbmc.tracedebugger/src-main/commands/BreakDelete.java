package commands;

import infra.MICommand;
import infra.MIOutput;
import process.Process;
import process.ProcessFactory;
import results.data.Breakpoint;
import results.sync.Done;
import results.sync.Error;

public class BreakDelete extends MICommand {

	public MIOutput perform(Process process) {
	
		String[] tokens = parameters.split(" ");
		if (tokens.length < 1)                              
			return new Error(this, "Missing arguments");    
		String bkptId = String.valueOf(tokens[0]);
		process.Breakpoint bkpt = process.getBreakpointManager().getBreakpointsById().get(bkptId);
		if(bkpt != null){
			process.getBreakpointManager().getBreakpointsByLocation().remove(bkpt);
			process.getBreakpointManager().getBreakpointsById().remove(bkpt);
		}
		return new Done(this, "bkpt", null);
	}

}

