package com.prototype.model;

import com.prototype.intrfc.Shape;

public class Triangle implements Shape {
	
	private String color;

	public Triangle(String color) {
		super();
		this.color = color;
	}

	@Override
	public Shape clone() {
		return new Triangle(this.color);
	}

	@Override
	public void draw() {
		System.out.println("Drawing a " + color + " Triangle.");
	}

}
