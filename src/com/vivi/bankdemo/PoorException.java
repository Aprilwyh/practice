package com.vivi.bankdemo;

public class PoorException extends Exception {

	private double amount;
	public PoorException(double amount) {
		this.amount = amount;
	}
	public double getAmount() {
		return amount;
	}
}
