package com.funintrfc.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.funintrfc.model.Employee;

public class MainClass {

	public static void main(String[] args) {
		Supplier<Employee> supplier = ()->(new Employee(1, "Vishal", 140000));
		Employee emp = supplier.get();
		Consumer<Employee> conEmp = empObj -> System.out.println(empObj);
		conEmp.accept(emp);
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "Vishal", 140000));
		empList.add(new Employee(2, "Viyansh", 145000));
		empList.add(new Employee(3, "Yogita", 135000));
		empList.add(new Employee(4, "Rahul", 120000));
		empList.add(new Employee(5, "Rohit", 110000));
		empList.add(new Employee(6, "John", 100000));
		
		System.out.println("============= empSal > 125000 ============");
		Predicate<Employee> predicateEmp = empPred -> empPred.getSal()>125000;
		empList.stream().filter(predicateEmp).collect(Collectors.toList()).forEach(conEmp);
		
		System.out.println("============= empSal > 125000 ============");
		Predicate<Employee> predicateEmp1 = empPred -> empPred.getSal()<125000;
		empList.stream().filter(predicateEmp1).collect(Collectors.toList()).forEach(conEmp);
		
		System.out.println("============= Comparator empSal reversed ============");
		empList.stream()
		.sorted(Comparator.comparing(Employee::getSal).reversed())
		.collect(Collectors.toList())
		.forEach(empComparator->System.out.println(empComparator));
		
		System.out.println("============= combinedStream empSal with flat map============");
		List<Employee> empList1 = new ArrayList<>();
		empList1.add(new Employee(7, "Shiwani", 90000));
		empList1.add(new Employee(8, "Shraddha", 80000));
		
		Stream<Employee> combinedStream = Stream.of(empList1,empList).flatMap(Collection::stream);
		Collection<Employee> colleEmployees = combinedStream.collect(Collectors.toList());
		colleEmployees.forEach(combinedEmp->System.out.println(combinedEmp));
		
		System.out.println("============= combinedStream empSal with out flat map============");
		Collection<List<Employee>> colleEmployees1 = Stream.of(empList1,empList).collect(Collectors.toList());
		colleEmployees1.forEach(combinedEmp->System.out.println(combinedEmp));
	}
}
