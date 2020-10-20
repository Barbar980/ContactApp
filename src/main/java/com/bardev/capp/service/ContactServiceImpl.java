package com.bardev.capp.service;

import com.bardev.capp.dao.BaseDAO;
import com.bardev.capp.dao.ContactDAO;
import com.bardev.capp.domain.Contact;
import com.bardev.capp.util.StringUtil;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl extends BaseDAO implements ContactService{

    @Autowired
    private ContactDAO contactDAO;
    
    @Override
    public void save(Contact c) {
        contactDAO.save(c);
    }

    @Override
    public void update(Contact c) {
        contactDAO.update(c);
    }

    @Override
    public void delete(Integer contactId) {
        contactDAO.delete(contactId);
    }

    @Override
    public void delete(Integer[] contactIds) {
        String ids = StringUtil.toCommaSeparatedString(contactIds);
        String sql = "DELETE FROM contact WHERE contactId IN("+ids+")";
    }

    @Override
    public List<Contact> findUserContact(Integer userId) {
        
    }

    @Override
    public List<Contact> findUserContact(Integer userId, String txt) {
        
    }
    
    
    
    
}
