package com.vivi.employee;

public class Salary extends Employee {
	private double salary;
	public Salary(String name, String address, int number, double salary) {
		System.out.println("Salary构造函数");
		super(name, address, number);
		setSalary(salary); 
	}
	public double getSalary() {
		   return salary;
	}
	public double setSalary() {
		return salary;
	}
}
