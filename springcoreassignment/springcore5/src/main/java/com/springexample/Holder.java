package com.springexample;
 
import javax.inject.Inject;
 
public class Holder {
     
    @Inject
    Student student;
     
    public Student getStudent() {
        return student;
    }
 
    public void setStudent(Student student) {
        this.student = student;
    }   
     
    public void displayStudentDetails(){
        System.out.println("Student Details");
        System.out.println("---------------");
        System.out.println("Student No: "+student.getStudentNo());
        System.out.println("Student Name: "+student.getStudentName());
    }
}