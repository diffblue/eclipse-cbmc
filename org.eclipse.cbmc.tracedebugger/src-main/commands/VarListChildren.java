package commands;

import infra.MICommand;
import infra.MIOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EMap;

import process.Process;
import results.data.Vars;
import results.sync.Done;
import results.sync.Error;
import trace.Assignment;
import trace.StructValue;
import trace.Value;

//var-list-children var2
//numchild="3",children=[child={name="var2.x",exp="x",numchild="0",type="int",thread-id="1"},child={name="var2.y",exp="y",numchild="0",type="int",thread-id="1"},child={name="var2.z",exp=\"z",numchild="0",type="int",thread-id="1"}],has_more="0"
//42^done,children=[child={name="var1.x",type="int",numchild="0",thread-id="0",exp="x"},child={name="var1.y",type="int",numchild="0",thread-id="0",exp="y"}], numchild="2",has_more="0" 
public class VarListChildren extends MICommand {
	@Override
	public MIOutput perform(Process process) {
		String expression = arguments.get(0);
		
		String requestedVariable = VarUpdate.getVariableName(expression);
		Assignment current = process.getVariableManager().getVariables().get(requestedVariable);
		expression = VarUpdate.resolveInternalVariableName(current, expression);
		Value value = current.getValue(expression);
		
		if (!(value instanceof StructValue)) {
			return new Error(this, "Variable does not have children");
		}
		EMap<String, Value> structValues = ((StructValue) value).getValues();
		ArrayList<Vars> children = new ArrayList<Vars>();
		for (Entry<String, Value> entry : structValues) {
			Vars v = new Vars();
			v.name = requestedVariable + '.' + entry.getKey();
			v.exp = entry.getKey();
			v.numchild = String.valueOf(entry.getValue().getChildrenCount());
			v.type = "int"; //TODO 
			v.threadId = String.valueOf(current.getThread());
			children.add(v);
		}
//		Vars result = new Vars();
//		result.numchild = String.valueOf(structValues.size());
//		result.has_more = "0";
		return new Done(this, buildAnswer(String.valueOf(structValues.size()), "0",children));
	}

	private String buildAnswer(String numchild, String has_more, List<Vars> children) {
		return "numchild=\"" + numchild + "\",has_more=\"" + has_more + "\",children=" +   Vars.serializeAsChildrenList(children);
//		return new Gson().toJson(v).replace('{', ' ').replace('}', ' ') + "," + Vars.serializeAsChildrenList(children);
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
