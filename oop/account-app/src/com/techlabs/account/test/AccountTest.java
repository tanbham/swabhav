package com.techlabs.account.test;

import java.util.Scanner;

import com.techlabs.account.Account;

public class AccountTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Account acc1 = new Account(101,"abc",500);
		System.out.print("Enter the amount to be deposited in accNo "+acc1.getAccNo()+" : ");
		acc1.deposit(sc.nextInt());	
		System.out.print("Enter the amount to be withdrawn from accNo "+acc1.getAccNo()+" : ");
		acc1.withdraw(sc.nextInt());
		System.out.println("Balance : "+acc1.getBalance());
		
		Account acc2 = new Account(102,"abc",400);
		System.out.print("Enter the amount to be deposited in accNo "+acc2.getAccNo()+" : ");
		acc2.deposit(sc.nextInt());
		System.out.print("Enter the amount to be withdrawn from accNo "+acc2.getAccNo()+" : ");
		acc2.withdraw(sc.nextInt());
		System.out.println("Balance : "+acc2.getBalance());
		
		System.out.println("Total number of Transactions over all account holders "+acc1.getTotalNoOfTransactions());
	}
}
