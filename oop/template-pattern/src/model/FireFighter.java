package model;

public class FireFighter extends Worker {
	@Override
	void getup() {
		System.out.println("FireFighter wakes up");
	}

	@Override
	void eat() {
		System.out.println("FireFighter is having food");
	}

	@Override
	void work() {
		System.out.println("FireFighter is working");
		
	}

	@Override
	void returnHome() {
		System.out.println("FireFighter returns home");
		
	}

	@Override
	void relax() {
		System.out.println("FireFighter is relaxing");
		
	}

	@Override
	void sleep() {
		System.out.println("FireFighter Sleeps");
		
	}
}
