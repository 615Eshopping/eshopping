package com.eshopping.dao;

import com.eshopping.entity.Admin;
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
public class AdminDaoTest {
    @Autowired
    AdminDao adminDao;
    @Test
    public void getAdminById() throws Exception {
        Integer id = 1;
        Admin admin = adminDao.getAdminById(id);
        System.out.println(admin);
    }

    @Test
    public void addAdmin() throws Exception {
        Admin admin = new Admin();
        admin.setUserName("test");
        admin.setPassword("test");
        adminDao.addAdmin(admin);
    }

    @Test
    public void updateAdmin() throws Exception {
        Admin admin = new Admin();
        admin.setAdminId(2);
        admin.setPassword("test2");
        admin.setUserName("test2");
        adminDao.updateAdmin(admin);
    }

    @Test
    public void deleteAdmin() throws Exception {
        adminDao.deleteAdmin(2);
    }

}