package net.biancheng.www.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Slf4j
@Controller
public class LoginController {
    @RequestMapping("/user/login")
    public String doLogin(User user, Map<String, Object> map, HttpSession session){
        if(user !=null && StringUtils.hasText(user.getUserName()) && "123456".equals(user.getPassword())){
            session.setAttribute("loginUser",user);
            log.info("登录成功，用户名："+user.getUsername());
            //防止重复提交使用重定向
            return "redict:/main.html";
        } else {
            map.put("msg","用户名或密码错误");
            log.error("登录失败");
            return "login";
        }
     }

     /*
    @RequestMapping("/main.html")
    public String mainPage(){
        return "main";
    }*/

}
