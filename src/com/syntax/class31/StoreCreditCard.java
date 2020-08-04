package com.syntax.class31;

public class StoreCreditCard extends Card {

	StoreCreditCard(String type) {
		super(type);
	}

	@Override
	public void getCardInfo() {
		System.out.println("this is " + super.cardType);	
	}

}
