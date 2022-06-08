package com.example.javabasics.servlets;

import com.example.javabasics.Utility.DBconnection;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "SecretaryServlet", value = "/SecretaryServlet")
public class SecretaryServlet extends HttpServlet {

    public void init(ServletConfig config) {
        System.out.println("Servlet is being initialized");
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out= response.getWriter();
        out.println("<B><BR>User:" + request.getParameter("user"));
        out.println
                (", Employee number:" + request.getAttribute("name") + "</B>");
        this.getServletContext().getRequestDispatcher("/secretaryServlet.jsp").
                include(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doGet(request,response);

    }
    public ArrayList<String> getDepartments() throws SQLException {
        ArrayList<String> departments= new ArrayList<>();
        Connection conn = DBconnection.ConnectToDB();
        String sql = "SELECT name FROM departments";
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()) {
            departments.add(rs.getString("name"));

        }
        return departments;
    }
}
