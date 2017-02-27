package com.eshopping.dao;

import com.eshopping.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by AnKh on 2017/2/27.
 */
@Repository
public interface UserDao {
    /**
     *
     * @param userId
     * @return User
     */
    User getUserById(Integer userId);

    /**
     *
     * @param user
     * @return 影响的行数
     */
    int addUser(User user);

    /**
     *
     * @param user
     * @return 影响的行数
     */
    int deleteUserById(Integer userId);

    /**
     *
     * @param user
     * @return 影响的行数
     */
    int updateUser(User user);



}
