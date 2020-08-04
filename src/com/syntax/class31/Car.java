package com.syntax.class31;

public class Car extends Insurance {
	String carModel;
	@Override
	public void getQuote() {
		System.out.println("Quote for " + this.carModel + ":" + 500 + "$");	
	}
}
