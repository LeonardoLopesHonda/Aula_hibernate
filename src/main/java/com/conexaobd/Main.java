package com.conexaobd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/lp2", "root", "root");
    }
}