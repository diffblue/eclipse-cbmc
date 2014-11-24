package commands;

import infra.MICommand;
import infra.MIOutput;
import process.Process;
import results.sync.Done;
import trace.Assignment;

//61-var-info-path-expression var2.x
//61^done,path_expr="(s).x"
public class VarInfoPathExpression extends MICommand {
	@Override
	public MIOutput perform(Process process) {
		String expression = arguments.get(0);
		String requestedVariable = VarUpdate.getVariableName(expression);
		Assignment current = process.getVariableManager().getVariables().get(requestedVariable);
		expression = VarUpdate.resolveInternalVariableName(current, expression);
		return new Done(this, "path_expr", current.getExpression(expression));
	}
	
	@Override
	protected int getMinimalNumberOfArguments() {
		return 1;
	}
	
	@Override
	protected int getMaximumNumberOfArguments() {
		return 1;
	}
}
