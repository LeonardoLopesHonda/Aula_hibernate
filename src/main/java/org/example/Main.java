package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello World!");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/lp2", "root", "");
    }
}