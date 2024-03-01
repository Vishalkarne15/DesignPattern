package com.funintrfc.client;

import java.util.ArrayList;
import java.util.List;

import com.funintrfc.model.Employee;

public class EmployeeCollection {

	public static List<Employee> empCollection1() {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "Vishal", 140000));
		empList.add(new Employee(2, "Viyansh", 145000));
		empList.add(new Employee(3, "Yogita", 135000));
		empList.add(new Employee(4, "Rahul", 120000));
		empList.add(new Employee(5, "Rohit", 110000));
		
		return empList;
	}
	
	
	public static List<Employee> empCollection2() {
		List<Employee> empList1 = new ArrayList<>();
		empList1.add(new Employee(6, "John", 100000));
		empList1.add(new Employee(7, "Shiwani", 90000));
		empList1.add(new Employee(8, "Shraddha", 80000));
		empList1.add(new Employee(9, "Thomas", 180000));
		empList1.add(new Employee(10, "Jonty", 180000));
		return empList1;
	}
	
	
}
