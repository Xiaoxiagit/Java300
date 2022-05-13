package com.example.databasedemo1.service;

import com.example.databasedemo1.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    public Book getByBookNameAndPassword(Book book);
    public List<Book> getAllBooks();
    int addBooks(Book book);
    int deleteById(@Param("book_id") int id);
    int updateNameById(@Param("book_id") int id , @Param("bookName") String bookName);
    public List<Book> selectBooksById(@Param("book_id") int id);
}
