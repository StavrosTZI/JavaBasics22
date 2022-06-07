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
        int test=123;
        request.setAttribute("test",test);
        RequestDispatcher rd= request.getRequestDispatcher("secretaryView.jsp");
        rd.forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);


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
