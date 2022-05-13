package com.example.databasedemo1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Borrow {
    private Integer id;
    private String stuID;
    private Date borrow_date;
    private Date return_date;
    private String renew;
}
