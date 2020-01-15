package com.ch.service;


import com.ch.entity.User;
import org.springframework.stereotype.Component;
import java.util.List;

public interface UserService {


    public List<User> findUserInfo();
}
