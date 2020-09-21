package com.bardev.capp.dao;

import com.bardev.capp.domain.Contact;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import org.springframework.stereotype.Repository;

@Repository
public class ContactDAOImpl extends BaseDAO implements ContactDAO{

    @Override
    public void save(Contact c) {
        String sql = "INSERT INTO contact(userId, name, phone, email, address, remark)"
                + " VALUES(:userId, :name, :phone, :email, :address, :remark)";
        Map m = new HashMap();
        m.put("userId", c.getUserId());
        m.put("name", c.getName());
        m.put("phone", c.getPhone());
        m.put("email", c.getEmail());
        m.put("address", c.getAddress());
        m.put("remark", c.getRemark());

        SqlParameterSource ps = new MapSqlParameterSource(m);
        KeyHolder kh = new GeneratedKeyHolder();
        getNamedParameterJdbcTemplate().update(sql, ps, kh);
        c.setUserId(kh.getKey().intValue());
    }

    @Override
    public void update(Contact c) {
       String sql = "UPDATE contact "           
               + "SET "
               + "name=:name, "
               + "phone=:phone, "
               + "email=:email, "
               + "address=:address, "
               + "remark=:remark, "
               + "WHERE contactId=:contactId";
        Map m = new HashMap();
        //dodac userId a usunac contactID
        m.put("contactId", c.getContactId());
        m.put("name", c.getName());
        m.put("phone", c.getPhone());
        m.put("email", c.getEmail());
        m.put("address", c.getAddress());
        m.put("remark", c.getRemark());
        getNamedParameterJdbcTemplate().update(sql, m);
    }

    @Override
    public void delete(Contact c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Integer userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Contact findById(Integer contactId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Contact> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Contact> findByProperty(String propname, Object propValue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
