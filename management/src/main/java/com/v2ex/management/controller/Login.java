package com.v2ex.management.controller;

import com.v2ex.management.entity.Permissions;
import com.v2ex.management.entity.User;
import com.v2ex.management.jwt.JWT;
import com.v2ex.management.service.PerService;
import com.v2ex.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.v2ex.management.jwt.JWT.creatToken;

/**
 * @Auther:lsxh
 * @Date:2018/9/7 09:53
 * @Description:
 */
@Controller
@CrossOrigin

public class Login {
    @Autowired
    private  UserService userService;
    @Autowired
    private  PerService perService;


    /**
     * 用户登陆
     * @param name
     * @param passwd
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,String> Login(@RequestParam("name") String name, @RequestParam("passwd") String passwd){
        Map<String,String> map = new HashMap<>();
        List<User>  users  = userService.getUserByName(name);
        if (users.size() == 0){
            map.put("status","0");
            map.put("msg","用户或密码错误");
            return map;
        }else {
            if (users.get(0).getPasswd().equals(passwd)){
                map.put("status","1");
                String token = JWT.creatToken(users.get(0));
                map.put("token",token);
                map.put("id",String.valueOf(users.get(0).getId()));
                map.put("username",users.get(0).getName());
                map.put("msg","登陆成功");
                return map;
            }else {
                map.put("status","0");
                map.put("msg","用户或密码错误");
                return map;
            }
        }


    }

}
