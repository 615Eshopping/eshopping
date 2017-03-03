package com.eshopping.service;

import com.eshopping.entity.User;

import java.util.List;

/**
 * Created by AnKh on 2017/3/2.
 */
public interface UserService {

    void addUser(User user);

    void deleteUserById(Integer userId);

    void updateUserById(User user);

    List<User> findAll(int pageNum,int rows);

}
