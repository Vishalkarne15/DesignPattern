package com.strategy.dp.bean;

public class BlueDart implements Courier {
	
	public BlueDart() {
		System.out.println("BuleDate no parameterised constructor");
	}

	public String deliver(int orderId) {
		return orderId+" is assigned with BlueDart for delivery";
	}

}
