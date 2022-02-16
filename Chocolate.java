package com.poly;

public class Chocolate extends SweetProducer {

	@Override
	public void executeAction() {
		System.out.println("Chocolate produced");
	}

	@Override
	public void executeQuantity() {
		System.out.println("Chocolate quantity: 20kgs");
	}


}
