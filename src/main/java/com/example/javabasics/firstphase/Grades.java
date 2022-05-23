package com.example.javabasics.firstphase;

public class Grades {
    public Grades(float exams, float tasks, float labs, int id, String course) {
        this.exams = exams;
        this.tasks = tasks;
        this.labs = labs;
        this.id = id;
        this.course = course;
    }

    private float exams;
    private float tasks;
    private float labs;
    private int id;
    private String course;
}
