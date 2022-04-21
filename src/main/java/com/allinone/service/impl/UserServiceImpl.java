package com.allinone.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.allinone.User;
import com.allinone.service.UserService;
import com.allinone.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author Littleway
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-04-21 15:14:34
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
implements UserService{

}
