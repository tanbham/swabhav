package com.techlbas.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestGuiTwo implements ActionListener{
	JButton button1;
	JButton button2;
	
	public static void main(String args[]) {
		TestGuiTwo go = new TestGuiTwo();
		go.createGui();
	}

	private void createGui() {
		JFrame frame = new JFrame();
		frame.setSize(700, 200);
		frame.setTitle("Tanmay");
		frame.setLayout(new FlowLayout());
		
		button1 = new JButton("click here to turn blue");
		button1.setBackground(Color.RED);

		button1.addActionListener(this);
		
		frame.add(button1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		button1.setText("after clicking");
		button1.setBackground(Color.BLUE);
	}
}
