package net.biancheng.www.mybatis.controller;

import net.biancheng.www.mybatis.bean.User;
import net.biancheng.www.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;


@RestController
public class LoginController {
    @Autowired
    private UserService userService;
    @RequestMapping("/user/login")
    public String doLogin(User user, Map<String, Object> map, HttpSession session) {
        //从数据库中查询用户信息
        User loginUser = userService.getByUserNameAndPassword(user);
        if (loginUser != null) {
            session.setAttribute("loginUser", loginUser);
            System.out.println("登陆成功，用户名：" + loginUser.getUserName());
            //防止重复提交使用重定向
            return "ok";
        } else {
            map.put("msg", "用户名或密码错误");
            System.out.println("登陆失败");
            return "false";
        }
    }

}
