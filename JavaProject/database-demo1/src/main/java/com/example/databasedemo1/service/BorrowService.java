package com.example.databasedemo1.service;

import com.example.databasedemo1.entity.Borrow;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BorrowService {
    public Borrow getByUserNameAndPassword(Borrow borrow);
    public List<Borrow> getAllBorrows();
    int addBorrows(Borrow borrow);
    int deleteById(@Param("book_id") int id);
    int updateNameById(@Param("book_id") int id , @Param("borrow") String userName);
    public List<Borrow> selectBorrowsById(@Param("book_id") int id);
}
