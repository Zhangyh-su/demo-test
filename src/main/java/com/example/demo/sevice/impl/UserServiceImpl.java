package com.example.demo.sevice.impl;

import com.example.demo.dao.UserMapper;
import com.example.demo.model.User;
import com.example.demo.sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserMapper userMapper;


    @Override
    public User loginIn(String name, String password) {
        return userMapper.getInfo(name, password);
    }
}
