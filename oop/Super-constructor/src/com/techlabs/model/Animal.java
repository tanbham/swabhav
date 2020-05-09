package com.techlabs.model;

public class Animal {
	private String name;
	
	public Animal() {//default (no-arg)
		name = "Doggy-default";
		System.out.println("In default Animal constructor");
	}
	
	public Animal(String name) {
		this.name = name;
		System.out.println("In parameterized Animal Constructor");
	}
	
	public String getName() {
		return name;
	}
}
