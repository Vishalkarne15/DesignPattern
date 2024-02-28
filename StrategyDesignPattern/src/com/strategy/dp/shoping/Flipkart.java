package com.strategy.dp.shoping;

import java.util.Arrays;
import java.util.Random;

import com.strategy.dp.bean.Courier;

public class Flipkart {

	private Courier courier;
	
	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	
	public String shopping(String items[], double prices[]) {

		double billAmount = 0.0;
		for(double p:prices) {
			billAmount = billAmount+p;
		}
		
		String msg = courier.deliver(new Random().nextInt(100000));
		return Arrays.toString(items)+" Are purchased having bill amounts "+billAmount+"  --------> "+msg;
	}
	
}
