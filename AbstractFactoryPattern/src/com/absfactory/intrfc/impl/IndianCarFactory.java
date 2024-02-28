package com.absfactory.intrfc.impl;

import com.abc.factory.intrfc.Car;
import com.abc.factory.intrfc.CarSpecification;
import com.abs.factory.intrfc.impl.IndianSpecification;
import com.abs.factory.intrfc.impl.Sedan;
import com.absfactory.intrfc.CarFactory;

public class IndianCarFactory implements CarFactory{

	@Override
	public Car createCar() {
		return new Sedan();
	}

	@Override
	public CarSpecification createSpecification() {
		return new IndianSpecification();
	}

	

}
