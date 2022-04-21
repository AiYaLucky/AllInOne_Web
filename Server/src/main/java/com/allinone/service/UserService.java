package com.allinone.service;


import com.allinone.entity.User;

/**
 * @author Littleway
 * @description 针对表【user】的数据库操作Service
 * @createDate 2022-04-21 15:40:05
 */
public interface UserService {

    /**
     * 插入用户信息
     *
     * @param user 用户信息
     * @return 返回执行的结果
     */
    int insertUser(User user);

    /**
     * 根据用户名查询用户信息
     *
     * @param account 用户名
     * @return 返回查询的用户信息
     */
    User selectByAccount(String account);

}
