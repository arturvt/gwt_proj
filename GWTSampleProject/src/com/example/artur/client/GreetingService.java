package com.example.artur.client;

import com.example.artur.shared.model.VoiceTestSummary;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface GreetingService extends RemoteService {
	String greetServer(String name) throws IllegalArgumentException;
	VoiceTestSummary getTestSummarySample();
	String getSampleTest();
}
