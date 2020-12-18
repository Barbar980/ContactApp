package com.bardev.capp.command;

import com.bardev.capp.domain.User;

public class UserCommand {
    User user;
    
    public User getUser(){
        return user;
    }
    
    public void setUser(User user){
        this.user = user;
    }
    
}
