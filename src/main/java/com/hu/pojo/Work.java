package com.hu.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Work {
    private Integer yess;
    private Integer noo;

    public Integer getYess() {
        return yess;
    }

    public void setYess(Integer yess) {
        this.yess = yess;
    }

    public Integer getNoo() {
        return noo;
    }

    public void setNoo(Integer noo) {
        this.noo = noo;
    }

    private Integer workid;

    private Integer workstatus;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date workday;

    private Integer workmoney;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date worktime;

    public Date getWorktime() {
        return worktime;
    }

    public void setWorktime(Date worktime) {
        this.worktime = worktime;
    }

    private Integer cnum;

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getCnum() {
        return cnum;
    }

    private Line line;

    private Customer customer;

    public void setCnum(Integer cnum) {
        this.cnum = cnum;
    }

    public Integer getLnum() {
        return lnum;
    }

    public void setLnum(Integer lnum) {
        this.lnum = lnum;
    }

    private Integer lnum;


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

    public Date getWorkday() {

        return workday;
    }

    public void setWorkday(Date workday) {
        this.workday = workday;
    }

    public Integer getWorkmoney() {
        return workmoney;
    }

    public void setWorkmoney(Integer workmoney) {
        this.workmoney = workmoney;
    }
}