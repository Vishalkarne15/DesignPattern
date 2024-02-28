package com.dp.decorator.intrfc.impl;

import com.dp.decorator.intrfc.Shape;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		super.draw();
		setRedBorder();
	}

	public void setRedBorder() {
		System.out.println("Border Color: Red");
	}
	
}
