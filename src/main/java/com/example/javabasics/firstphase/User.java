package com.example.javabasics.firstphase;

public class User {
    protected String username ;
    protected String name ;
    protected String surname ;
    protected String department ;
    static int userCounter = 0;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public User(String username,String name,String surname,String department){
        this.username=username;
        this.name=name;
        this.surname=surname;
        this.department=department;
        userCounter++;

    }
}
