package com.syntax.class18;


/*
Create a Class called Students
Create three  variables  studentName , studentID  and  numberOfStudents
Create three objects of the Students Class 
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
*/


public class Students {
	
	String studentName;
	int studentID = 00;
	static int numberOfStudents = 0;
	
	public static void main(String[] args) {

		createStudent("keks", 453);
		createStudent("meks", 89897);
		createStudent("peks", 3256);

		System.out.println(numberOfStudents);	
		
	}
	
	
	 static void createStudent(String name, int id) {
		numberOfStudents += 1;
		Students s1 = new Students();
		s1.studentName = name;
		s1.studentID = id;
	}
	

	
	
	
}