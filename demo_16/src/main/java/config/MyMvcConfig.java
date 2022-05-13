package config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
//实现 WebMvcConfigurer 接口可以来扩展 SpringMVC 的功能
@EnableWebMvc   //不要接管SpringMVC
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //当访问 “/” 或 “/index.html” 时，都直接跳转到登陆页面
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
    }
}