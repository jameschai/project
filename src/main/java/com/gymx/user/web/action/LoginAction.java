package com.gymx.user.web.action;

import com.gymx.user.service.IUserService;

/**
 * Created by Administrator on 2017/4/30.
 */
public class LoginAction extends BaseAction {

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

    private IUserService userService;

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    // all struts logic here
    public String execute() {

        return "SUCCESS";

    }
}
