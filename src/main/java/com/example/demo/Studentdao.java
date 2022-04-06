package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Studentdao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void createTable(){
        var query = "CREATE TABLE Student(name varchar(255), city varchar(255))";
        int update = this.jdbcTemplate.update(query);
        System.out.println(update);
        }

}
