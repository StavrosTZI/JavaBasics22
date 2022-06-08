package com.example.javabasics.model;

public class Student extends User {
    private final int registrationNumber ;
    private Department department;
    public Student(int id,String username,String password, String name, String surname, int registrationNumber,Department department) {
        super(id,username,password ,name, surname);
        this.registrationNumber=registrationNumber;
        this.department =department;

    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }
    public void seeGrades()
    {

    }

}
