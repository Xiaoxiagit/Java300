package com.example.databasedemo1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Integer book_id;
    private String type_id;
    private String type_name;
    private String book_name;
    private String book_writer;
    private String book_company;
    private Date book_date;
    private String book_brief;
}
