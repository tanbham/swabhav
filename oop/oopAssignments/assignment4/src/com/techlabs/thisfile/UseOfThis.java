package com.techlabs.thisfile;

public class UseOfThis {
	private int localVariable;
	//default constructor
	//this() is used to call the overloaded constructor with the given msg
	public UseOfThis() {      
		this("going to overloaded constructor");
	}
	
	//when local variable name and argument name is same we use this keyword
	//this is a reference variable that refers to current object
	public UseOfThis(String message) {
		System.out.println(message);
	}
	
	public void setValue(int localVariable) {
		this.localVariable = localVariable;
	}
	
	public int getValue() {
		return localVariable;
	}
}
