package com.funintrfc.client;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

import com.funintrfc.model.Employee;

public class SupplierMainClass {

	public static void main(String[] args) {
		
		Supplier<List<Employee>> empSup = () -> EmployeeCollection.empCollection2();
		Optional<Employee> max = empSup.get().stream().max(Comparator.comparing(Employee::getSal));
		if(max.isPresent()) {
			System.out.println(max.get());
		}
		empSup.get().stream()
		.flatMapToDouble(empSal -> DoubleStream.of(empSal.getSal()))
				.forEach(System.out::println);
	}

}
