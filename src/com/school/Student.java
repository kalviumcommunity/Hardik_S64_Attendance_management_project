package com.school;

public class Student {
    private String name;
    private int studentId;
    private static int nextStudentIdCounter = 1;

    public Student(String name) {
        this.name = name;
        this.studentId = nextStudentIdCounter++;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void display() {
        System.out.println("Student ID: " + studentId + ", Name: " + name);
    }
}