package com.dp.decorator.intrfc.impl;

import com.dp.decorator.intrfc.Shape;

public abstract class ShapeDecorator implements Shape {

	private Shape decoratedShape;
	
	public ShapeDecorator(Shape decoratedShape) {
		super();
		this.decoratedShape = decoratedShape;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
	}

}
