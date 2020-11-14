package com.bardev.capp.controller;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    
    @RequestMapping("/test")
    public String helloWorld(){
        return "helloWorld" ; // -> /WEB-INF/view/hello.jsp
    }
}