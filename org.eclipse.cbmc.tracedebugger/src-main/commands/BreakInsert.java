package commands;

import infra.MICommand;
import infra.MIOutput;
import process.Process;
import process.ProcessFactory;
import results.data.Breakpoint;
import results.sync.Done;

public class BreakInsert extends MICommand {

	public MIOutput perform(Process process) {
		/* 34-break-insert -f /Users/estelle/dev/Oxford/target/wokspace/H/src/variables.c:28
		34^done,bkpt={number="2",type="breakpoint",disp="keep",enabled="y",addr="0x0000000100000f34"\
		,func="main",file="../src/variables.c",fullname="/Users/estelle/dev/Oxford/target/wokspace/H/src/var\
		iables.c",line="28",thread-groups=["i1"],times="0",original-location="/Users/estelle/dev/Oxford/targ\
		et/wokspace/H/src/variables.c:28"}*/
		//	break-insert -f /Users/estelle/dev/Oxford/target/wokspace/AAA/test6.c:7
		String[] tokens = parameters.split(" ");
		process.Breakpoint bkpt = ProcessFactory.eINSTANCE.createBreakpoint();
		int idxLocation = 0;
		if (tokens[0].equals("-f")) {
			idxLocation = 1;
		} else {
			idxLocation = 2;			
		}
		
		String[] locDetails = tokens[idxLocation].split(":");
		if (locDetails.length == 2) {
			bkpt.setFile(locDetails[0]);
			bkpt.setLine(locDetails[1]);
		} else { 
			//case dealing with -f <functionName>
			bkpt.setFunctionName(tokens[idxLocation]);
		}
		bkpt.setId(String.valueOf(process.getBreakpointManager().getBreakpointsById().size() + 1));
		bkpt.setEnabled(true);
		process.getBreakpointManager().getBreakpointsByLocation().put(tokens[idxLocation], bkpt);
		process.getBreakpointManager().getBreakpointsById().put(bkpt.getId(), bkpt);
		
		return new Done(this, "bkpt", new Breakpoint(bkpt));
	}

}

