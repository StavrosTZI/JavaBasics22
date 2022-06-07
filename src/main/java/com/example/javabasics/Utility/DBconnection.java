package com.example.javabasics.Utility;


import java.sql.*;

public class DBconnection {
    static private String url = "jdbc:postgresql://localhost:5432/JavaBasics";
     static private String username  = "postgres";
    static private String password = "admin";

    public static  Connection ConnectToDB() throws SQLException {
        Connection conn = DriverManager.getConnection(url,username,password);
        return  conn;
    }

}
