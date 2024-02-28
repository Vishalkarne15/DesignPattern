package com.abs.factory.intrfc.impl;

import com.abc.factory.intrfc.CarSpecification;

public class IndianSpecification implements CarSpecification {
	public void display() {
        System.out.println("Indian Car Specification: Fuel efficiency and emissions compliant with EU standards.");
    }
}
