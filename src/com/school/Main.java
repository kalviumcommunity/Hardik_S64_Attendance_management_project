package com.school;

import java.util.ArrayList;
import java.util.List;

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

        // Create attendance log
        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        // Add attendance records using getters
        attendanceLog.add(new AttendanceRecord(students[0].getStudentId(), courses[0].getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(students[1].getStudentId(), courses[1].getCourseId(), "Absent"));
        attendanceLog.add(new AttendanceRecord(students[2].getStudentId(), courses[2].getCourseId(), "Late")); // Invalid status
        attendanceLog.add(new AttendanceRecord(students[3].getStudentId(), courses[3].getCourseId(), "Present"));

        System.out.println("\nAttendance Records:");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
    }
}