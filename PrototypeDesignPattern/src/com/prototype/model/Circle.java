package com.prototype.model;

import com.prototype.intrfc.Shape;

public class Circle implements Shape{
	private String color;

	public Circle(String color) {
		super();
		this.color = color;
	}

	@Override
	public Shape clone() {
		return new Circle(this.color);
	}

	@Override
	public void draw() {
		System.out.println("Drawing a " + color + " circle.");
	}
	
	
	
}
