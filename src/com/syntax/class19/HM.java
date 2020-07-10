package com.syntax.class19;

public class HM {

	
	/*
	 * Create a method that will accept a String as a parameter and return a new String that 
	 * consist only of vowels. Method should be available inside the class where it was declared
	 *  and executed by calling it is name.
	 */
	
	public static void main(String[] args) {
		
		System.out.println(getVowel("lolololalakeksuber"));
	}
	
	

	
	
	static String getVowel(String a) {
		
		String b = "";
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u'|| a.charAt(i) == ' ') {
				b = b +a.charAt(i);
			}
		}
		
		return b;
	}
}
