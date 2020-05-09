package com.techlabs.account;

import static org.junit.Assert.*;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Test;

public class AccountJUnitTest2 {

    Account acc1;
	
	@Before
	public void generate_instance_of_an_Account() {
		acc1 = new Account(101,"Tanmay Bhambure",1000);
	}
	
	@Test
	public void test_Deposit_4000_get_balance_4000() {
		acc1.deposit(4000);
		
		double expectedBalance = 4000;
		double actualBalance = acc1.getBalance();
		
		assertEquals(expectedBalance , actualBalance,1);
	}
	
	@Test
	public void test_Deposit_4000_withdraw_1000_get_balance_3000() {
		acc1.deposit(4000);
		acc1.withdraw(1000);
		
		double expectedBalance = 3000;
		double actualBalance = acc1.getBalance();
		
		assertEquals(expectedBalance , actualBalance,1);
	}

	@Test
	public void test_Deposit_4000_withdraw_9000_throw_runtimeException() {
		Exception ex = null;
		String expectedMessage = "Insufficient funds";
		
		try{
			acc1.deposit(4000);
			acc1.withdraw(9000);
		}catch(Exception e) {
			ex = e;
		}
		assertTrue(ex.getMessage().equals(expectedMessage));
	}
}
