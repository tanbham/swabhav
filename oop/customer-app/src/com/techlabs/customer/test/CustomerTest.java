package com.techlabs.customer.test;

import com.techlabs.customer.Customer;

public class CustomerTest {
	public static void main(String args[]) {
		Customer c1 = new Customer("abc",10);
		System.out.println(c1.getId());
		
		Customer c2 = new Customer("xyz",11);
		System.out.println(c2.getId());
		
		Customer c3 = new Customer("dsd",11);
		System.out.println(c3.getId());
		
		System.out.println(c3.getId());
	}
}
