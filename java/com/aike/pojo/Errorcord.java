package com.aike.pojo;

public class Errorcord {
    private Integer erId;

    private Integer erReId;

    private String erReason;

    private Record record;

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }

    @Override
    public String toString() {
        return "Errorcord{" +
                "erId=" + erId +
                ", erReId=" + erReId +
                ", erReason='" + erReason + '\'' +
                ", record=" + record +
                '}';
    }

    public Integer getErId() {
        return erId;
    }

    public void setErId(Integer erId) {
        this.erId = erId;
    }

    public Integer getErReId() {
        return erReId;
    }

    public void setErReId(Integer erReId) {
        this.erReId = erReId;
    }

    public String getErReason() {
        return erReason;
    }

    public void setErReason(String erReason) {
        this.erReason = erReason == null ? null : erReason.trim();
    }
}