package com.example.javabasics.servlets;

import com.example.javabasics.model.Professor;
import com.example.javabasics.model.Secretary;
import com.example.javabasics.model.Student;

import javax.servlet.http.HttpSession;

public class SessionManager {
    public static void prepareSecretarySession(Secretary secretary, HttpSession session) {
        session.setAttribute("user", secretary);
/*
        try {
            DatabaseManager dbManager = new DatabaseManager();
            session.setAttribute("allDoctors", Doctor.getMultipleFromDatabase(Query.getAllDoctors(dbManager.getConnection())));
            dbManager.closeConnection();
        } catch (SQLException e) {
            System.out.println("An error occurred while getting all admins from the database");
            System.out.println(e.getMessage());
        }
*/
    }

    public static void prepareProfessorSession(Professor professor, HttpSession session) {
        // Store the patient to a session
        session.setAttribute("user", professor);
/*
        // Get the scheduled and available appointments from the database
        DatabaseManager dbManager = new DatabaseManager();
        session.setAttribute("scheduledAppointments", patient.getScheduledAppointments(dbManager.getConnection()));
        session.setAttribute("oldAppointments", patient.getOldAppointments(dbManager.getConnection()));

        dbManager.closeConnection();
    }
*/
    }
    public static void prepareStudentSession(Student student, HttpSession session) {
        session.setAttribute("user", student);
/*
        // Get the scheduled and available appointments from the database
        DatabaseManager dbManager = new DatabaseManager();
        session.setAttribute("appointmentsList", doctor.getScheduledAppointments(dbManager.getConnection()));

        dbManager.closeConnection();
    }
*/
    }

}
