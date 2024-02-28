package com.strategy.dp.factory;

import com.strategy.dp.bean.BlueDart;
import com.strategy.dp.bean.Courier;
import com.strategy.dp.bean.DHL;
import com.strategy.dp.bean.DTDC;
import com.strategy.dp.shoping.Flipkart;

public class FlipkartFactory {

	
	public static Flipkart getInstance(String courierType) {
		
		Courier courier = null;
		
		if(courierType.equals("DTDC")) {
			courier = new DTDC();
		}else if(courierType.equals("DHL")) {
			courier = new DHL();
		}else if(courierType.equals("BlueDart")) {
			courier = new BlueDart();
		}else {
			throw new IllegalArgumentException("Invalid Courier Type");
		}
		
		Flipkart flipkart = new Flipkart();
		flipkart.setCourier(courier);
		return flipkart;
		
	}
	
}
