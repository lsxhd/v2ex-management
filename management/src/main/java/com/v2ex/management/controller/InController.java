package com.v2ex.management.controller;

import com.v2ex.management.config.LoginRequired;
import com.v2ex.management.entity.Increase;
import com.v2ex.management.service.InService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther:lsxh
 * @Date:2018/9/4 20:00
 * @Description:
 */
@Controller
@CrossOrigin

public class InController {
    @Autowired
    private InService inService;

    /**
     * 根据帖子id查询附言
     * @param tid
     * @return
     */
    @RequestMapping(value = "/getIncrease",method = RequestMethod.POST)
    @ResponseBody
    public List<Increase> getIncreaseById(@RequestParam("tid") int tid){
        return inService.getIncreaseById(tid);
    }

    /**
     * 根据id删除附言
     */
    @RequestMapping(value = "/deleteIncrease",method = RequestMethod.POST)
    @ResponseBody
    public int setDeleteIncreaseByid(@RequestParam("id") int id){
        return inService.setDeleteIncreaseByid(id);
    }
}
