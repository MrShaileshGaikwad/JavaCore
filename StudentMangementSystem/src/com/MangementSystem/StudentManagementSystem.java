package com.MangementSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentManagementSystem {

    private Map<String, Student> students;
    private Map<String, Teacher> teachers;

    public StudentManagementSystem() {
        students = new HashMap<>();
        teachers = new HashMap<>();
    }

    public void addStudent(Student student) {
        students.put(student.getUsername(), student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.put(teacher.getUsername(), teacher);
    }
    public User login(String username, String password) {
        if (students.containsKey(username) && students.get(username).getPassword().equals(password)) {
            return students.get(username);
        }
        if (teachers.containsKey(username) && teachers.get(username).getPassword().equals(password)) {
            return teachers.get(username);
        }
        return null;
    }

    public void viewAllStudents() {
        for (Student student : students.values()) {
            System.out.println("Name: " + student.getName() + ", Email: " + student.getEmail() + ", Address: " + student.getAddress());
        }
    }

    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();

        // Add a teacher
        Teacher teacher = new Teacher("teacher1", "pass123", "Mr. Smith");
        system.addTeacher(teacher);

        // Teacher registers a student
        teacher.registerStudent(system, "student1", "pass123", "Alice", "alice@example.com", "123 Wonderland");

        // Login as student
        User studentUser = system.login("student1", "pass123");
        if (studentUser instanceof Student) {
            Student student = (Student) studentUser;
            student.viewMarks(); // Initially no marks

            // Student updates personal info
            student.updatePersonalInfo("alice_new@example.com", "456 Wonderland");

            // Student views updated info
            System.out.println("Updated Email: " + student.getEmail());
            System.out.println("Updated Address: " + student.getAddress());
        }

        // Login as teacher
        User teacherUser = system.login("teacher1", "pass123");
        if (teacherUser instanceof Teacher) {
            Teacher teacherLogged = (Teacher) teacherUser;
            Student student = system.students.get("student1");

            // Teacher updates student marks
            teacherLogged.updateStudentMark(student, "Math", 85);
            teacherLogged.updateStudentMark(student, "Science", 90);

            // Student views updated marks
            student.viewMarks();
        }

        // View all students in the system
        system.viewAllStudents();
    }
}
