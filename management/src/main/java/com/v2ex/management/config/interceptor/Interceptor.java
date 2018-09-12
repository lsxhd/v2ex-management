package com.v2ex.management.config.interceptor;


import com.v2ex.management.entity.User;
import com.v2ex.management.jwt.JWT;
import com.v2ex.management.service.UserService;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.List;


/**
 * @Auther:lsxh
 * @Date:2018/9/7 11:09
 * @Description:
 */
@Component
public class Interceptor implements HandlerInterceptor {
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {
        // TODO Auto-generated method stub
        System.out.println("afterCompletion:");

    }

    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
            throws Exception {
        // TODO Auto-generated method stub
        System.out.println("postHandle:");
    }

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("-------------------------请求拦截器-------------------------");
        String path = request.getServletPath();
        System.out.println(path);
        System.out.println("-------------------------登陆认证通过-------------------------");

        String token = request.getHeader("token");  // 从 http 请求头中取出 token
        System.out.println(token);
        if (token == null) {
            System.out.println("开始重定向至404");
            response.sendRedirect("/404");
            System.out.println("重定向至404");
            return false;
        }
            // 验证 token
        JWT jwt=new JWT();
        Claims claims=jwt.pardeToken(token);
        if(claims == null){
            System.out.println("开始重定向至404");
            response.sendRedirect("/404");
            System.out.println("重定向至404");
            return false;
        }
        return true;

    }
}

