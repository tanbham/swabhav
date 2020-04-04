package com.techlabs.game;

import java.util.ArrayList;
import java.util.Scanner;

public class RandomNumberGame {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String choice = "";
		
		do {
			playGame();
			System.out.println("Play again- enter yes or no");
			choice = sc.next();
		}while(choice.equalsIgnoreCase("yes"));
		
	}

	private static void playGame() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> tries = new ArrayList<Integer>();
		int randomNumber = (int)(Math.random()*100);
		int guess;
		
		do {
			System.out.println("Enter your guess");
			guess = sc.nextInt();
			
			if(guess == randomNumber) {
				tries.add(guess);
				System.out.println("Congrats , correct guess");
				break;
			}
			else if(guess < randomNumber) {
				tries.add(guess);
				System.out.println("Sorry, to low");
			}
			else if (guess > randomNumber) {
				tries.add(guess);
				System.out.println("Sorry, to high");
			}

		}while(randomNumber != guess);
		
		System.out.println("The correct guess is "+guess);
		System.out.println("All tried numbers are ");
		
		for(int i : tries) {
			System.out.println(i);
		}
		
	}
	
}
