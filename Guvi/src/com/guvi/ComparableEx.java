package com.guvi;

import java.util.*;

class Ttudents implements Comparable<Ttudents> {
    int rollNo;
    String name;
    int age;

    Ttudents(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Ttudents s) {
        // Sorting by age
        return this.age - s.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

	public int compareTo1(Ttudents o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class ComparableEx {
    public static void main(String[] args)throws ArithmeticException {
        List<Student> studentss = new ArrayList<>();
        studentss.add(new Student(101, "Alice", 23));
        studentss.add(new Student(102, "Bob", 21));
        studentss.add(new Student(103, "Charlie", 25));
//Collections.sort((List<T>) studentss);
      //  Collections.sort((List<T>) studentss);

        for (Student s : studentss) {
            System.out.println(s);
        }
    }
}