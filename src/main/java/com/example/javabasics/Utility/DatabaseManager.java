package com.example.javabasics.Utility;


import java.sql.*;

public class DatabaseManager {
    private Connection connection;
    private static int countOpenConnections = 0;
    static private String url = "jdbc:postgresql://localhost:5432/JavaBasics";
     static private String username  = "postgres";
    static private String password = "admin";

    public DatabaseManager() throws SQLException {
        createConnection();
        countOpenConnections++;
    }
    public Connection getConnection() { return connection; }
    public static int getOpenConnectionsCount() { return countOpenConnections; }


    public void  createConnection() throws SQLException {
        try {
             connection = DriverManager.getConnection(url, username, password);
        }catch (SQLException e){
            System.out.println("An error occurred while connecting to the database");
            System.out.println(e.getMessage());
        }
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("An error occurred while trying to terminate the connection to the database");
        }
    }

}
