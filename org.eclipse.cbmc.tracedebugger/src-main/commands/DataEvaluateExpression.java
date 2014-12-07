package commands;

import infra.MICommand;
import infra.MIOutput;
import infra.VarHelpers;

import org.kohsuke.args4j.Option;

import process.Process;
import results.data.Vars;
import results.sync.Done;
import trace.Assignment;
import trace.Value;

public class DataEvaluateExpression extends MICommand {
	@Option(name="--thread", required=true)
	int threadId = 0;
	
	@Option(name="--frame", required=false)
	int frameId;
	
			
			
	@Override
	public MIOutput perform(Process process) {
		final String expression = arguments.get(0);
		Assignment match = VarHelpers.getAssignment(process, expression, threadId, frameId);
		
		Value value = match.getValue();
		
		Vars v = new Vars();
		v.value = value.getUserFriendlyRepresentation(true);
		return new Done(this, v);
	}

}
