package com.example.databasedemo1.controller;

import com.example.databasedemo1.entity.Book;
import com.example.databasedemo1.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class BookController {
    @Autowired
    private BookService bookService;
    //增加
    @GetMapping("/add/books")
    public int addUsers(Book book){
        int a = bookService.addBooks( book);
        return a;
    }
    //删除
    @GetMapping("/delete/books")
    public int deleteById(int book_id){
        int d = bookService.deleteById(book_id);
        return d;
    }

    //修改
    @GetMapping("/update/books")
    public int updateNameById( int book_id,String userName){
        int u = bookService.updateNameById(book_id,userName);
        return u;
    }

    //查询
    @GetMapping("/display/users")
    public String selectUsersById(int book_id) {
        List<Book> book = bookService.selectBooksById(book_id );
        return book.toString();
    }

}
