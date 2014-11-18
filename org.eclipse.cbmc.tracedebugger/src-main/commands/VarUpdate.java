package commands;

import infra.MICommand;
import infra.MIOutput;
import process.Process;
import results.data.Vars;
import results.sync.Done;
import trace.Assignment;

//		47^done,changelist=[{name="var1",value="3",in_scope="true",type_changed="false",has_more="0"\
public class VarUpdate extends MICommand {
	
	@Override
	public MIOutput perform(Process process) {                                                         
		String requestedVar = arguments.get(1);          
		                                                    
		Assignment previousAssignment = process.getVariableManager().getVariables().get(requestedVar);
		Assignment previousValue = previousAssignment;
		Assignment newAssignement = process.getThread(previousAssignment.getThread()).getFrame(0).getVariable(previousAssignment.getBaseName());
		Vars[] changes = null;
		if (previousAssignment == newAssignement) {
			changes = new Vars[0];
		} else {
			changes = new Vars[1];
			changes[0] = new Vars();
			changes[0].name = requestedVar;
			changes[0].value = newAssignement.getFullLhsValue();
			changes[0].in_scope = "true";
			changes[0].type_changed = newAssignement.getType().equals(previousValue.getType()) ? Boolean.TRUE.toString() : Boolean.FALSE.toString();
			changes[0].has_more = "0";
			process.getVariableManager().getPreviousValues().put(requestedVar, newAssignement);
			process.getVariableManager().getVariables().put(requestedVar, newAssignement);
		}
		return new Done(this, "changelist", changes);
	}

	@Override
	protected int getMinimalNumberOfArguments() {
		return 2;
	}
}
