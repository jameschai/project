package com.gymx.user.service;

import com.gymx.user.model.User;

/**
 * Created by Administrator on 2017/5/1.
 */
public interface IUserService {

    void addUser(User user);

    String findUserByName(String userName);
}
