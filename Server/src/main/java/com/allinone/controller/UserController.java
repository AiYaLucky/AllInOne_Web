package com.allinone.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xu xiao wei
 * @Date: 2022/4/13 15:28
 * @Version 1.0
 * Created by IntelliJ IDEA.
 */
@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    /**
     * 获取链接
     */
    @RequestMapping("/getUrl")
    public String get(){
        return "get";
    }
}
