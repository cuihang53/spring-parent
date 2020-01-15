package com.ch.serviceimpl;

import com.ch.entity.User;
import com.ch.mapper.UserMapper;
import com.ch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findUserInfo() {
        return userMapper.findUserInfo();
    }
}
