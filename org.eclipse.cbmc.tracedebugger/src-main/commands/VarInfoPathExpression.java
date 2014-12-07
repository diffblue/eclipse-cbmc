package commands;

import infra.MICommand;
import infra.MIOutput;
import infra.VarHelpers;
import process.Process;
import results.sync.Done;
import trace.Assignment;

//61-var-info-path-expression var2.x
//61^done,path_expr="(s).x"
public class VarInfoPathExpression extends MICommand {
	@Override
	public MIOutput perform(Process process) {
		String expression = arguments.get(0);
		String[] segments = VarHelpers.splitInTwo(expression);
		Assignment assignment = process.getVariableManager().getAssignment(segments[0]);
		return new Done(this, "path_expr", expression.replace(segments[0], assignment.getBaseName()));
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
