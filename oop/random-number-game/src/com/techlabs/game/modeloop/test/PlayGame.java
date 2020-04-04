package com.techlabs.game.modeloop.test;

import java.util.Scanner;

import com.techlabs.game.modeloop.Game;

public class PlayGame extends Game{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String choice = "";
		Game play = new Game();
		
		do {
			playGame();
			System.out.println("Play again- enter yes or no");
			choice = sc.next();
		}while(choice.equalsIgnoreCase("yes"));
		
	}
}
