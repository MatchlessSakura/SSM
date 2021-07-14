package com.hu.util;

/**
 *随便建的位置用来动态获取数据给echart
 * 但是好像不用创建 也可以动态赋予 只是jsp页面的名称要改
 */
public class WorkEchart {
    private String work_date;
    private Integer count;
    private Integer work_money;

    public String getWork_day() {
        return work_day;
    }

    public void setWork_day(String work_day) {
        this.work_day = work_day;
    }

    private String work_day;

    public Integer getWork_money() {
        return work_money;
    }

    public void setWork_money(Integer work_money) {
        this.work_money = work_money;
    }

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

    private Integer yess;
    private Integer noo;

    public String getWork_date() {
        return work_date;
    }

    public void setWork_date(String work_date) {
        this.work_date = work_date;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
