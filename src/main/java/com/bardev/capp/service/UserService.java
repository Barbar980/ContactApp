package com.bardev.capp.service;

import com.bardev.capp.domain.User;
import com.bardev.capp.exception.UserBlockedException;
import java.util.List;

public interface UserService {
    
    public static final Integer LOGIN_STATUS_ACTIVE=1;
    public static final Integer LOGIN_STATUS_BLOCKED=2;
 
    public static final Integer ROLE_ADMIN=1;
    public static final Integer ROLE_USER=2;
    
    public void register(User u);
    
    public User login(String loginName, String password) throws UserBlockedException;
    
    public List<User> userList(); 
    
    public void changeLoginStatus(Integer userId, Integer loginStatus);
}
