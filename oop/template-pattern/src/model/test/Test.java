package model.test;
import model.FireFighter;
import model.Manager;
import model.Postman;
import model.Worker;

public class Test {
	public static void main(String args[]) {
		Worker tanmay = new Manager();
		tanmay.dailyRoutine();
		System.out.println();
		
		Worker saloni = new Postman();
		saloni.dailyRoutine();
		System.out.println( );
		
		Worker rajeev = new FireFighter();
		rajeev.dailyRoutine();
		System.out.println();
		
	}
}
