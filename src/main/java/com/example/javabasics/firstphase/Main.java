package com.example.javabasics.firstphase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {

        public static void main(String[] args) {
            Grades g1=new Grades(1,2,4,12154,"algebra");
            Professor p1 = new Professor("george1223","george","georgioy","unipi");
            ArrayList<Grades> list1=new ArrayList<>();
            p1.makeList1(g1);




        }











    }

