package com.bardev.capp.test;

import com.bardev.capp.config.SpringRootConfig;
import com.bardev.capp.dao.UserDAO;
import com.bardev.capp.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserDAOSave {
    
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserDAO userDAO = ctx.getBean(UserDAO.class);
        User u = new User();
        u.setName("test");
        u.setPhone("test");
        u.setEmail("test@test.abc");
        u.setAddress("test");
        u.setLoginName("test");
        u.setPassword("test");
        u.setRole(1);
        u.setLoginStatus(1);      
        userDAO.save(u);
        u.setName("test");
        System.out.print("---Data Saved---");
    }
}
