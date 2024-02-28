package com.dp.decorator.intrfc.impl;

import com.dp.decorator.intrfc.Shape;

public class Circle implements Shape{
	
	@Override
	public void draw() {
		System.out.println("Shape: Circle");
	}

}
