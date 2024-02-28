package com.abs.factory.intrfc.impl;

import com.abc.factory.intrfc.Car;

public class Sedan implements Car{

	@Override
	public void assemble() {
		System.out.println("Assembling Sedan car.");
	}

}
