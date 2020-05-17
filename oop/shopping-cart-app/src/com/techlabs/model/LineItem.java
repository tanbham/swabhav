package com.techlabs.model;

import java.util.UUID;

public class LineItem {
	private UUID id;
	private int quantity;
	private Product product;
	
	public LineItem(UUID uuid, int quantity, Product product) {
		this.id = uuid;
		this.quantity = quantity;
		this.product = product;
	}
	
	public double calculateItemCost() {
		return this.product.getTotalCost()*this.quantity;
	}

	public UUID getId() {
		return id;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void incrementQuantity() {
		this.quantity++;
	}
	
	public String toString() {
		return("  LineItemID="+this.id+" , "+"Quantity = "+this.quantity+" , "+"LineItem cost"+calculateItemCost());
	}
}
