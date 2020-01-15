package com.ch.web.controller;


import com.ch.entity.User;
import com.ch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserService userServiceImpl;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> list() {
             List<User> list = userServiceImpl.findUserInfo();
             return list;
       }
}
