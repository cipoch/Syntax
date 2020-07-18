package com.syntax.class24;

public class Student {
	
	public static void main(String[] args) {
		SyntaxStudent st = new SyntaxStudent();
		st.display();
		st.display(true);
		System.out.println("------------------------------");
		
		CollegeStudent st2 = new CollegeStudent();
		st2.display();
		st2.display(true);
		System.out.println("------------------------------");
		
		SchoolStudent st3 = new SchoolStudent();
		st3.display();
		st3.display(true);
	}
	
	
	void display() {
		System.out.println("Parent");
	}
	
}



class SyntaxStudent extends Student {
	String a = "Syntax";
	void display() {
		System.out.println(this.a);
	}
	
	void display(boolean b) {
		System.out.println(this.a + " student");
	}
	
}


class CollegeStudent extends Student {
	String a = "College";
	void display() {
		System.out.println(this.a);
	}
	void display(boolean b) {
		System.out.println(this.a + " student");
	}
}


class SchoolStudent extends Student {
	String a = "School";
	void display() {
		System.out.println(this.a);
	}
	void display(boolean b) {
		System.out.println(this.a + " student");
	}
}