package com.syntax.class31;

public class Pet extends Insurance {
	String petType;
	@Override
	public void getQuote() {
		System.out.println("Quote for " + this.petType + ":" + 1000 + "$");
	}
}
