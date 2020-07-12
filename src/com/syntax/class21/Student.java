package com.syntax.class21;

public class Student {
	
	String name;
	String address;
	
	
	Student(String n, String ad) {
		this.name = n;
		this.address = ad;
		System.out.println("Student " + this.name + " from " + this.address);
	}
}

