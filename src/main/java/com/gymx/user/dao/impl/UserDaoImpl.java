package com.gymx.user.dao.impl;

import com.gymx.user.dao.IUserDao;
import com.gymx.user.model.User;

import java.util.List;

/**
 * Created by Administrator on 2017/5/2.
 */
public class UserDaoImpl extends BaseDaoImpl<User> implements IUserDao{

    public List<User> findAllUsers(){
        List<User> userList = this.getSqlSession().selectList(mapperNamespace + "findAllUsers");
        for (User user : userList) {
            logger.info("user : " + user.getName());
        }
        return userList;
    }

    public User findUserByName(String name) {
        User user = this.getSqlSession().selectOne(mapperNamespace + "findUserByName", name);
        logger.info("user : " + user.getName());
        return user;
    }
}
