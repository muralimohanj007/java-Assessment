package com.poly;

public class Cake extends SweetProducer {

	@Override
	public void executeAction() {
		System.out.println("Cake Produced");
	}

	@Override
	public void executeQuantity() {
		System.out.println("Cake quantity: 20kgs");
	}
}
