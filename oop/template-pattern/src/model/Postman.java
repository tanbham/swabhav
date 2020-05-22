package model;

public class Postman extends Worker{

	@Override
	void getup() {
		System.out.println("Worker wakes up");
	}

	@Override
	void eat() {
		System.out.println("Postman is having food");
	}

	@Override
	void work() {
		System.out.println("Postman is working");
		
	}

	@Override
	void returnHome() {
		System.out.println("Postman returns home");
		
	}

	@Override
	void relax() {
		System.out.println("Postman is relaxing");
		
	}

	@Override
	void sleep() {
		System.out.println("Postman Sleeps");
		
	}
	
}
