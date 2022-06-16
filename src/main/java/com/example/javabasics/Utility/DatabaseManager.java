package com.example.javabasics.Utility;


import java.sql.*;

public class DatabaseManager {
    private Connection connection;
    static private String url = "jdbc:postgresql://localhost:5432/JavaBasics";
     static private String username  = "postgres";
    static private String password = "admin";

    public static  Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(url,username,password);
        return  connection;
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("An error occurred while trying to terminate the connection to the database");
        }
    }

}
