package com.school;

public class Course implements Storable {
    private String courseName;
    private int courseId;
    private static int nextCourseIdCounter = 101;

    public Course(String courseName) {
        this.courseName = courseName;
        this.courseId = nextCourseIdCounter++;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void displayDetails() {
        System.out.println("Course ID: C" + courseId + ", Course Name: " + courseName);
    }

    @Override
    public String toDataString() {
        return courseId + "," + courseName;
    }
}