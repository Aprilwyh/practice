package com.vivi.helloworld;

public class StaticTest {
//每次创建一个新对象就会分配一个实例变量，而始终只会分配一个静态变量
	private static int staticInt = 1;
	private int random = 1;
	
	public StaticTest() {
		staticInt++;//staticInt会不断累加，因为无论创建多少个实例对象， 永远都只分配了一个 staticInt变量
		random++;//random只执行这一次，因为每创建一个实例对象，就会分配一个 random
		System.out.println("staticInt=" + staticInt + "random=" + random);
	}
	public static void main(String[] args) {
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		StaticTest st3 = new StaticTest();
		StaticTest st4 = new StaticTest();
	}

}
