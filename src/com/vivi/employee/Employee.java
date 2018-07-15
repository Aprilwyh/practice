package com.vivi.employee;

public class Employee {

	private String name;
	private String address;
	private int number;
	public Employee(String name, String address, int number) {
		System.out.println("Employee构造函数");
		this.name = name;
		this.address = address;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public String address() {
		return address;
	}
	public int number() {
		return number;
	}
}
