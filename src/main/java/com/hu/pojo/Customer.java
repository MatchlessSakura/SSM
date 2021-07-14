package com.hu.pojo;

public class Customer {
    private Integer customerid;

    private String customername;

    private Integer customersex;

    private Integer customerage;

    private Integer customerpho;

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public Integer getCustomersex() {
        return customersex;
    }

    public void setCustomersex(Integer customersex) {
        this.customersex = customersex;
    }

    public Integer getCustomerage() {
        return customerage;
    }

    public void setCustomerage(Integer customerage) {
        this.customerage = customerage;
    }

    public Integer getCustomerpho() {
        return customerpho;
    }

    public void setCustomerpho(Integer customerpho) {
        this.customerpho = customerpho;
    }
}