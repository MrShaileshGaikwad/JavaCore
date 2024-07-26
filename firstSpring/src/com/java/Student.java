package com.java;

public class Student {
	private int id;  
	private String name;  
	  
	public Student() {
		System.out.println("def cons");
	}  
	  
	public Student(int id) {
		this.id = id;
	}  
	  
	public Student(String name) { 
		this.name = name;
		}  
	  
	public Student(int id, String name)
	{  
	    this.id = id;  
	    this.name = name;  
	}  
	  
	void show(){  
	    System.out.println(id+" "+name);  
	}  
	  
}
