package com.MangementSystem;

public class Teacher extends User {
    public Teacher(String username, String password, String name) {
        super(username, password, name);
    }

    public void registerStudent(StudentManagementSystem system, String username, String password, String name, String email, String address) {
        Student student = new Student(username, password, name, email, address);
        system.addStudent(student);
        system.addStudent(student);
       // system.addTeacher(null);
    }

    public void updateStudentMark(Student student, String subject, int mark) {
        student.addOrUpdateMark(subject, mark);
    }
}