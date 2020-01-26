package assignment1;

public class test {
	public static void main(String args[]) {
		String s = "http://www.swabhavtech.com?developer=pawan&role=software";
	    String new_s1 = s.replaceAll("=",".");
	    String new_s2 = new_s1.replaceAll("&",".");
	    System.out.println(new_s2);
	    String a[] = new_s2.split("\\.");
	    
	   for(String i : a ){
	      System.out.println(i);
	   }
	    
	    System.out.println(a[1]);
	    System.out.println(a[3]);
	    System.out.println(a[5]);
	}
}
