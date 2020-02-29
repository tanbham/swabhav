package com.techlabs.model;

public class Person {
	private String name;
	private String gender;
	private int age;
	private float weight;
	private float height;
	private static final String OTHERS = "others";
	private static final int DEFAULT_VALUE = 1;
	private static final String UNKNOWN = "unknown";
	
	public Person(String pname , String pgender , int p_age , float pweight , float pheight) {
		name = checkName(pname);
		gender = checkGender(pgender);
		age = checkAge(p_age);
		weight = checkBodyDimension(pweight);
		height = checkBodyDimension(pheight);
	}


	public void doWorkOut() {
		weight = weight - 0.02f*weight;
	}
	
	public void doEat() {
		weight = weight + 0.05f*weight;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public float getHeight() {
		return height;
	}
	
	private String checkGender(String pgender) {
		if(pgender.equalsIgnoreCase("")) {
			return OTHERS;
		}
		if(!pgender.equalsIgnoreCase("male") && !pgender.equalsIgnoreCase("female")) {
			return OTHERS;
		}
		return pgender;
	}
	
	private int checkAge(int p_age) {
		if(p_age <= 0) {
			return DEFAULT_VALUE;
		}
		return p_age;
	}
	
	private float checkBodyDimension(float pdimension) {
		if(pdimension <= 0) {
			return DEFAULT_VALUE;
		}
		return pdimension;
	}
	
	private String checkName(String pname) {
		if(pname == null) {
			pname =  UNKNOWN;
		}
		return pname;
	}
}
