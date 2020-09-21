package com.bardev.capp.test.contact;

import com.bardev.capp.config.SpringRootConfig;
import com.bardev.capp.dao.ContactDAO;
import com.bardev.capp.domain.Contact;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestContactDAOUpdate {
    
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        ContactDAO contactDAO = ctx.getBean(ContactDAO.class);
        Contact c = new Contact();
        c.setContactId(6);
        c.setUserId(26);
        c.setName("nameUpdate");
        c.setPhone("numberUpdate");
        c.setEmail("emailUpdate");
        c.setAddress("addressUpdate");
        c.setRemark("remarkUpdate");
        contactDAO.update(c);
        System.out.print("---Data Update---");
    }
}
