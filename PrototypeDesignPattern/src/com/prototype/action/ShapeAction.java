package com.prototype.action;

import com.prototype.intrfc.Shape;

public class ShapeAction {
	
	private Shape shapePrototype;

	public ShapeAction(Shape shapePrototype) {
		this.shapePrototype = shapePrototype;
	}
	
	public Shape createShape() {
		return shapePrototype.clone();
	}
	
}
