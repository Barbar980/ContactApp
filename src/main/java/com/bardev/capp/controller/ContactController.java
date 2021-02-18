/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bardev.capp.controller;

import com.bardev.capp.domain.Contact;
import com.bardev.capp.service.ContactService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Barbar
 */
@Controller
public class ContactController {
    
    @Autowired
    private ContactService contactservice;
    
    @RequestMapping(value = "/user/contact_form")
    public String contactForm(Model m){
        Contact contact = new Contact();
        m.addAttribute("command", contact);
        return "contact_form"; //JSP form view
    }
    
    @RequestMapping(value = "/user/save_contact")
    public String saveContact(@ModelAttribute("command") Contact c, Model m, HttpSession session){
       try{
            Integer userId = (Integer) session.getAttribute("userId");
            c.setUserId(userId);
            contactservice.save(c);
            return "redirect:clist?act=sv"; //redirect to contact list
       }catch(Exception e){
           e.printStackTrace();
           m.addAttribute("err", "Failed to save contact");
           return "contac_form";
       }
    }
    
    @RequestMapping(value = "/user/clist")
    public String contactList(Model m){

        return "clist"; //JSP 
    }
}
