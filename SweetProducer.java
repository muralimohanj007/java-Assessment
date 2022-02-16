package com.poly;

public abstract class SweetProducer {

	public abstract void executeAction();

	public abstract void executeQuantity();

	public static void main(String[] args) {
		SweetProducer cake = new Cake();// creating object of cake
		SweetProducer chocolate = new Chocolate();// creating object of chocolate
		cake.executeAction();
		cake.executeQuantity();
		chocolate.executeAction();
		chocolate.executeQuantity();
	}
}

