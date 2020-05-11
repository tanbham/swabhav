package com.techlabs.model;

import java.util.ArrayList;
import java.util.List;

public class Partner {
	private int id;
	private String name;
	private double companyTurnOver;
	private int empStrength;
	private List<Talent> talent = new ArrayList<Talent>();
	
	public Partner(int id, String name, double companyTurnOver,int empStrength) {
		this.id = id;
		this.name = name;
		this.companyTurnOver = companyTurnOver;
		this.empStrength = empStrength;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getCompanyTurnOver() {
		return companyTurnOver;
	}
	
	public int getEmpStrength() {
		return empStrength;
	}
	
	public String toString() {
		return("Id="+this.id+ " , "+"Name="+this.name+" , "+"CompanyTurnOver="+this.companyTurnOver+" , "+"EmpStrength="+this.empStrength);
	}
	
}
