package assignment1;

public class test {
	public static void main(String args[]) {
		String s = "http://www.swabhavtech.com?developer=pawan&role=software";
	    s = s.replaceAll("=",".");
	    s = s.replaceAll("&",".");
	    System.out.println(s);
	    String a[] = s.split("\\.");
	   
	   //testing
	   //for(String i : a ){
	   //   System.out.println(i);
	   //}
	    
	    System.out.println(a[1]);
	    System.out.println(a[3]);
	    System.out.println(a[5]);
	}
}
