package com.techlabs.account;


import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class InsufficientExceptionTest {
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void withdraw_more_than_minimum_balance() {
		
		thrown.expect(InsufficientException.class);
		thrown.expectMessage("Account number 101 has balance of Rs 4000.0 and cannot withdraw more than Rs 3000.0 since the minimum balance needed in account Rs 1000");
		
		Account acc1 = new Account(101,"Tanmay Bhambure",1000);
		acc1.deposit(4000);		
		acc1.withdraw(8000);
	}
}
