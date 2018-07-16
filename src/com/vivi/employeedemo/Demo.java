package com.vivi.employeedemo;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary s = new Salary("芒果", "上海", 12100, 8000.00);
		Employee e = new Salary("苹果", "北京", 11560, 9000.00);
		System.out.println("使用 Salary 的引用调用 mailCheck -- ");
		s.mailCheck();
		System.out.println("使用 Employee 的引用调用 mailCheck -- ");
		e.mailCheck();
	}

}
