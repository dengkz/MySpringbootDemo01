package com.deng.myspringbootdemo01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.deng.myspringbootdemo01.dao")
public class MySpringbootDemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(MySpringbootDemo01Application.class, args);
    }

}
