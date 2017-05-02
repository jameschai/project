package com.gymx.user.service.impl;

import com.alibaba.druid.pool.DruidDataSource;
import com.gymx.user.service.IUserService;

/**
 * Created by Administrator on 2017/5/1.
 */
public class UserServiceImpl implements IUserService {

    private DruidDataSource dataSource;

    public void test(){
        System.out.println("测试spring");
    }

    public String findUserByName(String userName){
        String sql = "select * from user";
        return "success";
    }

    public void setDataSource(DruidDataSource dataSource) {
        this.dataSource = dataSource;
    }
}
