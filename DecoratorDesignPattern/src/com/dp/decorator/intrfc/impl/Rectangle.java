package com.dp.decorator.intrfc.impl;

import com.dp.decorator.intrfc.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape: Rectangle");
	}

}
