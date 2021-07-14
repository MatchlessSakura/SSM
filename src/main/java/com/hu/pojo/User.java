package com.hu.pojo;

public class User {
    private Integer userid;

    private String username;

    private String userpassword;

    private Integer usercon;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public Integer getUsercon() {
        return usercon;
    }

    public void setUsercon(Integer usercon) {
        this.usercon = usercon;
    }
}