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
        PreparedStatement statement = connection.prepareStatement("select * from \"users\" where \"username\"=?");
        statement.setString(1, username);
        return new Query(statement);
    }

    public static Query getSecretaryByUsername(Connection connection, String username) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("select * from \"users\" where \"username\"=?");
        statement.setString(1, username);
        return new Query(statement);
    }
}
