package com.v2ex.management.serviceimpl;

import com.v2ex.management.entity.User;
import com.v2ex.management.mapper.UserMapper;
import com.v2ex.management.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther:lsxh
 * @Date:2018/9/3 14:51
 * @Description:
 */
@Service
public class UserServiceimpl implements UserService {
    @Resource
    private UserMapper userMapper;


    /**
     * 查询所有用户
     */
    public List<User> getAllUser(){
        return userMapper.getAllUser();
    }

   /**
    * 通过用户编号来查询用户
    */
    public List<User> getUserById(int id){
        return userMapper.getUserById(id);
    }

    @Override
    public List<User> getUserByName(String name) {
        return userMapper.getUserByName(name);
    }

    /**
     * 删除用户
     */
    @Override
    public int setDeUserById(int id) {
        return userMapper.setDeUserById(id);
    }

}
