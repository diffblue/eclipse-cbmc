package results.async;

import results.data.Frame;

public class BreakpointHit extends MIStopped {
	public String disp;
	public String bkptno;
	public Frame frame;

	public BreakpointHit() {
		reason = "breakpoint-hit";
	}
}
