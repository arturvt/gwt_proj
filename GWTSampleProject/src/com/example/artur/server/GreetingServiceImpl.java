package com.example.artur.server;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.artur.client.GreetingService;
import com.example.artur.shared.FieldVerifier;
import com.example.artur.shared.model.VoiceFailType;
import com.example.artur.shared.model.VoiceTestCase;
import com.example.artur.shared.model.VoiceTestSummary;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements GreetingService {

	public String greetServer(String input) throws IllegalArgumentException {
		// Verify that the input is valid. 
		if (!FieldVerifier.isValidName(input)) {
			// If the input is not valid, throw an IllegalArgumentException back to
			// the client.
			throw new IllegalArgumentException("Name must be at least 4 characters long");
		}

		String serverInfo = getServletContext().getServerInfo();
		String userAgent = getThreadLocalRequest().getHeader("User-Agent");

		// Escape data from the client to avoid cross-site script vulnerabilities.
		input = escapeHtml(input);
		userAgent = escapeHtml(userAgent);

		return "Hello, " + input + "!<br><br>I am running " + serverInfo + ".<br><br>It looks like you are using:<br>"
				+ userAgent;
	}

	public String getSampleTest() {
		return "Received Sample";
	}
	
	public VoiceTestSummary getTestSummarySample() {
		VoiceTestSummary test = new VoiceTestSummary();
		
		test.setAndroidBuild("device:6.0.1 ABC1234");
		test.setAppBuild("1.9.3.0.001");
		test.setProduct("iphone_6s plus");
		test.setLanguage("en_US");
		test.setComputerIP("127.0.0.1");
		test.setDeviceID("123888SA");
		test.setTestSummaryDate(new Date());
		
		String summaryID = "AS_DD-221333";
		test.setTestSummaryID(summaryID);
		
		List<VoiceTestCase> testcaseList = new ArrayList<>();
		
		VoiceTestCase v1 = new VoiceTestCase();
		VoiceTestCase v2 = new VoiceTestCase();
		
		v1.setErrorMessage("Error Message");
		v1.setFailPercentage("25%");
		v1.setFailQuantity(11);
		v1.setPassedPercentage("75%");
		v1.setPassedQuantity(35);
		v1.setStartTime(new Date());
		v1.setEndTime(new Date());
		v1.setTestCaseID("TS_1122221");
		v1.setTestName("Call Test --- 01");
		v1.setTestSuiteID(summaryID);
		List<VoiceFailType> failList = new ArrayList<>();
		
		VoiceFailType t = new VoiceFailType();
		t.setFailPercentage("5%");
		t.setFailQuantity(5);
		t.setFailType("Failure 01");
		failList.add(t);
		
		VoiceFailType t1 = new VoiceFailType();
		t1.setFailPercentage("5%");
		t1.setFailQuantity(5);
		t1.setFailType("Failure 02");
		failList.add(t1);
		
		v1.setVoiceFailTypeList(failList);
		
		v2.setErrorMessage("Error Message");
		v2.setFailPercentage("25%");
		v2.setFailQuantity(11);
		v2.setPassedPercentage("75%");
		v2.setPassedQuantity(35);
		v2.setStartTime(new Date());
		v2.setEndTime(new Date());
		v2.setTestCaseID("TS_1122221");
		v2.setTestName("Call Test --- 02");
		v2.setTestSuiteID(summaryID);
		List<VoiceFailType> failList2 = new ArrayList<>();
		v2.setVoiceFailTypeList(failList2);
		
		
		VoiceFailType t2 = new VoiceFailType();
		t2.setFailPercentage("5%");
		t2.setFailQuantity(5);
		t2.setFailType("Failure 01");
		failList.add(t2);
		
		VoiceFailType t3 = new VoiceFailType();
		t3.setFailPercentage("5%");
		t3.setFailQuantity(5);
		t3.setFailType("Failure 02");
		failList.add(t3);
		
		v2.setVoiceFailTypeList(failList);
		
		
		testcaseList.add(v1);
		testcaseList.add(v2);
		
		test.setVoiceTestCaseList(testcaseList);
		
		
		return test;
	}
	
	/**
	 * Escape an html string. Escaping data received from the client helps to
	 * prevent cross-site script vulnerabilities.
	 * 
	 * @param html the html string to escape
	 * @return the escaped string
	 */
	private String escapeHtml(String html) {
		if (html == null) {
			return null;
		}
		return html.replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;");
	}
}
