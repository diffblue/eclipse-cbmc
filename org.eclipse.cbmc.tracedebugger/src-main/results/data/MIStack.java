package results.data;

import java.util.ArrayList;
import java.util.Collection;

import com.google.gson.Gson;

public class MIStack {
	public Collection<Frame> stack = new ArrayList<Frame>();

	public String serialize() {
		StringBuilder result = new StringBuilder(200);
		result.append('[');
		for (Frame frame : stack) {
			result.append("frame=");
			result.append(new Gson().toJson(frame));
			result.append(',');
		}
		result.deleteCharAt(result.length() -1);
		result.append(']');
		return result.toString();
	}
}
