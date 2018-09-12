package com.v2ex.management.mapper;

import com.v2ex.management.entity.Node;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Auther:lsxh
 * @Date:2018/9/31 0:55
 * @Description:
 */

@Mapper
public interface NodeMapper {

    /**
     * 查询所有节点信息
     * @return
     */
    @Select("SELECT id, pid, content, url, date, avatar, click FROM node")
    public List<Node> getAllNode();

    /**
     * 按id查找节点信息
     * @param id
     * @return
     */
    @Select("SELECT * FROM node where id=#{id}")
    public List<Node> getNode(int id);

    /**
     * 根据id添加节点
     * @param pid
     * @param content
     * @param url
     * @param avatar
     * @return
     */
    @Insert("INSERT INTO node (pid, content, url, date, avatar) VALUES( #{pid},#{content},#{url},NOW(),#{avatar})")
    public int setAddNode(@Param("pid")String pid,@Param("content")String content,@Param("url")String url,@Param("avatar")String avatar);

    /**
     * 根据id删除节点
     * @param id
     * @return
     */
    @Delete("DELETE FROM node where id=#{id}")
    public int setDeNode(int id);


    /**
     * 根据id更新节点，可更新：节点号，内容，路径，头像路径
     * @param pid
     * @param content
     * @param url
     * @param avatar
     * @param id
     * @return
     */
    @Update("UPDATE node SET pid=#{pid},content=#{content},url=#{url},avatar=#{avatar} WHERE id=#{id}")
    public int setUpNode(@Param("pid")String pid,@Param("content") String content,@Param("url") String url,@Param("avatar") String avatar,@Param("id")int id);
}
