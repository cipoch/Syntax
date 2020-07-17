/*
 Create 1 class in which create a methods that will calculate the area (volume) of 
Rectangle
Square
Box
Use separate class to test your code

Create a class named ‘Programming’. While creating an object of the class, if nothing is passed to it, then the message “I love programming languages” should be printed. If some String is passed to it, then in place of “programming languages” the value variable should be printed. Example, if we pass “Java”, then “I love Java” should be printed.


Create 1 class with a static method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.


Create 1 class with a private method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.

 */



package com.syntax.class23;

public class Programming {
	
	public static void main(String[] args) {
		
		calculationsObject c = new calculationsObject();
		c.volume();
		System.out.println( c.volume(""));
		System.out.println( c.volume("Java"));
		System.out.println( c.volume(4,3,2));
		System.out.println( "------------------------------------------------------------ ");
		
		
		calculations.calculation();
		System.out.println( calculations.calculation(""));
		System.out.println( calculations.calculation("Java"));
		System.out.println( calculations.calculation(4,3,2));
		System.out.println( "------------------------------------------------------------ ");
		
		
		calculationsPrivate b = new calculationsPrivate();
		b.gogo();
		b.gogo("");
		b.gogo("Java");
		b.gogo(4,3,2);
		

		
		
	}
	
}
