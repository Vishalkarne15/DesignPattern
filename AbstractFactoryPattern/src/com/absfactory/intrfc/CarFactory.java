package com.absfactory.intrfc;

import com.abc.factory.intrfc.Car;
import com.abc.factory.intrfc.CarSpecification;

public interface CarFactory {
	public Car createCar();
	public CarSpecification createSpecification();
}
