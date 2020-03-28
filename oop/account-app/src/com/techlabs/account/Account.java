package com.techlabs.account;

public class Account {
	private double balance;
	private int minBalance;
	
	
	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}
	
	public void deposit(double money) {
		balance = balance + money;
	}
	
	public void withdraw(double amt) {
		if(balance - amt > minBalance) {
			balance = balance - amt;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
}
