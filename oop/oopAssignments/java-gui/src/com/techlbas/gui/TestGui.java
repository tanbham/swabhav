package com.techlbas.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class TestGui implements ActionListener { //for every event you need to implement listener interface 
	static JButton button;
	
	public static void main(String args[]) {
		TestGui go = new TestGui();        //instance of this class IS-A ActionListener
		go.testGui();
	}
	
	public void testGui() {
		JFrame frame = new JFrame();
		
		button = new JButton("click here");   //clicking a button is an ActionEvent thus implement ActionListener
		button.addActionListener(this);     //argument pass must be an object from a class that implements ActionListener
											//register your interest with button
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(button);
		frame.setSize(300,300);
		frame.setVisible(true);	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {  //button calls this method to tell you an event has happened
		button.setText("Button is pressed");      //this is the actual event-handling method
	}
	
}
