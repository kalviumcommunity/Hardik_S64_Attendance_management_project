package com.school;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("Hardik");
        students[1] = new Student("Jayant");
        students[2] = new Student("Alice");
        students[3] = new Student("Bob");

        Course[] courses = new Course[4];
        courses[0] = new Course("C++");
        courses[1] = new Course("Drawing");
        courses[2] = new Course("Java");
        courses[3] = new Course("Python");

        System.out.println("Students:");
        for (Student s : students) s.display();

        System.out.println("\nCourses:");
        for (Course c : courses) c.displayDetails();
    }
}