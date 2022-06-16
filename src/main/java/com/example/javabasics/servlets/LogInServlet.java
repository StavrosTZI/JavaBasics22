package com.example.javabasics.servlets;

import com.example.javabasics.Utility.DatabaseManager;
import com.example.javabasics.model.Professor;
import com.example.javabasics.model.Secretary;
import com.example.javabasics.model.Student;
import com.example.javabasics.model.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "LogInServlet", value = "/LogInServlet")
public class LogInServlet extends HttpServlet {

    private static Boolean isLoggedIn;
    private static String whoLoggedIn;
    private String address;

    public static String getWhoLoggedIn() { return whoLoggedIn; }

    public static void setWhoLoggedIn(String whoLoggedIn) {
        LogInServlet.whoLoggedIn = whoLoggedIn;
    }

    public static Boolean getLoggedIn() {
        return isLoggedIn;
    }

    public static void setLoggedIn(Boolean loggedIn) { isLoggedIn = loggedIn; }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        DatabaseManager database = new DatabaseManager();
        User user = User.login(username, password);

        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();

        if (user instanceof Student)
        {
            System.out.println("The user is a student");
            Student student = (Student)user;
            //SessionManager.preparePatientSession(student, session);
            isLoggedIn = true;
            whoLoggedIn = "student";
            address= "/studentView.jsp";
        }
        else if (user instanceof Professor) {
            System.out.println("The user is a professor");
            Professor professor = (Professor)user;
           // SessionManager.prepareDoctorSession(professor,session);
            setLoggedIn(true);
            setWhoLoggedIn("professor");
            address = "/professorView.jsp";
        }
        else if (user instanceof Secretary) {
            System.out.println("The user is an secretary");
            Secretary secretary = (Secretary) user;
            //SessionManager.prepareAdminSession(secretary,session); // preparing secretary's session

            setWhoLoggedIn("secretary");
            setLoggedIn(true);
            address = "/secretaryView.jsp";


        }
        else
        {
            System.out.println("Error, Invalid username or password");
            request.setAttribute("error","Invalid Username or Password");
            address = "/index.jsp";
        }

        database.closeConnection();
        RequestDispatcher dispatcher = request.getRequestDispatcher(address);
        dispatcher.forward(request,response);
    }
}
