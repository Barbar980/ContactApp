package com.bardev.capp.dao;

import com.bardev.capp.domain.User;
import java.util.List;


public interface UserDAO {
    
    public void save(User u);
    
    public void update(User u);
    
    public void delete(User u);
    
    public void delete(Integer userId);
    
    public User findById(Integer userId);
    
    public List<User> findAll();
    
    public List<User> findByProperty(String propname, Object propValue);
}
