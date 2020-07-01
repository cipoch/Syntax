package com.syntax.class15;

public class HM4 {
//How would you swap  2 strings without a temporary variable?
	
	
	public static void main(String[] args) {
		
		String a = "lala7777";
		String b = "koko25";
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("----------------------------------");

		
		for(int i = 0; i < a.length(); i++) {
			b = b + a.substring(i,i+1);
		}
		
		
		a = b.substring(0,b.length() - a.length());
		b = b.substring(a.length());
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	
}
