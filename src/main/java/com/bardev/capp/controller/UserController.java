package com.bardev.capp.controller;

import com.bardev.capp.command.LoginCommand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    
    @RequestMapping(value = {"/", "/index"})
    public String index(Model m){
        m.addAttribute("command", new LoginCommand());
        return "index";
    }
    
    @RequestMapping(value = "/user/dashboard")
    public String userDashboard(){
        return "dashboard_user";
    }
    
    @RequestMapping(value = "/admin/dashboard")
    public String adminDashboard(){
        return "dashboard_admin";
    }
    
    
}
