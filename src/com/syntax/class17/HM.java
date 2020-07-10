package com.syntax.class17;
import java.util.Scanner;


public class HM {


	public static void main(String[] args) {
		
		lala();
		
		/*
		//1 Create a method createEmail(). Based on values of users name, lastName and email type, your method should return complete email Address. 
		//Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
		System.out.println("1)");
		System.out.println(createEmail("John", "Snow", "gmail.com"));
		System.out.println("");
		//2 Write a method to return whether given number is prime or not?
		System.out.println("2)");
		int num = 6;
		if (primeOrNot(num)) 
		{
			System.out.println(num + " is a prime number.");
		}
        else
        {
        	System.out.println(num + " is not a prime number.");
        }
		System.out.println("");
		/*
		    3 Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
	        score > 90 - A
	        score >80 - B
	        score >70 - C
	        score > 50 - D
	        anything else - F
	     */
		
		/*
		System.out.println("3)");
		int score = 78;
		System.out.println("Student with score "+ score + " gradded " + getGrade(score));
		System.out.println("");
		*/
	}
	
	
	static void lala() {
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below
	   //int count = 0;
	   
	   for(int i = 0; i < word.length(); i+=2) {
	      
	      
		   System.out.print(word.charAt(i));
	    
	    
	   }
	   inp.close();
	}
	
	
	
	static String getGrade(int score)
	{
     	String grade = "";
     	
     	if (score > 90) {
     		grade = "A";
     	} else if (score <= 90 && score > 80) {
     		grade = "A";
     	} else if (score <= 80 && score > 70) {
     		grade = "C";
     	} else if (score <= 70 && score > 50) {
     		grade = "D";
     	} else {
     		grade = "F";
     	}
		
		return grade;
	}
	
	static String  createEmail(String a1, String a2, String a3) {
		String email = "";
		email = a1 + a2 + "@" + a3;
		return email;
	}
	
	
	
	//A prime number is a number which is divisible by only two numbers: 1 and itself. So, if any number is divisible by any other number, it is not a prime number.
	static boolean  primeOrNot(int num) {
		
		boolean prime = true;
		
		for (int i = 2; i <= num/2; ++i)
		{
			if (num % i == 0)
			{
				prime = false;
				break;
			}
		}

		return prime;
	}
	
}
