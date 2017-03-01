package com.eshopping.dao;

import com.eshopping.entity.Admin;

import java.util.List;

/**
 * Created by AnKh on 2017/2/27.
 */
public interface AdminDao {
    /**
     *
     * @param adminId
     * @return
     */
    Admin getAdminById(Integer adminId);

    /**
     *
     * @param admin
     * @return
     */
    int addAdmin(Admin admin);

    /**
     *
     * @param admin
     * @return
     */
    int updateAdmin(Admin admin);

    /**
     *
     * @param adminId
     * @return
     */
    int deleteAdmin(Integer adminId);

    /**
     * 这里可能需要分页
     * @return
     */
    List<Admin> getAll();
}
