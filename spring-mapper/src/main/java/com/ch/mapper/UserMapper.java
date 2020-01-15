package com.ch.mapper;

import com.ch.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {

    public List<User> findUserInfo();
}
