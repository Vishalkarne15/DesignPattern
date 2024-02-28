package com.absfactory.client;

import com.abc.factory.intrfc.Car;
import com.abc.factory.intrfc.CarSpecification;
import com.absfactory.intrfc.CarFactory;
import com.absfactory.intrfc.impl.IndianCarFactory;
import com.absfactory.intrfc.impl.NorthAmericaCarFactory;

public class MainClient {
	public static void main(String[] args) {
		CarFactory carFactory = new IndianCarFactory();
        Car car = carFactory.createCar();
        CarSpecification carSpecification = carFactory.createSpecification();
        car.assemble();
        carSpecification.display();
 
        carFactory = new NorthAmericaCarFactory();
        car = carFactory.createCar();
        carSpecification = carFactory.createSpecification();
        car.assemble();
        carSpecification.display();
	}
}
