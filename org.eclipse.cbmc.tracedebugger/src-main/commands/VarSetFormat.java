package commands;

import infra.MICommand;
import infra.MIOutput;
import process.Process;
import results.data.Vars;
import results.sync.Done;
import results.sync.Error;
import trace.Assignment;

//This command does implement the format change.
//It just returns the value as is.
public class VarSetFormat extends MICommand {

//	48-var-set-format var4 natural
//	48^done,format="natural",value="0"
	
	@Override
	public MIOutput perform(Process process) {
		String requestedVar = null;
		
		String[] tokens = parameters.split(" ");            
		if (tokens.length < 2)                              
			return new Error(this, "Missing arguments");    
		                                                                       
		requestedVar = tokens[0];          
		String newFormat = tokens[1];
		
		Assignment currentAssignemt = process.getVariableManager().getVariables().get(requestedVar);
		Vars v = new Vars();
		v.value = currentAssignemt.getFullLhsValue();
		v.format = newFormat;
		
		return new Done(this, v);
	}

}
