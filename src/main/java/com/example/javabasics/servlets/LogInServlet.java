package com.example.javabasics.servlets;

import com.example.javabasics.Utility.DatabaseManager;
import com.example.javabasics.model.Professor;
import com.example.javabasics.model.Secretary;
import com.example.javabasics.model.Student;
import com.example.javabasics.model.User;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Objects;

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
        PrintWriter out = response.getWriter();


        String username = request.getParameter("username");
        String password = request.getParameter("password");


        try {

            User user = User.login(username.toString(),password.toString());




            response.setContentType("text/html;charset=UTF-8");
            HttpSession session = request.getSession();
            if (user instanceof Student) {
                System.out.println("The user is a student");
                Student student = (Student) user;
                SessionManager.prepareStudentSession(student, session);
                isLoggedIn = true;
                whoLoggedIn = "student";
                address = "/studentView.jsp";
            } else if (user instanceof Professor) {
                System.out.println("The user is a professor");
                Professor professor = (Professor) user;
                SessionManager.prepareProfessorSession(professor, session);
                setLoggedIn(true);
                setWhoLoggedIn("professor");
                address = "/professorView.jsp";
            } else if (user instanceof Secretary) {
                System.out.println("The user is an secretary");
                Secretary secretary = (Secretary) user;

                SessionManager.prepareSecretarySession(secretary, session); // preparing secretary's session

                setWhoLoggedIn("secretary");
                setLoggedIn(true);
                address = "/secretaryView.jsp";


            } else {
                System.out.println("Error, Invalid username or password.User exits.");
                request.setAttribute("error", "Invalid Username or Password");

                address = "/index.jsp";
            }

            RequestDispatcher dispatcher = request.getRequestDispatcher(address);
            dispatcher.forward(request,response);

        }catch (NullPointerException e){

            System.out.println("Error, Invalid username or password.User doesnt exist.");
            request.setAttribute("error", "Invalid Username or Password");

            address = "/index.jsp";
            RequestDispatcher dispatcher = request.getRequestDispatcher(address);
            dispatcher.forward(request,response);


        }



    }
}
