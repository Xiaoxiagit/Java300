package net.biancheng.www.mybatis.service.impl;

import net.biancheng.www.mybatis.bean.User;
import net.biancheng.www.mybatis.mappers.UserMapper;
import net.biancheng.www.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getByUserNameAndPassword(User user) {
        User loginUser = userMapper.getByUserNameAndPassword(user);
        return loginUser;
    }
}
