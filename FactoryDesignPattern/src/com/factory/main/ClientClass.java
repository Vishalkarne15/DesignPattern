package com.factory.main;

import com.factory.factorylib.VehicleFactory;
import com.factory.interfacelib.Vehicle;

public class ClientClass {

	public static void main(String[] args) {
		Vehicle vehicle = null;
		vehicle = VehicleFactory.getVehicleFactory("FourWheeler");
		vehicle.printable();
		
		vehicle = VehicleFactory.getVehicleFactory("TwoWheeler");
		vehicle.printable();
	}
	
}
