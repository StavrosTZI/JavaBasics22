package com.example.javabasics.model;

import com.example.javabasics.Utility.DatabaseManager;
import com.example.javabasics.Utility.Query;

import java.sql.*;
import java.util.ArrayList;

public class Main {

        public static void main(String[] args) throws SQLException,NullPointerException {

            /*
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/JavaBasics","postgres","admin");
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users");
            ResultSet rs =statement.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
                System.out.println(rs.getString(5));
            }
            */
            DatabaseManager databaseManager = new DatabaseManager();
            Connection connection= databaseManager.getConnection();
            ArrayList<Grades> grades = Grades.getMultipleFromDatabase(Query.getGradesByStudent(connection,5));
            for (Grades g : grades){
                System.out.println(g.getCourse()+g.getDate()+g.getStudent()+g.getGrade());
            }

            }









    }













