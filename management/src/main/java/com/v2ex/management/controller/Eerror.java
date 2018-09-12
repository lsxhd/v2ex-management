package com.v2ex.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther:lsxh
 * @Date:2018/9/10 09:06
 * @Description:
 */
@Controller
@CrossOrigin
public class Eerror {
    @RequestMapping(value = "/404",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,String> error(){
        System.out.println("输出1");
        Map<String,String> map=new HashMap<>();
        map.put("status","404");
        map.put("mags","无权限");
        return map;
    }

    @RequestMapping(value = "/403",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,String> error2(){
        System.out.println("输出1");
        Map<String,String> map=new HashMap<>();
        map.put("status","404");
        map.put("mags","禁止登陆");
        return map;
    }

}
