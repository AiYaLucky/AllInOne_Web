package com..service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com..entity.User;
import com..service.UserService;
import com..mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author Littleway
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-04-21 14:45:44
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
implements UserService{

}
