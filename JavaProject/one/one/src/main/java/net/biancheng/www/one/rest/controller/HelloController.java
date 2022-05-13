package net.biancheng.www.one.rest.controller;

import net.biancheng.www.one.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @RequestMapping("/getUser")
    public User getUser(){
        User user = new User();
        user.setUserName("小明");
        user.setPassWord("xxxx");
        return user;
    }
}
