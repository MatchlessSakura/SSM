package com.hu.pojo;

public class Line {
    private Integer lineid;

    private String lineap;

    private String linebp;

    private Integer lineday;

    public Integer getLineid() {
        return lineid;
    }

    public void setLineid(Integer lineid) {
        this.lineid = lineid;
    }

    public String getLineap() {
        return lineap;
    }

    public void setLineap(String lineap) {
        this.lineap = lineap == null ? null : lineap.trim();
    }

    public String getLinebp() {
        return linebp;
    }

    public void setLinebp(String linebp) {
        this.linebp = linebp == null ? null : linebp.trim();
    }

    public Integer getLineday() {
        return lineday;
    }

    public void setLineday(Integer lineday) {
        this.lineday = lineday;
    }
}