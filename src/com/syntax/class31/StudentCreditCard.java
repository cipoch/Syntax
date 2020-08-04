package com.syntax.class31;

public class StudentCreditCard extends Card {

	StudentCreditCard(String type) {
		super(type);
	}

	@Override
	public void getCardInfo() {
		System.out.println("this is " + super.cardType);	
	}

}
