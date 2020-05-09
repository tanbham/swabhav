
public class Test {
	public static void main (String args[]) {
		Human t = new Human();
		Human s = new Human();
		
		System.out.println(t);
		System.out.println(s);
		
		System.out.println(s.hashCode());
		System.out.println(t.hashCode());
		
		System.out.println(t.equals(s)); //ref//hashcode
	}
}
