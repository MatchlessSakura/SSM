package com.hu.pojo;

public class Staff {
    private Integer staffid;

    private String staffname;

    private String staffsex;

    private Integer staffage;

    private Integer staffpho;

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname == null ? null : staffname.trim();
    }

    public String getStaffsex() {
        return staffsex;
    }

    public void setStaffsex(String staffsex) {
        this.staffsex = staffsex == null ? null : staffsex.trim();
    }

    public Integer getStaffage() {
        return staffage;
    }

    public void setStaffage(Integer staffage) {
        this.staffage = staffage;
    }

    public Integer getStaffpho() {
        return staffpho;
    }

    public void setStaffpho(Integer staffpho) {
        this.staffpho = staffpho;
    }
}