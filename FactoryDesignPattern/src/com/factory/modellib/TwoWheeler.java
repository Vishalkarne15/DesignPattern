package com.factory.modellib;

import com.factory.interfacelib.Vehicle;

public class TwoWheeler implements Vehicle{
	private String msg;
	public TwoWheeler(String msg) {
		super();
		this.msg = msg;
	}
	
	@Override
	public void printable() {
		System.out.println("Your In ::"+msg);
	}
}
