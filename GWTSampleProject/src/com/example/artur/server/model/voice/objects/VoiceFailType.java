package com.example.artur.server.model.voice.objects;

import java.io.Serializable;

public class VoiceFailType implements Serializable {

    private static final long serialVersionUID = 1L;

    private String failType;

    private String failPercentage;

    private Integer failQuantity;

    public String getFailType() {
        return failType;
    }

    public void setFailType(String failType) {
        this.failType = failType;
    }

    public String getFailPercentage() {
        return failPercentage;
    }

    public void setFailPercentage(String failPercentage) {
        this.failPercentage = failPercentage;
    }

    public Integer getFailQuantity() {
        return failQuantity;
    }

    public void setFailQuantity(Integer failQuantity) {
        this.failQuantity = failQuantity;
    }

}
