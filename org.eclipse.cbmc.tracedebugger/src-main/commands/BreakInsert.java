package commands;

import org.kohsuke.args4j.Option;

import infra.MICommand;
import infra.MIOutput;
import process.Process;
import process.ProcessFactory;
import results.data.Breakpoint;
import results.sync.Done;

/* 34-break-insert -f /Users/estelle/dev/Oxford/target/wokspace/H/src/variables.c:28
 34^done,bkpt={number="2",type="breakpoint",disp="keep",enabled="y",addr="0x0000000100000f34"\
 ,func="main",file="../src/variables.c",fullname="/Users/estelle/dev/Oxford/target/wokspace/H/src/var\
 iables.c",line="28",thread-groups=["i1"],times="0",original-location="/Users/estelle/dev/Oxford/targ\
 et/wokspace/H/src/variables.c:28"}*/
public class BreakInsert extends MICommand {
	@Option(name="-f")
	boolean fFlag;

	@Option(name="-t")
	boolean tFlag;

	@Option(name="-c")
	String condition;

	public MIOutput perform(Process process) {
		process.Breakpoint bkpt = ProcessFactory.eINSTANCE.createBreakpoint();
		String location = arguments.get(0);
		
		String[] locDetails = location.split(":");
		if (locDetails.length == 2) {
			bkpt.setFile(locDetails[0]);
			bkpt.setLine(locDetails[1]);
		} else { 
			//case dealing with -f <functionName>
			bkpt.setFunctionName(location);
		}
		bkpt.setId(String.valueOf(process.getBreakpointManager().getBreakpointsById().size() + 1));
		bkpt.setEnabled(true);
		process.getBreakpointManager().getBreakpointsByLocation().put(location, bkpt);
		process.getBreakpointManager().getBreakpointsById().put(bkpt.getId(), bkpt);
		
		return new Done(this, "bkpt", new Breakpoint(bkpt));
	}

	@Override
	protected int getMinimalNumberOfArguments() {
		return 1;
	}
}

