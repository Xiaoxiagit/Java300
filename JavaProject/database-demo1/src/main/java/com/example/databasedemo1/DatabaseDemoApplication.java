package com.example.databasedemo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.databasedemo1.mappers")
public class DatabaseDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DatabaseDemoApplication.class, args);
    }
}
