package com.syntax.class15;

public class HM1_3 {
	
	public static void main(String[] args) {
	//1 How would you reverse a String character by character?
		//lala1();
		
	//2 How would you reverse a String word by word?
		//lala2();
		
	//3 How would you check if String is polindrome or not?
		lala3();
	}


	
	static void lala1() {
		String st = "megaman";
		
		for(int i = st.length()-1; i >= 0; i--) {
			System.out.print(st.charAt(i));
		}
	}
	
	
	static void lala2() {
		String st = "trump no good";
		
        String[] arrOfStr = st.split(" "); 
        
		for(int i = arrOfStr.length - 1; i >= 0; i--) {
			System.out.print(arrOfStr[i] + " ");
		}
	}
	
	static void lala3() {
		String a = "kokokok2";
		
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
		
		System.out.print(a + "  polindrome:" +  polindrome);
	}
	

}