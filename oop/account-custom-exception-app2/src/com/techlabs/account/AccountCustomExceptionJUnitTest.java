package com.techlabs.account;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AccountCustomExceptionJUnitTest {
	Account acc1;
	
	@Before
	public void generate_instance_of_an_Account() {
		acc1 = new Account(101,"Tanmay Bhambure",1000);
		acc1.deposit(4000);
	}
	
	@Test(expected = InsufficientException.class)
	public void test_withdraw_9000_throw_runtimeException() {
		acc1.withdraw(9000);
	}
	
	@Test
	public void test_withdraw_1000_get_balance_3000() {
		acc1.withdraw(1000);
		
		double expectedBalance = 3000;
		double actualBalance = acc1.getBalance();
		
		assertEquals(expectedBalance , actualBalance,1);
	}
	
	@Test
	public void test_get_balance_4000() {
		
		double expectedBalance = 4000;
		double actualBalance = acc1.getBalance();
		
		assertEquals(expectedBalance , actualBalance,1);
	}
	
	@Test
	public void test_total_transactions_in_this_class_is_3_return_3() {
		
		int expectedNumberOfTransactions = 3;
		int actualNumberOfTransactions = acc1.getTotalNoOfTransactions();
		
		assertEquals(expectedNumberOfTransactions , actualNumberOfTransactions );
	}

}
