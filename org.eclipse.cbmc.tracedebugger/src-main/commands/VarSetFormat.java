package commands;

import infra.MICommand;
import infra.MIOutput;
import process.Process;
import results.data.Vars;
import results.sync.Done;
import trace.Assignment;

//This command does implement the format change.
//It just returns the value as is.

//	48-var-set-format var4 natural
//	48^done,format="natural",value="0"
public class VarSetFormat extends MICommand {
	
	@Override
	public MIOutput perform(Process process) {                                                            
		String requestedVar = arguments.get(0);          
		String newFormat = arguments.get(1);
		
		Assignment currentAssignemt = process.getVariableManager().getVariables().get(requestedVar);
		Vars v = new Vars();
		v.value = currentAssignemt.getValue(VarUpdate.resolveInternalVariableName(currentAssignemt, requestedVar)).getUserFriendlyRepresentation(false);
		v.format = newFormat;
		
		return new Done(this, v);
	}

	@Override
	protected int getMinimalNumberOfArguments() {
		return 2;
	}
}
