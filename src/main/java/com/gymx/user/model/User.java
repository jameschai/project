package com.gymx.user.model;

/**
 * Created by Administrator on 2017/5/2.
 */
public class User extends BaseEntity{

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
