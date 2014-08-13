package infra;

import process.Process;

public abstract class MICommand {
	protected String id;
	protected String parameters;

	public String getId() {
		return id;
	}

	public void initialize(String id, String parameters) {
		this.id = id;
		this.parameters = parameters;
	}

	public abstract MIOutput perform(Process process);
}
