package com.example.databasedemo1.service.impl;

import java.util.List;
import com.example.databasedemo1.entity.User;
import com.example.databasedemo1.mappers.UserMapper;
import com.example.databasedemo1.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getByUserNameAndPassword(User user){
        User loginUser = userMapper.getByUser(user);
        return loginUser;
    }
//查
    @Override
    public List<User> getAllUsers(){
        return userMapper.selectAllUsers();
    }
//增
    @Override
    public  int addUsers(User user){return userMapper.add(user); }
//删
    @Override
    public int deleteById(int id){return userMapper.delete(id);};
//改
    @Override
    public int updateNameById(int id,String userName){return userMapper.update(id,userName);};
//查
    @Override
    public List<User> selectUsersById(int id){return  userMapper.select(id);};
}
