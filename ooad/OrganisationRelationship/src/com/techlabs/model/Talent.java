package com.techlabs.model;

import java.util.List;

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
		this.partner = partner;
	}
	
	private Partner checkIfNull(Partner Partner) {
		if(partner == null){
			return null;
		}
		else{
			return partner;
		}
		
	}
	
	public String getPartner(){
		if(partner != null){
			return partner.getName();
		}
		else{
			return null;
		}
		
	}

	public String toString(){
		return ("Id="+this.id+" , "+"Name="+this.name+" ,"+"Working for="+this.partner+" , "+"CGPA="+this.cgpa+" , "+"TechStack="+this.techStack);
	}
	
}
