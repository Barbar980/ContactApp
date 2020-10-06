package com.bardev.capp.test.user;
        
import com.bardev.capp.config.SpringRootConfig;
import com.bardev.capp.dao.UserDAO;
import com.bardev.capp.domain.User;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestUserDAOFindByProp {
        public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserDAO userDAO = ctx.getBean(UserDAO.class);
        
        //List<User> users = userDAO.findByProperty("userId", 1);
        List<User> users = userDAO.findByProperty("name", "test");
        for(User u: users){
            System.out.println("---User detail---");
            System.out.println(u.getUserId()+" "+u.getName()+" "+ u.getRole());     
        }
        


    }
    
}


