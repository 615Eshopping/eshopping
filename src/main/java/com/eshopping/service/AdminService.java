package com.eshopping.service;

import com.eshopping.entity.Admin;

import java.util.List;

/**
 * Created by AnKh on 2017/3/2.
 */
public interface AdminService {
    void addAdmin(Admin admin);

    void deleteAdminById(Integer AdminId);

    void updateAdminById(Integer AdminId);

    List<Admin> findAll();
}
