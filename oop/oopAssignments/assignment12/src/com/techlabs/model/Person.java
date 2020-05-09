package com.techlabs.model;

import java.util.Date;

public class Person {

	private int id;
	private String address;
	private Date dob;
	
	public Person(int id, String address , Date dob) {
		this.id = id;
		this.address = address;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public Date getDob() {
		return dob;
	}
	
}
