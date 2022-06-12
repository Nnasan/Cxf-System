package com.aike.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Checker {
    private Integer cId;

    @JsonProperty(value = "desc1", required = true)
    private Integer cSno;
    @JsonProperty(value = "desc2", required = true)
    private String cName;
    @JsonProperty(value = "desc4", required = true)
    private String cPassword;
    @JsonProperty(value = "desc3", required = true)
    private Integer cClassId;

    @JsonProperty(value = "desc5", required = true)
    private Class cClass;

    public Class getcClass() {
        return cClass;
    }

    public void setcClass(Class cClass) {
        this.cClass = cClass;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getcSno() {
        return cSno;
    }

    public void setcSno(Integer cSno) {
        this.cSno = cSno;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword == null ? null : cPassword.trim();
    }

    public Integer getcClassId() {
        return cClassId;
    }

    public void setcClassId(Integer cClassId) {
        this.cClassId = cClassId;
    }

    @Override
    public String toString() {
        return "Checker{" +
                "cId=" + cId +
                ", cSno=" + cSno +
                ", cName='" + cName + '\'' +
                ", cPassword='" + cPassword + '\'' +
                ", cClassId=" + cClassId +
                ", cClass=" + cClass +
                '}';
    }
}