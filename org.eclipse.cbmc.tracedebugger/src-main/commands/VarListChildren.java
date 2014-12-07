package commands;

import infra.MICommand;
import infra.MIOutput;

import org.eclipse.emf.common.util.EList;

import process.Process;
import results.data.Vars;
import results.sync.Done;
import results.sync.Error;
import trace.Value;

//var-list-children var2
//numchild="3",children=[child={name="var2.x",exp="x",numchild="0",type="int",thread-id="1"},child={name="var2.y",exp="y",numchild="0",type="int",thread-id="1"},child={name="var2.z",exp=\"z",numchild="0",type="int",thread-id="1"}],has_more="0"
//42^done,children=[child={name="var1.x",type="int",numchild="0",thread-id="0",exp="x"},child={name="var1.y",type="int",numchild="0",thread-id="0",exp="y"}], numchild="2",has_more="0" 
public class VarListChildren extends MICommand {
	@Override
	public MIOutput perform(Process process) {
		final String requestedExpression = arguments.get(0);
		Value value = process.getVariableManager().getAssignment(requestedExpression).getValue();
		EList<Object> children = value.listChildren(requestedExpression);
		if (children == null)
			return new Error(this, "Variable does not have children");

		return new Done(this, buildAnswer(String.valueOf(children.size()), "0",children));
	}
	
	private String buildAnswer(String numchild, String has_more, EList<Object> children) {
		return "numchild=\"" + numchild + "\",children=" +   Vars.serializeAsChildrenList(children) + ",has_more=\"" + has_more + "\"";
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
