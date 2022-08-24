package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        DbFunctions db = new DbFunctions();
        db.connection_to_db("testDB", "postgres", "20Bet-2802");
        SpringApplication.run(DemoApplication.class, args);
    }

}
