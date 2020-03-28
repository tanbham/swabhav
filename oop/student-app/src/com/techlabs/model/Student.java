package com.techlabs.model;

public class Student {
	private int id;
	private String name;
	private float cgpa;
	private static int countOfInstances;
	
	static {
		int countOfInstances = 0;
		System.out.println("We are in static block");
	}
	
	public Student(int id ,String name , float cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
		countOfInstances++;
		System.out.println("We are in constructor");
	}
	
	public Student(int id , String name) {
		this(id, name, 7.0f);
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public float getCgpa() {
		return cgpa;
	}
	
	public int getCount() {
		return countOfInstances;
	}
	
	public static int headCount() {
		//return id; /// cannot access nonstatic fields in static method
		return countOfInstances;
	}
	
	
}
