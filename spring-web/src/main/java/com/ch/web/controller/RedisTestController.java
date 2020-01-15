package com.ch.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

@RestController
@RequestMapping(value="/api/redis")
public class RedisTestController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @RequestMapping(value="/test/{param}", method = RequestMethod.GET)
    public String  redisTest(@PathVariable("param") String param){
        stringRedisTemplate.opsForValue().set(param,"測試String");

        System.out.println( stringRedisTemplate.opsForValue().get(param));
        return null;
    }
}
