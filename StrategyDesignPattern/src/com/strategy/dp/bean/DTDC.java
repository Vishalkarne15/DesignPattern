package com.strategy.dp.bean;

public class DTDC implements Courier {
	
	public DTDC() {
		System.out.println("DTDC no parameterised constructor");
	}
	
	@Override
	public String deliver(int orderId) {
		return orderId+" is assigned with DTDC for delivery";
	}

}
