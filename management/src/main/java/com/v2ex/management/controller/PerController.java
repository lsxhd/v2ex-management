package com.v2ex.management.controller;

import com.v2ex.management.entity.Permissions;
import com.v2ex.management.service.PerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther:lsxh
 * @Date:2018/9/4 10:28
 * @Description:
 */
@Controller
@CrossOrigin

public class PerController {
    @Autowired
    private PerService perService;

    /**
     * 查询所有权限用户
     * @return
     */
    @RequestMapping(value = "/allPerUser")
    @ResponseBody
    public List<Permissions> getAllPerUser(){
        return perService.getAllPerUser();
    }

    /**
     * 添加用户至权限表，即给用户赋予权限
     * @param user
     * @param node
     * @return
     */
    @RequestMapping(value = "/addPerUser",method = RequestMethod.POST)
    @ResponseBody
    public int setAddPer(@RequestParam("user") int user,@RequestParam("node") int node) {
        return perService.setAddPer(user,node);
    }

    /**
     * 从权限表删除用户，即消除用户权限
     * @param user
     * @param node
     * @return
     */
    @RequestMapping(value = "/deletePerUser",method = RequestMethod.POST)
    @ResponseBody
    public int setDePer(@RequestParam("user") int user,@RequestParam("node") int node) {
        return perService.setDePer(user,node);
    }
}
