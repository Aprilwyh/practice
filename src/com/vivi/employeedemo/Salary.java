package com.vivi.employeedemo;

public class Salary extends Employee {
	private double salary;
	public Salary(String name, String address, int number, double salary) {
		super(name, address, number);
		System.out.println("Salary构造函数");
		setSalary(salary); 
	}
	public double getSalary() {
		   return salary;
	}
	/*public double setSalary() {
		return salary;
	}*/
	public void mailCheck() {
		System.out.println("Salary类的mailCheck方法");
		System.out.println("支票邮寄给：" + getName()+ ",工资为:" + salary);
	}
	public void setSalary(double newSalary) {
		if(newSalary >= 0.0) {
			salary = newSalary;
		}
	}
	/*public double computePay() {
		System.out.println("计算工资，付给：" + getName());
		return salary/52;
	}*/
}
