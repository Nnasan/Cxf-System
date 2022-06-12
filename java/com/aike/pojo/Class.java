package com.aike.pojo;

public class Class {
    private Integer clId;

    private String clName;

    public Integer getClId() {
        return clId;
    }

    public void setClId(Integer clId) {
        this.clId = clId;
    }

    public String getClName() {
        return clName;
    }

    public void setClName(String clName) {
        this.clName = clName == null ? null : clName.trim();
    }

    public Class(Integer clId, String clName) {
        this.clId = clId;
        this.clName = clName;
    }

    @Override
    public String toString() {
        return "Class{" +
                "clId=" + clId +
                ", clName='" + clName + '\'' +
                '}';
    }
}