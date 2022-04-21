package com.allinone.mapper;

import com.allinone.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author xu xiaowei
 * @description 针对表【user】的数据库操作Mapper
 * @createDate 2022-04-21 15:40:05
 * @Entity com.allinone.entity.User
 */
@Mapper
public interface UserMapper {

    /**
     * 插入用户信息
     *
     * @param user 用户信息
     * @return 返回执行结果
     */
    int insertByUser(User user);

    /**
     * 根据用户名查询用户信息
     *
     * @param account 用户名
     * @return 返回用户信息
     */
    User selectByAccount(String account);
}
