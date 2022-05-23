package com.example.javabasics.firstphase;

import java.util.ArrayList;

public class Professor extends User{
    public Professor(String username, String name, String surname, String department) {
        super(username, name, surname, department);
    }

    //professor adds new grade
    protected ArrayList<Grades>  makeList1(Grades grades  ){
        ArrayList<Grades> list1= new ArrayList<>();
        list1.add(grades);
        return list1;




    }
}
