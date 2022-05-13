package net.biancheng.www.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Slf4j
@Controller
public class LoginController {
    @RequestMapping("/user/login")
    public String doLogin(User user, Map<String,Object> map, HttpSession session){
        Logger logger = LoggerFactory.getLogger(getClass());
        if(user!=null && StringUtils.hasText(user.getUserName()) && "12345".equals(user.getPassword())){

            session.setAttribute("loginUser",user);
            log.info("登陆成功，用户名："+user.getUserName());
            //防止重复提交使用重定向
            return "redirect:/main.html";
        }else {
            map.put("msg","用户名或密码错误");
            logger.error("登录失败");
            return "login";
        }
    }
    /*
    @RequestMapping("/main.html")
    public String mainPage(){
        return "main";
    }*/
}
