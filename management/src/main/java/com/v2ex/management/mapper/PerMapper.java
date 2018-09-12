package com.v2ex.management.mapper;

import com.v2ex.management.entity.Permissions;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Auther:lsxh
 * @Date:2018/9/4 10:05
 * @Description:
 */
@Mapper
public interface PerMapper {

    /**
     * 查询所有权限用户
     * @return
     */
    @Select("SELECT id,user,node FROM permissions")
    public List<Permissions> getAllPerUser();

    /**
     * 按用户编号查询所有用户
     * @return
     */
    @Select("SELECT id,user,node FROM permissions where user=#{user}")
    public List<Permissions> getAllPerUserByid(int user);



    /**
     * 添加用户至权限表，即给用户赋予权限
     * @param user
     * @param node
     * @return
     */
    @Insert("INSERT INTO permissions (user,node) VALUES (#{user},#{node})")
    public int setAddPer(@Param("user")int user,@Param("node") int node);

    /**
     * 从权限表删除用户，即消除用户权限
     * @param user
     * @param node
     * @return
     */
    @Delete("DELETE FROM permissions where user=#{user} and node=#{node}")
    public int setDePer(@Param("user")int user,@Param("node") int node);
}
