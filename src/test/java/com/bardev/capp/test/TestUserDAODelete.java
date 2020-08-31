package com.bardev.capp.test;

import com.bardev.capp.config.SpringRootConfig;
import com.bardev.capp.dao.UserDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserDAODelete {
  
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserDAO userDAO = ctx.getBean(UserDAO.class);
        userDAO.delete(15);
        System.out.print("---Data Updated---");
    }
}
