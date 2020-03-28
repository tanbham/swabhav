package com.techlabs.account.test;

import java.util.Scanner;

import com.techlabs.account.Account;

public class AccountTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Account acc1 = new Account();
		System.out.print("Set the minimum balance for account1 : ");
		acc1.setMinBalance(sc.nextInt());
		
		System.out.print("Enter the amount to be deposit : ");
		acc1.deposit(sc.nextInt());
		
		System.out.print("Enter the amount to be withdrawn : ");
		acc1.withdraw(sc.nextInt());
		
		System.out.println("Balance : "+acc1.getBalance());
	}
}
