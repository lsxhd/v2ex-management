package com.v2ex.management.mapper;

import com.v2ex.management.entity.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * @Auther:lsxh
 * @Date:2018/9/3 14:01
 * @Description:对用户进行增删改查操作
 */
@Mapper
public interface UserMapper {
    /**
     * 查询所有用户
     */
    @Select("select id, name, passwd, email, telphone, avatar, date from `user` ")
    @Results({
            @Result(
                    property = "permissions",column ="id",
                    many = @Many(fetchType = FetchType.EAGER,select = "com.v2ex.management.mapper.PerMapper.getAllPerUserByid")
            )
    })
    public List<User> getAllUser();

    /**
     * 通过用户编号来查询用户
     */
    @Select("SELECT id, name, passwd, email, telphone, avatar, date FROM user WHERE id=#{id} ")
    public List<User> getUserById(int id);

    /**
     * 通过用户名来查询用户
     */
    @Select("SELECT id, name, passwd, email, telphone, avatar, date FROM user WHERE name=#{name} ")
    public List<User> getUserByName(String name);

    /**
     * 根据id删除用户
     */
   @Delete("DELETE FROM user where id=#{id}")
    public int setDeUserById(int id);
}
