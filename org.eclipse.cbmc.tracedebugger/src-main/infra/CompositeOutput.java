package infra;

import java.util.ArrayList;
import java.util.List;


public class CompositeOutput extends MIOutput {
	
	private MIOutput[] outputs;

	public CompositeOutput(MIOutput... outputs) {
		this.outputs = outputs;
	}
	
	public List<String> serialize() {
		List<String> results = new ArrayList<String>();
		for (MIOutput miOutput : outputs) {
			results.addAll(miOutput.serialize());
		}
		return results;
	}
}
