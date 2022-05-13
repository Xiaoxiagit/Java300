package net.biancheng.www.controller;

import net.biancheng.www.componet.LoginInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        //在配置类 MyMvcConfig 中，添加以下方法注册拦截器
        registry.addInterceptor(new LoginInterceptor());
    }

    public void addViewControllers(ViewControllerRegistry registry){
        //当访问 “/" 或 ”/index.html" 时，都直接跳转到登陆页面
        registry.addViewController("/").setViewName("login");
        //添加视图映射main.html指向dashboard.html
        registry.addViewController("/main.html").setViewName("main");
    }
}
