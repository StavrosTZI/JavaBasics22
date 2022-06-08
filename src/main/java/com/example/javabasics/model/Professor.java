package com.example.javabasics.model;

import java.util.ArrayList;

public class Professor extends User{

    private Department department;
    public Professor(int id,String username,String password, String name, String surname, Department department) {
        super(id, username, password, name,surname);
        this.department= department;
    }

    //professor adds new grade
    protected ArrayList<Grades>  makeList1(Grades grades  ){
        ArrayList<Grades> list1= new ArrayList<>();
        list1.add(grades);
        return list1;
    }

}
