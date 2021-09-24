package com.deng.myspringbootdemo01.Controller;


import com.deng.myspringbootdemo01.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MybatisController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/mybatis")
    public String mybatis(){
        String result = "0";

        result = userService.getAllUser();

        return result;
    }

}
