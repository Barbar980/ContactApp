package com.bardev.capp.test.contact;

import com.bardev.capp.config.SpringRootConfig;
import com.bardev.capp.dao.ContactDAO;
import com.bardev.capp.domain.Contact;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestContactDAOSave {
    
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        ContactDAO contactDAO = ctx.getBean(ContactDAO.class);
        Contact c = new Contact();
        c.setUserId(26);
        c.setName("a");
        c.setPhone("a");
        c.setEmail("a");
        c.setAddress("a");
        c.setRemark("a");
        contactDAO.save(c);
        System.out.print("---Data Saved---");
    }
}
