package com.techlabs.staticblock;

public class StaticBlock {
	
	public StaticBlock() {
		System.out.println("We are in constructor of staticBlock Class");
	}
	
	static {
		System.out.println("Static is called before constructor and executed only once");
	}
}
