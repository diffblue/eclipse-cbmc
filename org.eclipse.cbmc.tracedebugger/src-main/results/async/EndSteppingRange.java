package results.async;

import results.data.Frame;

public class EndSteppingRange extends MIStopped {
	public Frame frame;

	public EndSteppingRange() {
		reason = "end-stepping-range";
	}
}
