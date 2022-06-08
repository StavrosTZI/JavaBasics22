package com.example.javabasics.model;

public class User {
    private String username ;
    private int id ;
    private String password;
    private String name ;
    private String surname ;

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



    public User(int id,String username,String password,String name,String surname){
        this.id=id;
        this.username=username;
        this.password=password;
        this.name=name;
        this.surname=surname;
        userCounter++;

    }
}
