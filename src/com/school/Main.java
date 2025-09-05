package com.school;

public class Main{
    public static void main(String[] args){
         Student[] students = new Student[2];
        students[0] = new Student("Hardik", 07);
        students[1] = new Student("jayant", 69);

        Course[] courses = new Course[2];
        courses[0] = new Course("C++", 201);
        courses[1] = new Course("Drawing", 202);

        System.out.println("Students:");
        for (Student s : students) s.display();

        System.out.println("\nCourses:");
        for (Course c : courses) c.display();
    }
}