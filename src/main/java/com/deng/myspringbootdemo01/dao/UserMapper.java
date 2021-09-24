package com.deng.myspringbootdemo01.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    String getAllUser();
    String getUserByName(String name);
}
