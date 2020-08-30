package com.bardev.capp.dao;

import com.bardev.capp.domain.Contact;
import java.util.List;

public interface ContactDAO {
    
    public void save(Contact c);
    
    public void update(Contact c);
    
    public void delete(Contact c);
    
    public void delete(Integer userId);
    
    public Contact findById(Integer contactId);
    
    public List<Contact> findAll();
    
    public List<Contact> findByProperty(String propname, Object propValue);
}
