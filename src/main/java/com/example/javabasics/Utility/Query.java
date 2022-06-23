package com.example.javabasics.Utility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Query {
    private Query(PreparedStatement statement) { this.statement = statement; }

    private final PreparedStatement statement;
    public PreparedStatement getStatement() { return statement; }

    public static Query getStudentByUsername(Connection connection, String username) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("select * from users join students on users.id=students.id where users.username=?");
        statement.setString(1, username);
        return new Query(statement);
    }

    public static Query getProfessorByUsername(Connection connection, String username) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("select * from users join professors on users.id=professors.id where users.username=? ");
        statement.setString(1, username);
        return new Query(statement);
    }

    public static Query getSecretaryByUsername(Connection connection, String username) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("select * from users where username=?");
        statement.setString(1, username);
        return new Query(statement);
    }
    public static  Query getAllProfessors(Connection connection)throws SQLException{
        return new Query(connection.prepareStatement("select * from  users join professors on users.id=professors.id"));

    }

    public static  Query getAllStudents(Connection connection)throws SQLException{
        return new Query(connection.prepareStatement("select * from  users join students on users.id=students.id"));

    }
    public static  Query getAllSecretaries(Connection connection)throws SQLException{
        return new Query(connection.prepareStatement("select * from  users join secretaries on users.id=secretaries.id"));

    }
    public static  Query getAllCourses(Connection connection)throws SQLException{
        return new Query(connection.prepareStatement("select courses.id,courses.name,courses.semester,users.name as profname,users.surname,courses.department from courses join professors on courses.professor=professors.id\n" +
                "join users on professors.id = users.id"));

    }

}
