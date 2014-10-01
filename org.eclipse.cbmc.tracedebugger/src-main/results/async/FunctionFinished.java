package results.async;

import results.data.Frame;

public class FunctionFinished extends MIStopped {
	public Frame frame;

	public FunctionFinished() {
		reason = "function-finished";
	}
}
