package com.eshopping.dao;

import com.eshopping.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by AnKh on 2017/2/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class UserDaoTest {
    @Autowired
    UserDao userDao;
    @Test
    public void getUserById() throws Exception {
        Integer id = 1;
        User u = userDao.getUserById(1);
        System.out.println(u);
    }

    @Test
    public void addUser() throws Exception {
        User user = new User();
        user.setName("test");
        user.setPassword("test");
        userDao.addUser(user);
    }

    @Test
    public void deleteUser() throws Exception {
        userDao.deleteUserById(2);
    }

    @Test
    public void updateUser() throws Exception {
        User user = new User();
        user.setUserId(1);
        user.setName("l2");
        user.setPassword("l3");
        user.setAddress("yangz hou");

        userDao.updateUser(user);
    }

}