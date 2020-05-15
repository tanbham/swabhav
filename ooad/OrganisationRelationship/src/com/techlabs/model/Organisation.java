package com.techlabs.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class Organisation {
	private UUID id;
	private String name;
	private Date registrationDate;
	private List<Partner> partners = new ArrayList<Partner>();
	private List<Talent> talents = new ArrayList<Talent>();
	
	public Organisation(UUID uuid, String name, Date registrationDate) {
		this.id = uuid;
		this.name = name;
		this.registrationDate = registrationDate;
	}
	
	public void addTalent(Talent talent){
		if(talent != null){
			talents.add(talent);
		}
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
	
	public Iterator<Talent> getTalents() {
		return this.talents.iterator();
	}

	public String toString() {
		return("Name of Organisation="+this.name+" , "+"Registration Date="+this.registrationDate+" ' "+"ID="+this.id);
	}
}
