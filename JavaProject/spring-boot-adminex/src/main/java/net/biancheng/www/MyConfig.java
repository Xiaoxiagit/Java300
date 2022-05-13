package net.biancheng.www;

import net.biancheng.www.component.LoginInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MyConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        Logger logger= LoggerFactory.getLogger(getClass());
        logger.info("注册拦截器");
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/*").//拦截所有请求，包括静态资源文件
                excludePathPatterns("/","/login","/index.html","/user/login", "/css/**", "/images/**", "/js/**", "/fonts/**");//放行登录页，登陆操作，静态资源

    }
}
