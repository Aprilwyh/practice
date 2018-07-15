package com.vivi.bankdemo;

public class Account {

	private double yue;//余额
	private int number;//卡号
	public Account(int number) {
		this.number = number;
	}
	public void cunQian(double amount) {
		yue += amount;
	}
	public void quQian(double amount) throws PoorException{
		if(amount <= yue) {
			yue -= amount;
		}else {
			double i = amount - yue;
			throw new PoorException(i);
		}
	}
	public double getYue() {
		return yue;
	}
	public int getNumber() {
		return number;
	}
}
