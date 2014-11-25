package commands;

import infra.MICommand;
import infra.MIOutput;

import org.kohsuke.args4j.Option;

import process.Process;
import results.sync.Done;
import trace.Value;

public class VarEvaluateExpression extends MICommand {
	@Option(name="-f")
	String format;
	
	@Override
	public MIOutput perform(Process process) {
		String expression = arguments.get(0);
		Value v = process.getVariableManager().getValue(expression);
		return new Done(this, "value", v);
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
