package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.sevice.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {


    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    public UserService userService;

    @GetMapping("/index")
    public String sayHello(){
        logger.info("index:{}","index");
        return "index";
    }


    @GetMapping("login")
    public String loginPage(){
        return "login";
    }


    @PostMapping("loginIn")
    public String login(String name,String password){
        User user = userService.loginIn(name, password);
        if (null == user){
            return "error";
        }
        return "success";
    }

}
