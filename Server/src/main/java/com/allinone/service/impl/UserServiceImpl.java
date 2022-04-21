package com.allinone.service.impl;

import com.allinone.entity.User;
import com.allinone.mapper.UserMapper;
import com.allinone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

/**
 * @author xu xiaowei
 * @description 针对表【user】的数据库操作Service实现
 * @createDate 2022-04-21 15:40:05
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 创建一个新用户
     *
     * @param user 用户信息
     * @return 返回创建结果信息
     */
    @Override
    public int insertUser(User user) {
        //验证用户是否已经存在
        User user1 = userMapper.selectByAccount(user.getAccount());
        if (user1 != null) {
            return -1;
        }
        //初始化用户的id
        user.setId(UUID.randomUUID().toString().replace("-", ""));
        //新用户设置创建时间和初始化登录时间
        user.setLastLoginTime(new Date(System.currentTimeMillis()));
        user.setCreateTime(new Date(System.currentTimeMillis()));

        //插入数据
        return userMapper.insertByUser(user);
    }

    /**
     * 根据用户名查询用户
     *
     * @param account 用户名
     * @return 返回查询到的用户信息
     */
    @Override
    public User selectByAccount(String account) {
        return userMapper.selectByAccount(account);
    }
}
