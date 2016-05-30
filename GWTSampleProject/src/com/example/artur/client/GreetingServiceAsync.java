package com.example.artur.client;

import com.example.artur.shared.model.VoiceTestSummary;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {
	
	void greetServer(String input, AsyncCallback<String> callback) throws IllegalArgumentException;
	void getTestSummarySample(AsyncCallback<VoiceTestSummary> callback);
	void getSampleTest(AsyncCallback<String> callback);
}
