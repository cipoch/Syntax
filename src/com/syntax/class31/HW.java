/*
1) Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water. 

2) Create an arrayList of even numbers from 1 to 50. Remove any number that is divisible by 5 from that arrayList.

3) Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
 Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute.
 Create 3 objects of the sub classes and store them in ArrayList. 
 Using for loop/advanced for loop/ iterator access all methods of the class. 

4) Create a Card class that will have implemented  and unimplemented methods and a constructor that will initializes credit card type.
 Create 3 subclasses of a Card card. Create 3 objects of different card and store them into LinkedList.
 Using for loop/advanced for loop/ iterator access all methods of the class.
 */


package com.syntax.class31;

import java.util.LinkedList;
import java.util.ArrayList;

public class HW {
	public static void main(String[] args) {
		//taskOne();
		//taskTwo();
		//taskThree();
		taskFour();
		
	}
	
	
	
	// 1) *************************************************************************
	// Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water. 
	
	public static void taskOne() {
		ArrayList<String> drinks = new ArrayList<>();
		drinks.add("Juice");
		drinks.add("Keffir");
		drinks.add("Coffee");
		drinks.add("Vodka");
		drinks.add("Tea");
		drinks.add("Milk");
		
		System.out.println(lalala(drinks, 'a', 'e'));
	}
	
	
	public static ArrayList<String> lalala(ArrayList<String> arr, char ch, char ch2) {
		
		
		ArrayList<String> returnArray = new ArrayList<>();
			
		  for(String st : arr) {
			  
			  boolean go = false;
			  
			  for(int i = 0; i < st.length(); i++) {
				  //System.out.print(st.charAt(i));
				  if (st.charAt(i) == ch || st.charAt(i) == ch2) {
					  go = true;
				  } 
			  }
			  
			  
			  if (go) {
				  returnArray.add("Water");
			  } else {
				  returnArray.add(st);
			  }
			  //System.out.println("");
		  }
		 
		  return returnArray;
		}
	
	// 2) *************************************************************************
	//Create an arrayList of even numbers from 1 to 50. Remove any number that is divisible by 5 from that arrayList.
	public static void taskTwo() {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for(int i = 1; i <= 50; i++) {
			if(i % 2 == 0) {
				numbers.add(i);
			}
		}
		
		
		for(int j = 0; j <= numbers.size(); j++) {
			if(j % 5 == 0) {
				numbers.remove(j);
			}
		}
		System.out.println(numbers);
	}
	
	// 3) *************************************************************************
	// Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
	// Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute.
	// Create 3 objects of the sub classes and store them in ArrayList. 
	// Using for loop/advanced for loop/ iterator access all methods of the class.  
	public static void taskThree() {
		
		Car car = new Car();
		car.insuranceName = "Geico";
		car.carModel = "Toyota";
		Pet pet = new Pet();
		pet.insuranceName = "Petco";
		pet.petType = "Bick Cock Terier";
		Health h = new Health();
		h.insuranceName = "Fidelis Care";

		ArrayList<Insurance> mylist = new ArrayList<>();
		mylist.add(car);
		mylist.add(pet);
		mylist.add(h);
		
		
		for(Insurance in: mylist) {
			in.getQuote();
			in.cancelInsurance();
			System.out.println();
		}
	}
	
	// 4) *************************************************************************
	// Create a Card class that will have implemented  and unimplemented methods and a constructor that will initializes credit card type.
	// Create 3 subclasses of a Card card. Create 3 objects of different card and store them into LinkedList.
	// Using for loop/advanced for loop/ iterator access all methods of the class.
		public static void taskFour() {
			
			SecuredCreditCard c1 = new SecuredCreditCard("Capital One® Secured Mastercard®");
			StoreCreditCard c2 = new StoreCreditCard("Target Credit Card");
			StudentCreditCard c3 = new StudentCreditCard("Journey® Student Rewards from Capital One®");
			

			LinkedList<Card> cards = new LinkedList<>();
			cards.add(c1);
			cards.add(c2);
			cards.add(c3);
			
			
			for(Card c: cards) {
				c.getCardInfo();
				c.cancelCard();
				System.out.println();
			}

		}

}






