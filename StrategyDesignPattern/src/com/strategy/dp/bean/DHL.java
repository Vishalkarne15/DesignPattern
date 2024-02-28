package com.strategy.dp.bean;

public class DHL implements Courier {

	public DHL() {
		System.out.println("DHL no parameterised constructor");
	}

	@Override
	public String deliver(int orderId) {
		return orderId+" is assigned with DHL for delivery";
	}
	
}
