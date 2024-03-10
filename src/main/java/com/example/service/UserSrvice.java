package com.example.service;

import com.example.dao.UserDao;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.soap.Addressing;
@Service
public class UserSrvice {
   @Autowired
    private UserDao userDao;
    public int createUser (User user) {
        return this.userDao.saveUser(user);

    }
}
