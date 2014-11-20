package expressionparser;
import trace.Value;

//A helper class
public class NameValuePair {
	private String s;
	private Value v;
	
	public NameValuePair(String string, Value value) {
		s = string;
		v = value;
	}
	
	public String getName() {
		return s;
	}
	
	public Value getValue() {
		return v;
	}
}
