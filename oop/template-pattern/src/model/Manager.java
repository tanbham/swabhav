package model;

public class Manager extends Worker{

	@Override
	void getup() {
		System.out.println("Manager wakes up");
	}

	@Override
	void eat() {
		System.out.println("Manager is having food");
	}

	@Override
	void work() {
		System.out.println("Manager is working");
		
	}

	@Override
	void returnHome() {
		System.out.println("Manager returns home");
		
	}

	@Override
	void relax() {
		System.out.println("Manager is relaxing");
		
	}

	@Override
	void sleep() {
		System.out.println("Manager Sleeps");
		
	}
	
}
