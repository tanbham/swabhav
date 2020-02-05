package com.techlabs.callbyvalue;

public class Student {
	String name;
	Student(String name) {
	this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
