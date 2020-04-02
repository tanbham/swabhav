package com.techlabs.account;

public class Account {
	private String name;
	private int accNo;
	private double balance;
	private int minBalance;
	private static int totalNoOfTransactions;
	
	
	static {
		totalNoOfTransactions = 0;
	}
	
	public Account(int accNo , String name , int minBalance) {
		this.accNo = accNo;
		this.name = name;
		this.minBalance = minBalance;
	}
	
	public void deposit(double money) {
		balance = balance + money;
		totalNoOfTransactions++;
	}
	
	public void withdraw(double amt) {
		if(balance - amt > minBalance) {
			balance = balance - amt;
			totalNoOfTransactions++;
		}
		else {
			totalNoOfTransactions++;
			System.out.println("Cannot withdraw more than "+minBalance);
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getTotalNoOfTransactions() {
		return totalNoOfTransactions;
	}
	
	public int getAccNo() {
		return accNo;
	}
	
	
		
	
}
