package com.techlabs.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Organisation {
	private int id;
	private String name;
	private Date registrationDate;
	private List<Partner> partners = new ArrayList<Partner>();
	
	public Organisation(int id, String name, Date registrationDate) {
		this.id = id;
		this.name = name;
		this.registrationDate = registrationDate;
	}
	
	public void add(Partner partner) {
		if(partner != null) {
			partners.add(partner);
		}
	}
	
	public int PartnerCount() {
		return partners.size();
	}
	
	public Iterator<Partner> getPartners() {
		return this.partners.iterator();
	}

	public String toString() {
		return("Name of Organisation="+this.name+" , "+"Registration Date="+this.registrationDate);
	}
}