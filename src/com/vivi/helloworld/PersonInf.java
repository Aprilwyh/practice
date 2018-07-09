package com.vivi.helloworld;

public class PersonInf {

	/*
	String name;
	int age;
	int height;
	int weight;
	//PersonInf的构造器
	public PersonInf(String name) {
		this.name = name;
	}
	//设置age的值
	public void pAge(int pAge) {
		age = pAge;
	}
	public void pHeight(int pHeight) {
		height = pHeight;
	}
	public void pWeight(int pWeight) {
		weight = pWeight;
	}
	public void printInf() {
		System.out.println("名字：" + name);
		System.out.println("年龄：" + age);
		System.out.println("身高：" + height);
		System.out.println("体重：" + weight);
	}*/
	
	private String name;
	private int age;
	//PersonInf的构造器
	public PersonInf() {
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		System.out.println("名字：" + name);
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		System.out.println("年龄：" + age);
		return age;
	}
}
