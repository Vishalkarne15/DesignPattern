package com.funintrfc.client;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.funintrfc.model.Employee;

public class PredicateMainClass {

	public static void main(String[] args) {
		
		//Printing employee having salary more than 120000
		System.out.println("Start Printing employee having salary more than 120000");
		Predicate<Employee> predicateEmployeeSal = predEmpLambda -> predEmpLambda.getSal()>120000;
		EmployeeCollection.empCollection1().stream().filter(predicateEmployeeSal).forEach(System.out::println);
		System.out.println("End Printing employee having salary more than 120000");
		System.out.println("############@@@@@@@@@@@@@@@@############");
		System.out.println("Start Printing employee having name start with J");
		Predicate<Employee> predicateEmployeeName = predEmpLambda -> predEmpLambda.getName().startsWith("y") 
														|| predEmpLambda.getName().startsWith("Y");
		List<Employee> collect = EmployeeCollection.empCollection1().stream()
			.filter(predicateEmployeeName)
				.collect(Collectors.toList());
		collect.forEach(System.out::println);
		System.out.println("Start Printing employee having name start with E");
		
	}

}
