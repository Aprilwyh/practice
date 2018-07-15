package com.vivi.bankdemo;

public class BankDemo {

	public static void main(String[] args) {
		Account ac = new Account(101);
		System.out.println("当前余额为2.3元！");
		System.out.println("存入100元");
		ac.cunQian(100.00);
		//System.out.println(ac.getYue()+"-----------");
		try {
			System.out.println("取出20元");
			ac.quQian(20.00);
			System.out.println("取出600元");
			ac.quQian(600.00);
		} catch (PoorException e) {
			System.out.println("您的余额不足，当前仅剩" + ac.getYue() +"元");
			e.printStackTrace();
		}

	}

}
