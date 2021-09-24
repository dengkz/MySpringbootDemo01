package com.deng.myspringbootdemo01.service.user.impl;

import com.deng.myspringbootdemo01.dao.UserMapper;
import com.deng.myspringbootdemo01.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceimpl  implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String getAllUser() {
        String str = userMapper.getAllUser();

        return str;
    }

    @Override
    public String getUserByName(String name) {
        return null;
    }
}
