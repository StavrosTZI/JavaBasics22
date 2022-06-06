package com.example.javabasics.Utility;


import java.sql.*;

public class DBconnection {
    private String url = "jdbc:postgresql://localhost:5432/JavaBasics";
    private String username  = "postgres";
    private String password = "admin";

    public void ConnectToDB() throws SQLException {
        Connection conn = DriverManager.getConnection(url,username,password);
        String sql = "SELECT surname FROM professors JOIN users u on u.id = professors.id";
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()) {
            //Display values
            System.out.print("surname: " + rs.getString("surname"));
        }
    }

}
