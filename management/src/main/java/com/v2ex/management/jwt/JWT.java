package com.v2ex.management.jwt;
import com.v2ex.management.entity.Permissions;

import com.v2ex.management.entity.User;
import com.v2ex.management.service.PerService;
import com.v2ex.management.serviceimpl.PerSericeimpl;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import java.util.Date;
import java.util.List;


/**
 * @Auther:lsxh
 * @Date:2018/9/6 11:09
 * @Description:
 */
@Controller
public class JWT {
    @Autowired
    private PerService perService;

    public static final String SUBJECT ="gcclass";
    public static final long EXPIRE=1000*60*60*24*7;
    public static final String APPSECRET="dai*wang";

    /**
     * 生成JWT
     * @param user
     * @param
     * @return
     */
    public static String creatToken(User user) {

        final String token=Jwts.builder().setSubject(SUBJECT)
                .claim("id",user.getId())
                .claim("username",user.getName())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis()+EXPIRE))
                .signWith(SignatureAlgorithm.HS256,APPSECRET).compact();
        return token;
    }

    /**
     * 解密JWT
     * @param token
     * @return
     */
    public static Claims pardeToken(String token){
        if(token == null){
            return null;
        }else {
            Claims claims= Jwts.parser()
                    .setSigningKey(APPSECRET)
                    .parseClaimsJws(token).getBody();
            return claims;
        }

    }

}
