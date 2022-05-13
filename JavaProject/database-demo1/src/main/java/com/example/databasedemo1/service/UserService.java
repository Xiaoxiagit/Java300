package com.example.databasedemo1.service;

import com.example.databasedemo1.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    public User getByUserNameAndPassword(User user);
    public List<User> getAllUsers();
    int addUsers(User user);
    int deleteById(@Param("id") int id);
    int updateNameById(@Param("id") int id , @Param("userName") String userName);
    public List<User> selectUsersById(@Param("id") int id);
}
