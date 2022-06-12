package com.aike.service.vo;

public class SelectHelp {
    //封装的查询条件
    private String name; //姓名
    private Integer sno; //学号
    private String classname;//班级名
    private String option;//升序降序
    private Integer pageIndex; //当前页数
    private Integer pageSize; //页数的个数

    public SelectHelp() {
    }

    public SelectHelp(String name, Integer sno, String classname, Integer pageIndex, Integer pageSize) {
        this.name = name;
        this.sno = sno;
        this.classname = classname;
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
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

    @Override
    public String toString() {
        return "SelectHelp{" +
                "name='" + name + '\'' +
                ", sno=" + sno +
                ", classname='" + classname + '\'' +
                ", option='" + option + '\'' +
                ", pageIndex=" + pageIndex +
                ", pageSize=" + pageSize +
                '}';
    }
}
