package com.baidu.yxx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//请求路径
@RequestMapping("/hello")
public class HelloWorld {
    @GetMapping("/say")
    public String sayHello() {
        return "sayhello";
    }
}
