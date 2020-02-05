package assignment1;

public class UrlExtractionTest {
	public static void main(String args[]) {
		String url = "http://www.swabhavtech.com?developer=pawan&role=software";
		//String url = "http://www.swabhavtech.com?developer=pawan&";
		//String url = "http://www.swabhavtech.com?&role=software";
	    url = url.replaceAll("=",".");
	    url = url.replaceAll("&",".");
	    String a[] = url.split("\\.");
	    System.out.println(url);
	    
	   //testing
	   //for(String i : a ){
	    //  System.out.println(i);
	   //}
	    
	    for(int i=0 ; i<a.length ; i++) {
	    	if(a[i].equals("http://www")) {
	    		System.out.println(a[i+1]);
	    	}
	    	if(a[i].equals("com?developer")) {
	    		System.out.println(a[i+1]);
	    	}
	    	if(a[i].equals("role")) {
	    		System.out.println(a[i+1]);
	    	}
	    }   	    
	}
}
