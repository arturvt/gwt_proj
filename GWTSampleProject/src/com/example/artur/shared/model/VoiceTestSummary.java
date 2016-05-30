package com.example.artur.shared.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VoiceTestSummary implements Serializable {

    private static final long serialVersionUID = 1L;

    private String testSummaryID;

    private String product;

    private String language;

    private String androidBuild;

    private String appBuild;

    private Date testSummaryDate;

    private String computerIP;

    private String deviceID;

    private List<VoiceTestCase> voiceTestCaseList;

    public String getTestSummaryID() {
        return testSummaryID;
    }

    public void setTestSummaryID(String testSummaryID) {
        this.testSummaryID = testSummaryID;
    }

    public List<VoiceTestCase> getVoiceTestCaseList() {
        return voiceTestCaseList;
    }

    public void setVoiceTestCaseList(List<VoiceTestCase> voiceTestCaseList) {
        this.voiceTestCaseList = voiceTestCaseList;
    }

    public void addVoiceTestCaseList(VoiceTestCase voiceTestCase) {
        if (this.voiceTestCaseList == null) {
            this.voiceTestCaseList = new ArrayList<VoiceTestCase>();
        }
        this.voiceTestCaseList.add(voiceTestCase);
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAndroidBuild() {
        return androidBuild;
    }

    public void setAndroidBuild(String androidBuild) {
        this.androidBuild = androidBuild;
    }

    public String getAppBuild() {
        return appBuild;
    }

    public void setAppBuild(String appBuild) {
        this.appBuild = appBuild;
    }

    public Date getTestSummaryDate() {
        return testSummaryDate;
    }

    public void setTestSummaryDate(Date testSummaryDate) {
        this.testSummaryDate = testSummaryDate;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getComputerIP() {
        return computerIP;
    }

    public void setComputerIP(String computerIP) {
        this.computerIP = computerIP;
    }
}
