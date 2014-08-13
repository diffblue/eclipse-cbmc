package results.async;

import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import infra.MIAsync;

public abstract class MIStopped extends MIAsync {
	String reason;
	public @SerializedName("thread-id") String threadId;
	public @SerializedName("stopped-threads") String stoppedThreads;
	
	@Override
	public List<String> serialize() {
		String jsonRepresentation = new Gson().toJson(this);
		//strip first { and last }
		return Arrays.asList("*stopped," + jsonRepresentation.subSequence(1,jsonRepresentation.length()-1));
	}
}
