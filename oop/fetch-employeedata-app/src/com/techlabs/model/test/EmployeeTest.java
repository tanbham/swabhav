package com.techlabs.model.test;

import com.techlabs.model.ConnectionToURL;

public class EmployeeTest {
	public static void main(String args[]) throws Exception {
		ConnectionToURL fetch = new ConnectionToURL();
		fetch.readDataFromURL();
		
		System.out.println(fetch.getEmployeeDetails());
		
	}
}
