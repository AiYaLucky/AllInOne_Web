package com.allinone.controller;

import com.alibaba.fastjson.JSON;
import com.allinone.entity.User;
import com.allinone.service.UserService;
import com.allinone.view.LoginVo;
import com.allinone.view.RegisterVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
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

    @Autowired
    private UserService userService;

    /**
     * 用户登录
     *
     * @return 返回登录成功的信息
     */
    @PostMapping("/login")
    public String login(LoginVo loginvo) {
        String account = loginvo.getAccount();

        //内存中是否有用户的数据信息。
        if (!USER_ONLINE.containsKey(account)) {
            //如果内存中没有该用户的数据，则查询数据库。
            USER_ONLINE.put(loginvo.getAccount(), userService.selectByAccount(account));
        }

        //获取用户信息。
        User user = USER_ONLINE.get(account);

        //更新用户的最后登录时间
        user.setLastLoginTime(new Date(System.currentTimeMillis()));

        //用户数据转json字符串
        return JSON.toJSONString(USER_ONLINE.get(account));
    }

    /**
     * 用户注册
     *
     * @return 返回注册成功的信息
     */
    @PostMapping("/register")
    public String register(User user) {
        //添加用户
        userService.insertUser(user);
        return JSON.toJSONString(user);
    }
}

