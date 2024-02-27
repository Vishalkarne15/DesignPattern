package com.factory.factorylib;

import com.factory.interfacelib.Vehicle;
import com.factory.modellib.FourWheeler;
import com.factory.modellib.TwoWheeler;

public class VehicleFactory {

	public static Vehicle getVehicleFactory(String vehicleType) {
		Vehicle vehicle = null;
		if(vehicleType.equals("FourWheeler")) {
			vehicle = new FourWheeler(vehicleType);
		}else if(vehicleType.equals("TwoWheeler")) {
			vehicle = new TwoWheeler(vehicleType);
		}
		return vehicle;
	}
}
