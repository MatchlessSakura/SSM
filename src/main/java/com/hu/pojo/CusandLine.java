package com.hu.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
//无实体类 用来联合查询
public class CusandLine {
    private String cname;
    private Integer cpho;
    private Integer workmoney;
    private Integer workstatus;
    private Integer lid;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date workday;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date worktime;

    public Date getWorkday() {
        return workday;
    }

    public void setWorkday(Date workday) {
        this.workday = workday;
    }

    public Date getWorktime() {
        return worktime;
    }

    public void setWorktime(Date worktime) {
        this.worktime = worktime;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getCpho() {
        return cpho;
    }

    public void setCpho(Integer cpho) {
        this.cpho = cpho;
    }

    private Integer workid;

    public Integer getWorkid() {
        return workid;
    }

    public void setWorkid(Integer workid) {
        this.workid = workid;
    }

    public Integer getWorkstatus() {
        return workstatus;
    }

    public void setWorkstatus(Integer workstatus) {
        this.workstatus = workstatus;
    }

    public Integer getWorkmoney() {
        return workmoney;
    }

    public void setWorkmoney(Integer workmoney) {
        this.workmoney = workmoney;
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }
}

