package com.bardev.capp.test;

import com.bardev.capp.config.SpringRootConfig;
import com.bardev.capp.dao.UserDAO;
import com.bardev.capp.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserDAOUpdate {
    
    public static void main(String[] args){       
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserDAO userDAO = ctx.getBean(UserDAO.class);
        User u = new User();
        u.setUserId(26);
        u.setName("asxdas");
        u.setPhone("numberUpdate");
        u.setEmail("@Update");
        u.setAddress("adresUpdate");
        u.setRole(0);
        u.setLoginStatus(0);  
        userDAO.update(u);
        System.out.print("---Data Update---");
    }
}
