package com.school;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Student student = new Student("Hardik", "10th Grade");
        Teacher teacher = new Teacher("Mr. Smith", "Mathematics");
        Staff staff = new Staff("Ms. Johnson", "Librarian");

        System.out.println("Student Details:");
        student.displayDetails();

        System.out.println("\nTeacher Details:");
        teacher.displayDetails();

        System.out.println("\nStaff Details:");
        staff.displayDetails();

        // Use student.getId() in AttendanceRecord
        AttendanceRecord record = new AttendanceRecord(student.getId(), 201, "Present");
        System.out.println("\nAttendance Record:");
        record.displayRecord();

        // Create and populate lists
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Hardik", "10th Grade"));
        students.add(new Student("Jayant", "9th Grade"));

        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("C++"));
        courses.add(new Course("Drawing"));

        ArrayList<AttendanceRecord> records = new ArrayList<>();
        records.add(new AttendanceRecord(students.get(0).getId(), courses.get(0).getCourseId(), "Present"));
        records.add(new AttendanceRecord(students.get(1).getId(), courses.get(1).getCourseId(), "Absent"));

        // Create FileStorageService instance
        FileStorageService service = new FileStorageService();

        // Call saveData
        service.saveData(students, "students.txt");
        service.saveData(courses, "courses.txt");
        service.saveData(records, "attendance_log.txt");
    }
}