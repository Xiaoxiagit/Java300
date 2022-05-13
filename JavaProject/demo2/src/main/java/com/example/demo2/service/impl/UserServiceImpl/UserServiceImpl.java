package com.example.demo2.service.impl.UserServiceImpl;

import com.example.demo2.entity.User;
import com.example.demo2.mappers.UserMapper;
import com.example.demo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("userservice")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getByUserNameAndPassword(User user){
        User loginUser= userMapper.getByUser(user);
        return loginUser;
    }
    @Override
    public List<User> getAllUsers(){
        return userMapper.selectAllUsers();
    }
}
