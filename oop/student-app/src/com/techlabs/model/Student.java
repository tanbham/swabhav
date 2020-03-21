package com.techlabs.model;

public class Student {
	private int id;
	private String name;
	private double cgpa;
	private static int countOfInstances;
	
	public Student(int id ,String name , double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
		countOfInstances++;
	}
	
	public Student(int id , String name) {
		this(id, name, 7.0);
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getCgpa() {
		return cgpa;
	}
	
	public int getCount() {
		return countOfInstances;
	}
	
	
	
}
