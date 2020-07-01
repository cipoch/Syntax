package com.syntax.class16;

public class TaskMethods {

	boolean palindrome(String a) {
		//String a = "kokokok2";
		
		int i = 0;
		int k = a.length()-1;
		boolean polindrome = false;
		while (i < k) {
			if (a.charAt(i) == a.charAt(k)) {
				polindrome = true;
			}
			i++;
			k--;
		}
		
		return polindrome;
		//System.out.print(a + "  polindrome:" +  polindrome);
	}
	
}
