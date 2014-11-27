package results.sync;
import infra.MICommand;
import infra.MIResult;

import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;


public class Done extends MIResult {
	String parameter;
	Object value;
	boolean addQuotes = false;
	
	public Done(MICommand cmd) {
		super(cmd);
	}

	public Done(MICommand cmd, String parameter, Object value, boolean addQuotes) {
		super(cmd);
		this.parameter = parameter;
		this.value = value;
		this.addQuotes = addQuotes;
	}
	
	public Done(MICommand cmd, String parameter, Object value) {
		this(cmd, parameter, value, true);
	}
	
	public Done(MICommand cmd, Object value) {
		this(cmd, null, value, true);
	}
	
	@Override
	public List<String> serialize() {
		if (parameter == null && value == null)
			return Arrays.asList(getCommand().getId() + "^done");
		
		if (parameter == null && value != null) {
			if (value instanceof String)
				return Arrays.asList(getCommand().getId() + "^done," + value);
			String jsonRepresentation = new Gson().toJson(value);
			//strip first { and last }
			return Arrays.asList(getCommand().getId() + "^done," + jsonRepresentation.subSequence(1,jsonRepresentation.length()-1));
		}
		
		return Arrays.asList(getCommand().getId() + "^done" + ','+parameter+'='+ (value instanceof String ? quote() : toJson(value)));
	}

	private String quote() {
		if (!addQuotes)
			return (String) value;
		return "\"" + value + "\"";
	}

}
