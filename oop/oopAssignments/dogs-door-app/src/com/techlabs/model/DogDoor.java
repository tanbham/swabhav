package com.techlabs.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {

	private boolean open;
	private List allowedBark = new LinkedList();
	
	public DogDoor() {
		this.open = false;
	}
	
	public void addAllowedBark(Bark bark) {
		allowedBark.add(bark);
	}
	
	public List getAllowedBarks() {
		return allowedBark;
	}
	
	public void open() {
		System.out.println("The Dog Door opens");
		open = true;
		
		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				close();
				timer.cancel();
			}
			
		},5000);

	}
	
	public void close() {
		System.out.println("The Dog Door closes");
		open = false;	
	}
	
	public boolean isOpen() {
		return open;
	}
}
