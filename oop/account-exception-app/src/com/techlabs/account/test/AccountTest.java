package com.techlabs.account.test;

import com.techlabs.account.Account;

public class AccountTest {
	public static void main(String args[]) {
		Account acc1 = new Account(101,"abc",1000);
		acc1.deposit(4000);
		try{
			acc1.withdraw(9000);
		}
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End of main");
	}
}
