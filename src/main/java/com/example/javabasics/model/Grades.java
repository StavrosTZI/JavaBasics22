package com.example.javabasics.model;

public class Grades {
    public Grades(float exams, float tasks, float labs, int id, String course) {
        this.exams = exams;
        this.tasks = tasks;
        this.labs = labs;
        this.id = id;
        this.course = course;
    }

    protected float exams;
    protected float tasks;
    protected float labs;
    protected int id;
    protected String course;
}
