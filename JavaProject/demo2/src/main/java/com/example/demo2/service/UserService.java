package com.example.demo2.service;

import com.example.demo2.entity.User;

import java.util.List;

public interface UserService {
    public User getByUserNameAndPassword(User user);
    public List<User> getAllUsers();
}
