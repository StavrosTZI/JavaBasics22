package com.example.javabasics.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name = "AssignCourseServlet", value = "/AssignCourseServlet")
public class AssignCourseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}