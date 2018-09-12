package com.v2ex.management.service;

import com.v2ex.management.entity.User;

import java.util.List;

/**
 * @Auther:lsxh
 * @Date:2018/9/3 14:52
 * @Description:
 */
public interface UserService {

    /**
     * 查询所有用户
     */
    public List<User> getAllUser();

    /**
     * 通过用户编号来查询用户
     */
    public List<User> getUserById(int id);

    /**
     * 通过用户编号来查询用户
     */
    public List<User> getUserByName(String name);

    /**
     * 删除用户
     */
    public int setDeUserById(int id);
}
