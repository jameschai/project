package com.gymx.user.dao.impl;

import com.gymx.user.dao.IUserDao;
import com.gymx.user.model.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * Created by Administrator on 2017/5/2.
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements IUserDao{

    public List<User> findUsers(){
        List<User> userList = this.getSqlSession().selectList("queryUsers", new User());
        for (User user : userList) {
            System.out.println(user.getName());
        }
        return userList;
    }
}
