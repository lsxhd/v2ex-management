package com.v2ex.management.controller;

import com.v2ex.management.entity.Node;
import com.v2ex.management.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther:lsxh
 * @Date:2018/9/4 15:15
 * @Description:
 */
@Controller
@CrossOrigin

public class NodeController {
    @Autowired
    private NodeService nodeService;

    /**
     * 查询所有节点信息
     * @return
     */
    @RequestMapping(value = "/getAllNode",method = RequestMethod.POST)
    @ResponseBody
    public List<Node> getAllNode(){
        System.out.println("开始获取所有节点");
        return nodeService.getAllNode();
    }

    /**
     * 按id查找节点信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/getNode",method = RequestMethod.POST)
    @ResponseBody
    public List<Node> getNode(@RequestParam("id") int id){
        return nodeService.getNode(id);
    }

    /**
     * 添加节点
     * @param pid
     * @param content
     * @param url
     * @param avatar
     * @return
     */
    @RequestMapping(value = "/addNode",method = RequestMethod.POST)
    @ResponseBody
    public int setAddNode(@RequestParam("pid")String pid,@RequestParam("content")String content,@RequestParam("url")String url,@RequestParam("avatar")String avatar){
        return nodeService.setAddNode(pid, content, url, avatar);
    }


    /**
     * 根据id删除节点
     * @param id
     * @return
     */
    @RequestMapping(value = "/deleteNode",method = RequestMethod.POST)
    @ResponseBody
    public int setDeNode(@RequestParam("id")int id){
        return nodeService.setDeNode(id);
    }


    /**
     * 根据id更新节点，可更新：节点号，内容，路径，头像路径
     * @param pid
     * @param content
     * @param url
     * @param avatar
     * @param id
     * @return
     */
    @RequestMapping(value = "/updateNode",method = RequestMethod.POST)
    @ResponseBody
    public int setUpNode(@RequestParam("pid")String pid,@RequestParam("content") String content,@RequestParam("url") String url,@RequestParam("avatar") String avatar,@RequestParam("id")int id){
        return nodeService.setUpNode(pid, content, url, avatar, id);
    }

}
