package com.builder.model;

public class Employee {

	private int id;
	private String name;
	private double sal;
	public Employee setId(int id) {
		this.id = id;
		return this;
	}
	public Employee setName(String name) {
		this.name = name;
		return this;
	}
	public Employee setSal(double sal) {
		this.sal = sal;
		return this;
	}
	
	public Employee build() {
		return this;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
}
