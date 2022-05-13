package com.example.databasedemo1.service.impl;

import com.example.databasedemo1.entity.Borrow;
import com.example.databasedemo1.entity.User;
import com.example.databasedemo1.mappers.BorrowMapper;
import com.example.databasedemo1.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BorrowServiceImpl implements BorrowService {
    @Autowired
    private BorrowMapper borrowMapper;

    @Override
    public Borrow getByUserNameAndPassword(Borrow borrow){
        Borrow loginUser = borrowMapper.getByUser(borrow);
        return loginUser;
    }
    //查
    @Override
    public List<User> getAllUsers(){
        return borrowMapper.selectAllUsers();
    }
    //增
    @Override
    public  int addUsers(User user){return borrowMapper.add(user); }
    //删
    @Override
    public int deleteById(int id){return borrowMapper.delete(id);};
    //改
    @Override
    public int updateNameById(int id,String userName){return borrowMapper.update(id,userName);};
    //查
    @Override
    public List<User> selectUsersById(int id){return  borrowMapper.select(id);};

}
