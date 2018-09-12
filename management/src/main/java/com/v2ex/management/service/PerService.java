package com.v2ex.management.service;

import com.v2ex.management.entity.Permissions;
import com.v2ex.management.entity.User;

import java.util.List;

/**
 * @Auther:lsxh
 * @Date:2018/9/4 10:19
 * @Description:
 */
public interface PerService {
    /**
     * 查询所有权限用户
     * @return
     */
    public List<Permissions> getAllPerUser();


    /**
     * 通过用户编号来查询用户
     */
    public List<Permissions> getAllPerUserByid(int user);


    /**
     * 添加用户至权限表，即给用户赋予权限
     * @param user
     * @param node
     * @return
     */

    public int setAddPer(int user, int node);

    /**
     * 从权限表删除用户，即消除用户权限
     * @param user
     * @param node
     * @return
     */

    public int setDePer(int user, int node);

}
