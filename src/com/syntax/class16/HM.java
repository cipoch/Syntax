package com.syntax.class16;

public class HM {

	public static void main(String[] args) {
		//3 Create a method that will print whether given String is palindrome or not.
		String a = "kokokok";
		TaskMethods obj=new TaskMethods();
		
		
		System.out.println(obj.palindrome(a));
		System.out.println(palindromeLocal(a));
	      
		
	}
	
	
	
	static boolean palindromeLocal(String a) {
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
