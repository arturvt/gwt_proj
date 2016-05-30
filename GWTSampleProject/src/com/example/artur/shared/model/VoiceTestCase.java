package com.example.artur.shared.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.googlecode.objectify.annotation.Ignore;

public class VoiceTestCase implements Serializable {

    private static final long serialVersionUID = 1L;

    private String testCaseID;

    @Ignore
    private String testSuiteID;

    private List<VoiceFailType> voiceFailTypeList;

    private String testName;

    private Date endTime;

    private Date startTime;

    private String errorMessage;

    private String passedPercentage;

    private String failPercentage;

    private Integer passedQuantity;

    private Integer failQuantity;

    public String getTestSuiteID() {
        return testSuiteID;
    }

    public void setTestSuiteID(String testSuiteID) {
        this.testSuiteID = testSuiteID;
    }

    public Date getEndTime() {
        return endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public String getTestCaseID() {
        return testCaseID;
    }

    public void setTestCaseID(String testCaseID) {
        this.testCaseID = testCaseID;
    }

    public List<VoiceFailType> getVoiceFailTypeList() {
        return voiceFailTypeList;
    }

    public void setVoiceFailTypeList(List<VoiceFailType> voiceFailTypeList) {
        this.voiceFailTypeList = voiceFailTypeList;
    }

    public void addFailTypeList(VoiceFailType voiceFailType) {
        if (this.voiceFailTypeList == null) {
            this.voiceFailTypeList = new ArrayList<VoiceFailType>();
        }

        this.voiceFailTypeList.add(voiceFailType);
    }

    public String getPassedPercentage() {
        return passedPercentage;
    }

    public String getFailPercentage() {
        return failPercentage;
    }

    public Integer getPassedQuantity() {
        return passedQuantity;
    }

    public Integer getFailQuantity() {
        return failQuantity;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setPassedPercentage(String passedPercentage) {
        this.passedPercentage = passedPercentage;
    }

    public void setFailPercentage(String failPercentage) {
        this.failPercentage = failPercentage;
    }

    public void setPassedQuantity(Integer passedQuantity) {
        this.passedQuantity = passedQuantity;
    }

    public void setFailQuantity(Integer failQuantity) {
        this.failQuantity = failQuantity;
    }

}
