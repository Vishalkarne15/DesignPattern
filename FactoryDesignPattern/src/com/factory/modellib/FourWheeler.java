package com.factory.modellib;

import com.factory.interfacelib.Vehicle;

public class FourWheeler implements Vehicle{

	private String msg;
	public FourWheeler(String msg) {
		super();
		this.msg = msg;
	}
	
	@Override
	public void printable() {
		System.out.println("Your In ::"+msg);
	}

}
