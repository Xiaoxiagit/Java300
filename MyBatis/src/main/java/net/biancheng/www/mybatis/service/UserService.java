package net.biancheng.www.mybatis.service;

import net.biancheng.www.mybatis.bean.User;

public interface UserService {
    public User getByUserNameAndPassword(User user);
}
