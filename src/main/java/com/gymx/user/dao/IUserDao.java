package com.gymx.user.dao;

import com.gymx.user.model.User;

import java.util.List;

/**
 * Created by Administrator on 2017/5/2.
 */
public interface IUserDao {

    List<User> findAllUsers();

    User findUserByName(String name);

    void save(User user);

    void update(User user);

    void delete(int id);
}
