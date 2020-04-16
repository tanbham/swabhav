package checkSaloni;

public class Test {
	public static void main(String args[]) {
		Object o = new Animal();
		
		if(o instanceof Animal) {
			Animal a = (Animal)o;
			a.eat();
		}
	
		
	}
}
