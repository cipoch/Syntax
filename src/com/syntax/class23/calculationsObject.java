package com.syntax.class23;

public class calculationsObject {

	public void volume()
	{
		System.out.println( "Object");
		System.out.println("I love programming languages");
	}
	
	
	public String volume(String a)
	{
		if (a.length() == 0) {
			a = "I love programming languages";
		} else {
			a = "I love " + a;
		}
	
		return a;
	}
	

	public int volume(int a1, int a2, int a3)
	{	
		return a1*a2*a3;
	}
	
}
