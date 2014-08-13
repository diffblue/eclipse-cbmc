package commands;

import infra.MICommand;
import infra.MIOutput;
import process.Process;
import results.sync.Done;
import results.sync.Error;
import trace.Assignment;

public class VarEvaluateExpression extends MICommand {

	@Override
	public MIOutput perform(Process process) {
		String requestedVar = null;
		
		String[] tokens = parameters.split(" ");            
		if (tokens.length > 1)                              
			return new Error(this, "Too many arguments");    
		requestedVar = tokens[0];                                                                       
		Assignment current = process.getVariableManager().getVariables().get(requestedVar);
		return new Done(this, "value", current.getFullLhsValue());
	}

}
