package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Map<String,Object> map){
        map.put("name", "编程帮（www.biancheng.net）");
        return "hello";
    }
}
