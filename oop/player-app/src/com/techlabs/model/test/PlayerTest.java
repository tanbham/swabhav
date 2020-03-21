package com.techlabs.model.test;

import com.techlabs.model.Player;

public class PlayerTest {
	public static void main(String args[]) {
		Player sachin = new Player(101,"sachin",5);
		Player virat = new Player(102,"virat");
		printInfo(sachin);
		printInfo(virat);
		
		System.out.println("Info of elder player :");
		Player temp = sachin.whoIsElder(virat);
		printInfo(temp);
		System.out.println("Temp hashcode = "+temp.hashCode());
		System.out.println("sachin hashcode = "+sachin.hashCode());
		System.out.println("virat hashcode = "+virat.hashCode());
	}

	private static void printInfo(Player player) {
		System.out.println("Name = "+player.getName()+" ID = "+player.getId()+" Age = "+player.getAge());
		
	}
}
