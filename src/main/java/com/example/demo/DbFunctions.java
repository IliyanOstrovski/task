package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbFunctions {
    public Connection connection_to_db(String dbname, String user, String password) {
        Connection conn = null;

        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbname, user, password);
            if (conn != null) {
                System.out.println("Connection established");
            } else {
                System.out.println("Connection failed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }
}
