package net.biancheng.www.controller;

import net.biancheng.www.componet.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class MyConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        log.info("注册拦截器");
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**")//拦截所有请求，包括静态资源文件
                .excludePathPatterns("/","/login","/index.html","/user/login","/css/**","/images/**","/js/**","/fonts/**") ; //放行登录页，登陆操作，静态资源
    }
    //addPathPatterns：该方法用于指定拦截路径，例如拦截路径为“/**”，表示拦截所有请求，包括对静态资源的请求。
    //excludePathPatterns：该方法用于排除拦截路径，即指定不需要被拦截器拦截的请求。
}
