package com.eshopping.service.impl;

import com.eshopping.dao.UserDao;
import com.eshopping.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by AnKh on 2017/3/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")
public class UserServiceImplTest {
    @Autowired
    UserServiceImpl userService;
    @Autowired
    UserDao userDao;
    @Test
    public void addUser() throws Exception {
        User user = new User();
        user.setUserName("test");
        userService.addUser(user);
    }

    @Test
    public void deleteUserById() throws Exception {
        userService.deleteUserById(3);
    }

    @Test
    public void updateUserById() throws Exception {
        User user = userDao.getUserById(2);
        user.setUserName("test");
        user.setPassword("1122");
        userService.updateUserById(user);

    }

    @Test
    public void findAll() throws Exception {
        List<User> userList = userService.findAll(1,2);
        System.out.println(userList);
    }

}