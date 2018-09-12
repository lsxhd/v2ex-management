package com.v2ex.management;

import com.sun.media.sound.SoftSynthesizer;
import com.v2ex.management.controller.UserController;
import com.v2ex.management.entity.Permissions;
import com.v2ex.management.entity.User;
import com.v2ex.management.jwt.JWT;
import com.v2ex.management.mapper.UserMapper;
import com.v2ex.management.service.PerService;
import com.v2ex.management.service.UserService;
import com.v2ex.management.serviceimpl.UserServiceimpl;
import io.jsonwebtoken.Claims;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManagementApplicationTests {
    @Autowired
    private UserService userService;
    @Autowired
    private PerService perService;



    @Test
    public void contextLoads() {

        List<User> users = userService.getUserById(12);
        User user=users.get(0);

        JWT jwt =new JWT();
        String token=jwt.creatToken(user);
        System.out.println(token);

        Claims claims=jwt.pardeToken(token);
        int id=(int) claims.get("id");
        String username=(String) claims.get("username");
        System.out.println(id);
        System.out.println(username);

    }
}
