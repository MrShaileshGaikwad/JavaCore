package com.guvi;
import java.util.*;

class Student {
    int rollNo;
    String name;
    int age;

    Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.age - s2.age;
    }
}

public class ComparatorEx {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Alice", 23));
        students.add(new Student(102, "Bob", 21));
        students.add(new Student(103, "Charlie", 25));

        // Sorting by name
        Collections.sort(students, new NameComparator());
        System.out.println("Sorted by name:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sorting by age
        Collections.sort(students, new AgeComparator());
        System.out.println("\nSorted by age:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
