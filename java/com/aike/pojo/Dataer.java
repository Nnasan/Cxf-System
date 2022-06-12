package com.aike.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Dataer {
    private Integer dId;

    @JsonProperty(value = "desc2", required = true)
    private String dName;

    @JsonProperty(value = "desc1", required = true)
    private Integer dSno;

    @JsonProperty(value = "desc4", required = true)
    private String dPassword;

    @JsonProperty(value = "desc3", required = true)
    private Integer dClassId;

    @JsonProperty(value = "desc5", required = true)
    private Class dClass;

    public Class getdClass() {
        return dClass;
    }

    public void setdClass(Class dClass) {
        this.dClass = dClass;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName == null ? null : dName.trim();
    }

    public Integer getdSno() {
        return dSno;
    }

    public void setdSno(Integer dSno) {
        this.dSno = dSno;
    }

    public String getdPassword() {
        return dPassword;
    }

    public void setdPassword(String dPassword) {
        this.dPassword = dPassword == null ? null : dPassword.trim();
    }

    public Integer getdClassId() {
        return dClassId;
    }

    public void setdClassId(Integer dClassId) {
        this.dClassId = dClassId;
    }

    @Override
    public String toString() {
        return "Dataer{" +
                "dId=" + dId +
                ", dName='" + dName + '\'' +
                ", dSno=" + dSno +
                ", dPassword='" + dPassword + '\'' +
                ", dClassId=" + dClassId +
                '}';
    }
}