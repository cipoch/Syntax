package com.syntax.class23;

public class calculations {
	
	
	static void calculation()
	{
		System.out.println( "Static");
		System.out.println("I love programming languages");
	}
	
	
	static String calculation(String a)
	{
		if (a.length() == 0) {
			a = "I love programming languages";
		} else {
			a = "I love " + a;
		}
	
		return a;
	}
	

	static int calculation(int a1, int a2, int a3)
	{	
		return a1*a2*a3;
	}

	

}

