package com.v2ex.management.service;

import com.v2ex.management.entity.Node;

import java.util.List;

/**
 * @Auther:lsxh
 * @Date:2018/9/4 15:05
 * @Description:
 */
public interface NodeService {
    /**
     * 查询所有节点信息
     * @return
     */
    public List<Node> getAllNode();

    /**
     * 按id查找节点信息
     * @param id
     * @return
     */
    public List<Node> getNode(int id);

    /**
     * 根据id添加节点
     * @param pid
     * @param content
     * @param url
     * @param avatar

     * @return
     */
    public int setAddNode(String pid,String content,String url,String avatar);


    /**
     * 根据id删除节点
     * @param id
     * @return
     */
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
    public int setUpNode(String pid, String content, String url, String avatar,int id);
}
