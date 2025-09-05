package com.school;

public class Course{
    private String courseName;
    private int courseId;

    public Course(String courseName , int courseId){
        this.courseName = courseName;
        this.courseId = courseId;
    }

    public void setDetails(String courseName, int courseId) {
        this.courseName = courseName;
        this.courseId = courseId;
    }

    public String getCourseName() {return courseName;};
    public int getCourseId() {return courseId;};

public void display(){
    System.out.println("courseId:" + courseId  + " , courseName:" + courseName);
}
    
}