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
	
	public String getPartner(){
		if(partner != null){
			return partner.getName();
		}
		else{
			return "our organisation";
		}
		
	}

	public String toString(){
		return ("Id="+this.id+" , "+"Name="+this.name+" ,"+"Working for="+getPartner()+" , "+"CGPA="+this.cgpa+" , "+"TechStack="+this.techStack);
	}
	
}
