package com.gymx.user.action;

/**
 * Created by Administrator on 2017/4/30.
 */
public class loginAction {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // all struts logic here
    public String execute() {

        return "SUCCESS";

    }
}
