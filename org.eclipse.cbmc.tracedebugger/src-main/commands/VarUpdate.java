package commands;

import infra.MICommand;
import infra.MIOutput;
import process.Process;
import results.data.Vars;
import results.sync.Done;
import trace.Assignment;
import trace.impl.AssignmentImpl;

//		47^done,changelist=[{name="var1",value="3",in_scope="true",type_changed="false",has_more="0"\
public class VarUpdate extends MICommand {
	
	//Take an internal variable name (e.g. var1) and replace it by its real name
	public static String resolveInternalVariableName(Assignment assignment, String expression) {
		String[] segments = AssignmentImpl.splitInTwo(expression);
		return expression.replaceFirst(segments[0], assignment.getBaseName());
	}
	
	public static String getVariableName(String expression) {
		return AssignmentImpl.splitInTwo(expression)[0];
	}
	
	@Override
	public MIOutput perform(Process process) {                                                       
		String expression = arguments.get(1);          
		if ("*".equals(expression))
			return new results.sync.Error(this, "The * parameter is not supported");
		
		String requestedVariable = getVariableName(expression);
		Assignment previousAssignment = process.getVariableManager().getVariables().get(requestedVariable);
		Assignment newAssignement = process.getThread(previousAssignment.getThread()).getFrame(0).getVariable(previousAssignment.getBaseName());
		Vars[] changes = null;
		if (previousAssignment == newAssignement) {
			changes = new Vars[0];
		} else {
			expression = resolveInternalVariableName(previousAssignment, expression);
			changes = new Vars[1];
			changes[0] = new Vars();
			changes[0].name = newAssignement.getBaseName();
			changes[0].value = newAssignement.getValue(expression).getUserFriendlyRepresentation();
			changes[0].in_scope = "true";
			boolean typeChanged = newAssignement.getType().equals(previousAssignment.getType());
			if (!typeChanged) {
				changes[0].type_changed = Boolean.TRUE.toString();
				changes[0].new_type = newAssignement.getType();
			} else {
				changes[0].type_changed = Boolean.FALSE.toString();
			}
			changes[0].has_more = "0";
			process.getVariableManager().getPreviousValues().put(requestedVariable, newAssignement);
			process.getVariableManager().getVariables().put(requestedVariable, newAssignement);
		}
		return new Done(this, "changelist", changes);
	}

	@Override
	protected int getMinimalNumberOfArguments() {
		return 2;
	}
}
