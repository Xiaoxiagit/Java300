package com.example.databasedemo1.controller;

import com.example.databasedemo1.entity.Borrow;
import com.example.databasedemo1.entity.User;
import com.example.databasedemo1.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class BorrowController {
    @Autowired
    private BorrowService borrowService;
    //增加
    @GetMapping("/add/borrow")
    public int addUsers(Borrow borrow){
        int a = borrowService.addBorrows( borrow);
        return a;
    }
    //删除
    @GetMapping("/delete/borrow")
    public int deleteById(int id){
        int d = borrowService.deleteById(id);
        return d;
    }

    //修改
    @GetMapping("/update/borrow")
    public int updateNameById( int id,String userName){
        int u = borrowService.updateNameById(id,userName);
        return u;
    }

    //查询
    @GetMapping("/display/borrow")
    public String selectBorrowsById(int id) {
        List<Borrow> borrow = borrowService.selectBorrowsById(id );
        return borrow.toString();
    }

}
