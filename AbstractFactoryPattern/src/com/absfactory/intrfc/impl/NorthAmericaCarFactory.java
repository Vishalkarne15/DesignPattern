package com.absfactory.intrfc.impl;

import com.abc.factory.intrfc.Car;
import com.abc.factory.intrfc.CarSpecification;
import com.abs.factory.intrfc.impl.Hatchback;
import com.abs.factory.intrfc.impl.NorthAmericaSpecification;
import com.absfactory.intrfc.CarFactory;

public class NorthAmericaCarFactory implements CarFactory{

	@Override
	public Car createCar() {
		return new Hatchback();
	}

	@Override
	public CarSpecification createSpecification() {
		return new NorthAmericaSpecification();
	}
}
