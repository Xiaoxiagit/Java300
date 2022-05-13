package net.biancheng.www.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Autowired
    private Person person;
    @Autowired
    private Dog dog;

    @ResponseBody
    @RequestMapping("/hello")
    public Person hello(){

        return person;
    }

    @ResponseBody
    @RequestMapping("/hi")
    public Dog hi(){
        return dog;
    }
}
