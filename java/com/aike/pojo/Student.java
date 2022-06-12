package com.aike.pojo;

public class Student {
    private Integer sId;

    private String sPassword;

    private String sName;

    private Integer sSno;

    private Double sPoint;

    private Integer sClassId;

    private String sSex;

    private Integer sAge;

    private Class sClass;

    public Class getsClass() {
        return sClass;
    }

    public Student(Integer sId, String sPassword, String sName, Integer sSno, Double sPoint, Integer sClassId, String sSex, Integer sAge) {
        this.sId = sId;
        this.sPassword = sPassword;
        this.sName = sName;
        this.sSno = sSno;
        this.sPoint = sPoint;
        this.sClassId = sClassId;
        this.sSex = sSex;
        this.sAge = sAge;
    }

    public void setsClass(Class sClass) {
        this.sClass = sClass;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword == null ? null : sPassword.trim();
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public Integer getsSno() {
        return sSno;
    }

    public void setsSno(Integer sSno) {
        this.sSno = sSno;
    }

    public Double getsPoint() {
        return sPoint;
    }

    public void setsPoint(Double sPoint) {
        this.sPoint = sPoint;
    }

    public Integer getsClassId() {
        return sClassId;
    }

    public void setsClassId(Integer sClassId) {
        this.sClassId = sClassId;
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex == null ? null : sSex.trim();
    }

    public Integer getsAge() {
        return sAge;
    }

    public void setsAge(Integer sAge) {
        this.sAge = sAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", sPassword='" + sPassword + '\'' +
                ", sName='" + sName + '\'' +
                ", sSno=" + sSno +
                ", sPoint=" + sPoint +
                ", sClassId=" + sClassId +
                ", sSex='" + sSex + '\'' +
                ", sAge=" + sAge +
                '}';
    }
}