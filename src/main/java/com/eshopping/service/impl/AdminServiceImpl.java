package com.eshopping.service.impl;

import com.eshopping.dao.AdminDao;
import com.eshopping.entity.Admin;
import com.eshopping.service.AdminService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by AnKh on 2017/3/2.
 */
@Service
public class AdminServiceImpl implements AdminService {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    AdminDao adminDao;
    public void addAdmin(Admin admin) {

    }

    public void deleteAdminById(Integer AdminId) {

    }

    public void updateAdminById(Integer AdminId) {

    }

    public List<Admin> findAll() {
        return null;
    }
}
