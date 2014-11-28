package infra;

import java.util.ArrayList;
import java.util.List;


public class CompositeOutput extends MIOutput {
	private MICommand command; //This is added in order to help deal with the testing
	private MIOutput[] outputs;

	public CompositeOutput(MICommand command, MIOutput... outputs) {
		this.outputs = outputs;
		this.command = command;
	}
	
	public List<String> serialize() {
		List<String> results = new ArrayList<String>();
		for (MIOutput miOutput : outputs) {
			results.addAll(miOutput.serialize());
		}
		return results;
	}
	
	public MICommand getCommand() {
		return command;
	}
}
