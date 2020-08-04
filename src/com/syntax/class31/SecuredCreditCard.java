package com.syntax.class31;

public class SecuredCreditCard extends Card {

	SecuredCreditCard(String type) {
		super(type);
	}

	@Override
	public void getCardInfo() {
		System.out.println("this is " + super.cardType);	
	}

}
