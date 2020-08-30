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
        User u = new User("Krzysztof", "123456789", "test@test.com", "adres", "login", "haslo", 1, 1);
        userDAO.save(u);
        System.out.print("---Data Saved---");
    }
}
