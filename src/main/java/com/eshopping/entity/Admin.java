package com.eshopping.entity;

/**
 * Created by AnKh on 2017/2/20.
 */
public class Admin {

    private Integer adminId;						//管理员编号
    private String userName;						//管理员用户名
    private String password;						//管理员密码

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", username='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
