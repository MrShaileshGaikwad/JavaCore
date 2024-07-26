package com.MangementSystem;

import java.util.HashMap;
import java.util.Map;

public class Student extends User {
    private Map<String, Integer> marks;
    private String email;
    private String address;

    public Student(String username, String password, String name, String email, String address) {
        super(username, password, name);
        this.email = email;
        this.address = address;
        this.marks = new HashMap<>();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void updatePersonalInfo(String email, String address) {
        setEmail(email);
        setAddress(address);
    }

    public void addOrUpdateMark(String subject, int mark) {
        marks.put(subject, mark);
    }

    public void deleteMark(String subject) {
        marks.remove(subject);
    }

    public double getPercentage() {
        if (marks.isEmpty()) return 0.0;
        int totalMarks = 0;
        for (int mark : marks.values()) {
            totalMarks += mark;
        }
        return totalMarks / (double) marks.size();
    }

    public void viewMarks() {
        System.out.println("Marks for " + getName() + ":");
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Percentage: " + getPercentage() + "%");
    }
}
