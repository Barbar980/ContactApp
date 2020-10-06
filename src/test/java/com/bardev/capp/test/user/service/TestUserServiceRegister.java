package com.bardev.capp.test.user.service;

import com.bardev.capp.config.SpringRootConfig;
import com.bardev.capp.domain.User;
import com.bardev.capp.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserServiceRegister {
    
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserService userService = ctx.getBean(UserService.class);
        
        User u = new User();
        u.setName("testSerivce");
        u.setPhone("testSerivce");
        u.setEmail("testSerivce@test.abc");
        u.setAddress("testSerivce");
        u.setLoginName("testSerivce");
        u.setPassword("testSerivce");
        u.setRole(UserService.ROLE_ADMIN);
        u.setLoginStatus(UserService.LOGIN_STATUS_ACTIVE);      
        userService.register(u);   
        System.out.print("---Data Registered Succesfully---");
    }
}
