package com.gymx.user.service.impl;

import com.gymx.user.service.IUserService;

/**
 * Created by Administrator on 2017/5/1.
 */
public class UserServiceImpl implements IUserService {

    public void test(){
        System.out.println("测试spring");
    }

    public String queryUser(String userName){
        return "success";
    }
}
