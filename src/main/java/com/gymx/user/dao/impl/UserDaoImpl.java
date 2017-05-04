package com.gymx.user.dao.impl;

import com.gymx.user.dao.BaseDao;
import com.gymx.user.dao.IUserDao;
import com.gymx.user.model.User;

import java.util.List;

/**
 * Created by Administrator on 2017/5/2.
 */
public class UserDaoImpl extends BaseDao implements IUserDao{

    public List<User> findAllUsers(){
        List<User> userList = this.getSqlSession().selectList("com.gymx.user.user.findAllUsers");
        for (User user : userList) {
            logger.info("user : " + user.getName());
        }
        return userList;
    }

    public User findUserByName(String name) {
        User user = this.getSqlSession().selectOne("com.gymx.user.user.findUserByName", name);
        logger.info("user : " + user.getName());
        return user;
    }

    public void save(User user) {
        this.getSqlSession().update("com.gymx.user.user.save",user);
    }

    public void update(User user) {
        this.getSqlSession().update("com.gymx.user.user.update",user);
    }

    public void delete(int id) {
        this.getSqlSession().update("com.gymx.user.user.delete",id);
    }
}
