package inhertiance.constructor.case2.test;
import inhertiance.constructor.case2.Child;

public class Test {
	public static void main(String args[]) {
		Child c1 = new Child();
		System.out.println(c1.getFoo());
		
		Child c2 = new Child(200);
		System.out.println(c2.getFoo());
	}
}
