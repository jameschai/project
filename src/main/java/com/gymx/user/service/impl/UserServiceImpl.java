package com.gymx.user.service.impl;

import com.gymx.user.dao.impl.UserDaoImpl;
import com.gymx.user.model.User;
import com.gymx.user.service.IUserService;

/**
 * Created by Administrator on 2017/5/1.
 */
public class UserServiceImpl extends BaseServiceImpl implements IUserService {

    private UserDaoImpl userDao;

    public void addUser(User user) {
        userDao.save(user);
    }

    public String findUserByName(String userName){
        String sql = "select * from user";
        return "success";
    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public UserDaoImpl getUserDao() {
        return userDao;
    }
}
