package com.wenyu7980.bpm.api.domain;

import java.util.Map;

/**
 *
 * @author wenyu
 */
public class BpmStart {
    private String bpmKey;
    private String businessKey;
    private String businessType;
    private Map<String, Object> params;

    public BpmStart() {
    }

    public BpmStart(String bpmKey, String businessKey, String businessType, Map<String, Object> params) {
        this.bpmKey = bpmKey;
        this.businessKey = businessKey;
        this.businessType = businessType;
        this.params = params;
    }

    public String getBpmKey() {
        return bpmKey;
    }

    public void setBpmKey(String bpmKey) {
        this.bpmKey = bpmKey;
    }

    public String getBusinessKey() {
        return businessKey;
    }

    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
}
