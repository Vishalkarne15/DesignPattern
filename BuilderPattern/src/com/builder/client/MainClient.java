package com.builder.client;

import com.builder.model.Employee;

public class MainClient {

	public static void main(String[] args) {
		Employee emp = new Employee().setId(5).setName("Vishal").setSal(150000).build();
		System.out.println(emp);
	}

}
