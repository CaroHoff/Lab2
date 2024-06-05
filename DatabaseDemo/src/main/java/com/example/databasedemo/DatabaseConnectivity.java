package com.example.databasedemo;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnectivity {
    public Connection databaseLink;

    public Connection getConnection() {
        String databaseName = "sample";
        String databaseUser = "root";
        String databasePassword = "NewJob2024@@";
        String url = "jdbc:mysql://127.0.0.1:3307/" + databaseName;
        try {
            databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return databaseLink;
    }
}
