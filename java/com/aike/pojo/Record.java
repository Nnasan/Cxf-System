package com.aike.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class  Record {

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getClName() {
        return clName;
    }

    public void setClName(String clName) {
        this.clName = clName;
    }


    private Integer rId;

    private Integer sId;
    private Integer sSno;
    private String sName;
    private String clName;//班级的名字 以后一定要把外键封装成对象 懂/(ㄒoㄒ)/~~？

    private Integer dId;
    private Integer dSno;
    private String dName;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "GMT+8")
    private Date date;
    private Double updatescore;

    private Boolean status;

    private Integer cId;
    private Integer cSno;
    private String cName;

    private String remarks;


    public Integer getsSno() {
        return sSno;
    }

    public void setsSno(Integer sSno) {
        this.sSno = sSno;
    }

    public Integer getdSno() {
        return dSno;
    }

    public void setdSno(Integer dSno) {
        this.dSno = dSno;
    }

    public Integer getcSno() {
        return cSno;
    }

    public void setcSno(Integer cSno) {
        this.cSno = cSno;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getUpdatescore() {
        return updatescore;
    }

    public void setUpdatescore(Double updatescore) {
        this.updatescore = updatescore;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    @Override
    public String toString() {
        return "Record{" +
                "rId=" + rId +
                ", sId=" + sId +
                ", sSno=" + sSno +
                ", sName='" + sName + '\'' +
                ", dId=" + dId +
                ", dSno=" + dSno +
                ", dName='" + dName + '\'' +
                ", date=" + date +
                ", updatescore=" + updatescore +
                ", status=" + status +
                ", cId=" + cId +
                ", cSno=" + cSno +
                ", cName='" + cName + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}

