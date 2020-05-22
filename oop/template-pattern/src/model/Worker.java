package model;

public abstract class Worker {
	abstract void getup();
	abstract void eat();
	abstract void work();
	abstract void returnHome();
	abstract void relax();
	abstract void sleep();
	
	public void dailyRoutine() { //template method
		getup();
		eat();
		work();
		returnHome();
		relax();
		sleep();
	}
}
