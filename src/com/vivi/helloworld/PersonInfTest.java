package com.vivi.helloworld;

public class PersonInfTest {

	public static void main(String[] args) {
		PersonInf pInf1 = new PersonInf();
		PersonInf pInf2 = new PersonInf();
		
		/*
		PersonInf pInf1 = new PersonInf("菠萝");
		PersonInf pInf2 = new PersonInf("芒果");
		
		pInf1.pAge(26);
		pInf1.pHeight(169);
		pInf1.pWeight(43);
		pInf1.printInf();

		pInf2.pAge(23);
		pInf2.pHeight(165);
		pInf2.pWeight(41);
		pInf2.printInf();*/
		pInf1.setName("西瓜");
		pInf1.getName();
		pInf1.setAge(26);
		pInf1.getAge();
		
		pInf2.setName("葡萄");
		pInf2.getName();
		pInf2.setAge(22);
		pInf2.getAge();
	}

}
