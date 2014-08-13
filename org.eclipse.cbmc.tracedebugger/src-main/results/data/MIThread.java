package results.data;

import process.Thread;

import com.google.gson.annotations.SerializedName;

//https://sourceware.org/gdb/onlinedocs/gdb/GDB_002fMI-Thread-Information.html#GDB_002fMI-Thread-Information
//https://sourceware.org/gdb/onlinedocs/gdb/GDB_002fMI-Thread-Commands.html#GDB_002fMI-Thread-Commands
public class MIThread {
	public static enum State {
		stopped, running;
		public String toString() {
			return super.toString().toLowerCase();
		};
	}

	public String id;
	@SerializedName("target-id")
	public String targetId;
	public State state;
//	public String name;
	public Frame frame;

	// [{id="1",target-id="Thread 0x1503 of process 7234",frame={level="0",addr="0x\
	// 0000000100000f36",func="main",args=[{name="argc",value="1"},{name="argv",value="0x7fff5fbff628"}],fi\
	// le="../src/H.c",fullname="/Users/estelle/dev/Oxford/target/wokspace/H/src/H.c",line="20"},state="sto\
	// pped"}]

	public MIThread(Thread thread) {
		id = String.valueOf(thread.getId());
		targetId = id;
		this.state = thread.isRunning() ? State.running : State.stopped;
		if (thread.isStarted() && !thread.isRunning())
			frame = new Frame(thread.getStack().getCurrentStep(), thread
					.getStack().getEntryStep().getDisplayName(), 0);
	}
}
