package com.techlabs.accountequality.test;

import com.techlabs.accountequality.Account;

public class AccountToString {
	public static void main(String args[]) {
		Account acc1 = new Account(101,"abc",600);
		
		//gives same output bcs overload of println(Object) will call toString() internally
		//System.out.println(acc1);
		System.out.println(acc1.toString());
	}
}
