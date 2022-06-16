package com.example.javabasics.model;

import com.example.javabasics.Utility.DatabaseManager;
import org.postgresql.core.Query;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Course {
    private int id ;
    private String name;
    private int semester ;
    private String  professor ;
    private Department department;


    public Course(ResultSet resultSet) {
        try {
            DatabaseManager databaseManager = new DatabaseManager();
            Connection connection = databaseManager.getConnection();

            id = resultSet.getInt("id");
            name = resultSet.getString("name");
            semester = resultSet.getInt("semester");
            professor = resultSet.getString("professor");
            department = Department.valueOf(resultSet.getString("department"));

            databaseManager.closeConnection();
        } catch (SQLException ex) {
            System.out.println("An error occurred while creating scheduled appointment from result set");
            System.out.println(ex.toString());
        }

    }
    public Course(int id, String name, int semester, String professor, Department department) {
        this.id = id;
        this.name = name;
        this.semester = semester;
        this.professor = professor;
        this.department = department;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void addToDatabase(Connection connection) {

    }

    public void removeFromDatabase(Connection connection) {

    }
    //public static Course getFromDatabase(Query query) {

   // }

    //public static ArrayList<Course> getMultipleFromDatabase(Query query) {}
}
