package com.strategy.dp.strategytest;

import com.strategy.dp.factory.FlipkartFactory;
import com.strategy.dp.shoping.Flipkart;

public class MainClass {

	public static void main(String[] args) {
		Flipkart flipkart = FlipkartFactory.getInstance("BlueDart");
		String flipkartShoppingMsg = flipkart.shopping(new String[] {"Spiderman Toy","Thonas Toy","Antman Toy","Superman Toy"}, new double[] {400.00,400.00,400.00,400.00});
		System.out.println(" Flipkart Shopping Msg :: "+flipkartShoppingMsg);
	}

}
