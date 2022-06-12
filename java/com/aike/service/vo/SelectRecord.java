package com.aike.service.vo;

public class SelectRecord {
    private Integer sSno; //学生学号
    private Integer dSno; //录入学号
    private Integer cSno; //审核员名学号
    private String clName; //学生所在班级
    private Boolean status; //当前记录状态
    private Integer pageIndex; //当前页数
    private Integer pageSize; //页数的个数

    @Override
    public String toString() {
        return "SelectRecord{" +
                "sSno=" + sSno +
                ", dSno=" + dSno +
                ", cSno=" + cSno +
                ", clName='" + clName + '\'' +
                ", status=" + status +
                ", pageIndex=" + pageIndex +
                ", pageSize=" + pageSize +
                '}';
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getClName() {
        return clName;
    }

    public void setClName(String clName) {
        this.clName = clName;
    }

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

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
