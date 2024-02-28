package com.prototype.main;

import com.prototype.action.ShapeAction;
import com.prototype.intrfc.Shape;
import com.prototype.model.Circle;
import com.prototype.model.Triangle;

public class ClientMain {

	public static void main(String[] args) {
		
		Shape sh = new Circle("Red");
		ShapeAction sAction = new ShapeAction(sh);
		sh = sAction.createShape();
		sh.draw();
		
		sh = new Triangle("Blue");
		sAction = new ShapeAction(sh);
		sh = sAction.createShape();
		sh.draw();
	}

}
