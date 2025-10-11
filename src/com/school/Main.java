package com.school;

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
    }
}