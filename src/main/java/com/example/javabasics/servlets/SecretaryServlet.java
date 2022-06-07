package com.example.javabasics.servlets;

import com.example.javabasics.Utility.DBconnection;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "SecretaryServlet", value = "/SecretaryServlet")
public class SecretaryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            ArrayList departments = getDepartments();
            request.setAttribute("departments",departments);
            request.getRequestDispatcher("secretaryView.jsp").forward(request,response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public ArrayList<String> getDepartments() throws SQLException {
        ArrayList<String> departments= new ArrayList<>();
        Connection conn = DBconnection.ConnectToDB();
        String sql = "SELECT * FROM departments";
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()) {
            departments.add(rs.getString("name"));

        }
        return departments;
    }
}
