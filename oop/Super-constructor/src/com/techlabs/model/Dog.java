package com.techlabs.model;

public class Dog extends Animal {
	public Dog() {
		System.out.println("Within default Dog constructor");
	}
	public Dog(String name) {
		super(name);
		System.out.println("Within parameterized Dog constructor");
	}
}
