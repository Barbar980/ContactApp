package com.bardev.capp.test.user;

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
        u.setName("admin");
        u.setPhone("admin");
        u.setEmail("admin");
        u.setAddress("admin");
        u.setLoginName("admin");
        u.setPassword("admin");
        u.setRole(2);
        u.setLoginStatus(2);      
        userDAO.save(u);      
        System.out.print("---Data Saved---");
    }
}
