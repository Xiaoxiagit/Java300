package com.example.databasedemo1.controller;

import com.example.databasedemo1.entity.User;
import com.example.databasedemo1.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user/login")
    public String doLogin(User user, Map<String,Object> map, HttpSession session){
        //从数据库中查询用户信息
        User loginUser = userService.getByUserNameAndPassword(user);
        if(loginUser != null){
            session.setAttribute("loginUser",loginUser);
            System.out.println("登录成功，用户名："+loginUser.getUserName());
            //防止重复提交使用重定向
            return "ok";
        }else{
            map.put("msg","用户名或密码错误");
            System.out.println("登陆失败");
            return "false";
        }
    }

    @GetMapping("/show/users")
    public String showUsers(){
        List<User> users =userService.getAllUsers();
        return users.toString();
    }
    //增加
    @GetMapping("/add/users")
    public int addUsers(User user){
        int a = userService.addUsers( user);
        return a;
    }
    //删除
    @GetMapping("/delete/users")
    public int deleteById(int id){
        int d = userService.deleteById(id);
        return d;
    }

    //修改
    @GetMapping("/update/users")
    public int updateNameById( int id,String userName){
        int u = userService.updateNameById(id,userName);
        return u;
    }

    //查询
    @GetMapping("/display/users")
    public String selectUsersById(int id) {
        List<User> user = userService.selectUsersById(id );
        return user.toString();
    }


}
