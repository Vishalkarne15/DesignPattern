package com.dp.decorator.client;

import com.dp.decorator.intrfc.Shape;
import com.dp.decorator.intrfc.impl.Circle;
import com.dp.decorator.intrfc.impl.Rectangle;
import com.dp.decorator.intrfc.impl.RedShapeDecorator;

public class MainClient {

	public static void main(String[] args) {
		
		Shape circle = new RedShapeDecorator(new Circle());
		circle.draw();
		
		Shape rectangle = new RedShapeDecorator(new Rectangle());
		rectangle.draw();
	}

}
