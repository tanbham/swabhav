package com.techlabs.account.test;

import com.techlabs.account.Account;
import com.techlabs.account.InsufficientException;

public class AccountTest {
	public static void main(String args[]) {
		Account acc1 = new Account(101,"abc",1000);
		acc1.deposit(4000);
		try{
			acc1.withdraw(8000);
		}
		catch(InsufficientException e) {
			System.out.println(e);
		}
		System.out.println("End of main");
	}
}
