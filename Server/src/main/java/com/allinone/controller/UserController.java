package com.allinone.controller;

import com.alibaba.fastjson.JSON;
import com.allinone.entity.User;
import com.allinone.view.LoginVo;
import com.allinone.view.RegisterVo;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * @Author: xu xiao wei
 * @Date: 2022/4/21 10:26
 * @Version 1.0
 * Created by IntelliJ IDEA.
 */

@RequestMapping("/user")
@RestController
@CrossOrigin
public class UserController {
    public static final HashMap<String, User> USER_ONLINE = new HashMap<>();

    /**
     * 用户登录
     *
     * @return 返回登录成功的信息
     */
    @PostMapping("/login")
    public String login(LoginVo loginvo) {
        User user = new User();
        /*
        *这里从数据库查询玩家的数据然后插入内存数据中。
        */
        user.setLastLoginTime(System.currentTimeMillis());
        USER_ONLINE.put(loginvo.getAccount(), user);
        String result = JSON.toJSONString(USER_ONLINE.get(loginvo.getAccount()));
        return result;
    }

    /**
     * 用户注册
     *
     * @return 返回注册成功的信息
     */
    @PostMapping("/register")
    public String register(RegisterVo registervo) {
        System.out.println(registervo);
        return "register";
    }
}

