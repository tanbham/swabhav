package com.techlabs.model.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.UUID;

import com.techlabs.model.Customer;
import com.techlabs.model.LineItem;
import com.techlabs.model.Order;
import com.techlabs.model.Product;

public class ShoppingApp {
	public static void main(String args[]) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Product pen = new Product(UUID.randomUUID(),"Pen",50,10);
		Product book = new Product(UUID.randomUUID(),"book",100,50);
		Product pad = new Product(UUID.randomUUID(),"pad",200,50);
		LineItem penItem = new LineItem(UUID.randomUUID(),10,pen);
		LineItem bookItem = new LineItem(UUID.randomUUID(),20,book);
		LineItem padItem = new LineItem(UUID.randomUUID(),50,pad);
		
		Product jeans = new Product(UUID.randomUUID(),"Jeans",500,50);
		Product tshirt = new Product(UUID.randomUUID(),"Tshirt",200,10);
		LineItem jeansItem = new LineItem(UUID.randomUUID(),1,jeans);
		LineItem tshirtItem = new LineItem(UUID.randomUUID(),1,tshirt);
		
		Order order1 = new Order(UUID.randomUUID(),sdf.parse("16-05-2020"));
		order1.addItem(penItem);
		order1.addItem(bookItem);
		order1.addItem(padItem);
		
		Order order2 = new Order(UUID.randomUUID(),sdf.parse("10-05-2020"));
		order2.addItem(jeansItem);
		order2.addItem(tshirtItem);
		order2.addItem(tshirtItem); // tshirt added twice
		
		Customer tanmay = new Customer(UUID.randomUUID(),"Tanmay Bhambure","Thane");
		tanmay.addOrder(order1);
		tanmay.addOrder(order2);
		printInfo(tanmay);
	}

	private static void printInfo(Customer customer) {
		System.out.println("Order Details are\n");
		ArrayList<Order> orders =customer.getOrderDetails();
		for(Order order : orders) {
			System.out.println(order);
			printItemDetails(order);
			System.out.println();
		}
	}

	private static void printItemDetails(Order order) {
		ArrayList<LineItem> items = order.getLineItems();
		for(LineItem item : items) {
			System.out.println(item.getProduct());
			System.out.println(item);
		}
		
	}
}
