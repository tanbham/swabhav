package com.techlabs.model;

import java.util.UUID;

public class Product {
	private UUID id;
	private String name;
	private double price;
	private float discountPercentage;
	
	public Product(UUID uuid, String name, double price, float discountPercentage) {
		this.id = uuid;
		this.name = name;
		this.price = price;
		this.discountPercentage = discountPercentage;
	}
	
	public double getTotalCost() {
		return this.price - this.price*this.discountPercentage/100;
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getDiscountPercentage() {
		return discountPercentage;
	}
	
	public String toString() {
		return ("  ProductID="+this.id+"\n"+"  ProductName="+this.name+"\n"+"  Price="+getTotalCost());
	}
}
