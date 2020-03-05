package com.techlabs.thisfile;

public class UseOfThis {
	private int localVariable;
	//when local variable name and argument name is same we use this keyword
	public void setValue(int localVariable) {
		this.localVariable = localVariable;
	}
	
	public int getValue() {
		return localVariable;
	}
}
