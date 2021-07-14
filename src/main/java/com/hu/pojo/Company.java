package com.hu.pojo;

public class Company {
    private Integer comid;

    public Integer getComid() {
        return comid;
    }

    public void setComid(Integer comid) {
        this.comid = comid;
    }

    private String comname;

    private Integer compho;

    private String comaddress;

    private String cominfo;

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname == null ? null : comname.trim();
    }

    public Integer getCompho() {
        return compho;
    }

    public void setCompho(Integer compho) {
        this.compho = compho;
    }

    public String getComaddress() {
        return comaddress;
    }

    public void setComaddress(String comaddress) {
        this.comaddress = comaddress == null ? null : comaddress.trim();
    }

    public String getCominfo() {
        return cominfo;
    }

    public void setCominfo(String cominfo) {
        this.cominfo = cominfo == null ? null : cominfo.trim();
    }
}