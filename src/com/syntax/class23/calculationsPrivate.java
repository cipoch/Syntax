package com.syntax.class23;

public class calculationsPrivate {
	

	public void gogo() {
		volume();
	}
	
	public void gogo(String a) {
		volume(a);
	}

	
	public void gogo(int a1, int a2, int a3) {
		volume(a1,a2,a3);
	}
	
	

	private void volume() {
		System.out.println( "Private");
		System.out.println("I love programming languages");
		
	}


	
	
	private void volume(String a)
	{
		if (a.length() == 0) {
			a = "I love programming languages";
		} else {
			a = "I love " + a;
		}
	
		System.out.println(a);
	}
	

	private void volume(int a1, int a2, int a3)
	{	
		System.out.println(a1*a2*a3);
	}
	
	
}
