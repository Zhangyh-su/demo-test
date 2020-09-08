package com.example.demo.dao;


import com.example.demo.model.User;

public interface UserMapper {

    User getInfo(String username,String password);

}
