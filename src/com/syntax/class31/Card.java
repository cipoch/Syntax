package com.syntax.class31;

public abstract class Card {
	String cardType;
	
	public Card(String type) {
		this.cardType = type;
	}

	public abstract void getCardInfo();
	
	public  void cancelCard() {
		System.out.println(this.cardType + " canceled");	
	}
}
