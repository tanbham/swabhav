package com.techlabs.model;

public class Talent {

	private int id;
	private String name;
	private double cgpa;
	private String techStack;
	private Partner partner;
	
	public Talent(int id, String name, double cgpa, String techStack, Partner partner) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
		this.techStack = techStack;
		this.partner = checkIfNull();
	}

	private Partner checkIfNull() {
		return null;
	}
}
