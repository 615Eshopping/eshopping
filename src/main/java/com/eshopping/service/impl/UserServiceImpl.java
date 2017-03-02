package com.eshopping.service.impl;

import com.eshopping.dao.UserDao;
import com.eshopping.entity.User;
import com.eshopping.exception.ResourceConflictException;
import com.eshopping.exception.ResourceNotFoundException;
import com.eshopping.service.UserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by AnKh on 2017/3/2.
 */
@Service
public class UserServiceImpl implements UserService {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserDao userDao;

    public void addUser(User user) {
        if(userDao.getUserByName(user.getUserName()) != null){
            throw new ResourceConflictException("用户存在");
        }else{
            userDao.addUser(user);
        }
    }


    public void deleteUserById(Integer userId) {
        if(userDao.getUserById(userId) == null){
            throw new ResourceNotFoundException("用户不存在");
        }else {
            userDao.deleteUserById(userId);
        }
    }

    public void updateUserById(User user) {
        if(userDao.getUserById(user.getUserId()) == null){
            throw new ResourceNotFoundException("用户不存在");
        }else {
            userDao.updateUser(user);
        }
    }

    public List<User> findAll(int pageNum,int rows) {

        return null;
    }
}
