package com.example.javabasics.model;

public class Student extends User {
    private final int registrationNumber ;
    public Student(String username, String name, String surname, String department, int registrationNumber) {
        super(username, name, surname, department);
        this.registrationNumber=registrationNumber;

    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }
    public void seeGrades()
    {

    }

}
