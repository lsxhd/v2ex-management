package com.v2ex.management.controller;

import com.v2ex.management.entity.User;
import com.v2ex.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther:lsxh
 * @Date:2018/9/3 15:02
 * @Description:
 */
@Controller
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 查询所有用户
     * @return
     */
    @RequestMapping(value = "/getAllUser",method = RequestMethod.POST)
    @ResponseBody
    public List<User> getAlluser(){
        return userService.getAllUser();
    }

    /**
     * 按编号查询用户
     * @param id
     * @return
     */
    @RequestMapping(value = "/getUser",method = RequestMethod.POST)
    @ResponseBody
    public List<User> getUserById(@RequestParam ("id") int id){
       return userService.getUserById(id);
    }

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    @RequestMapping(value = "/deleteUser",method = RequestMethod.POST)
    @ResponseBody
    public int setDeUserById(@RequestParam("id") int id) {
        return userService.setDeUserById(id);
    }
}
