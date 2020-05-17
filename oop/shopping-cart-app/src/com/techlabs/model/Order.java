package com.techlabs.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Order {
	private UUID id;
	private  Date date;
	private ArrayList<LineItem> items = new ArrayList<LineItem>();
	
	public Order(UUID uuid, Date date) {
		this.id = uuid;
		this.date = date;
	}
	
	public double checkOutCost() {
		double totalAmount = 0;
		for(LineItem i : items) {
			totalAmount = totalAmount + i.calculateItemCost();
		}
		return totalAmount;
	}
	
	public void addItem(LineItem item) {
		if(items.contains(item)) {
			item.incrementQuantity();
		}
		else {
			items.add(item);
		}	
	}

	public UUID getId() {
		return id;
	}

	public Date getDate() {
		return date;
	}
	
	public ArrayList<LineItem> getLineItems(){
		return items;
	}
	
	public String toString() {
		return (">>OrderID="+this.id+" , "+"Date of Purchase="+this.date);
	}
	
}
