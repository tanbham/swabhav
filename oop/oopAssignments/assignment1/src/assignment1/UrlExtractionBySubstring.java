package assignment1;

public class UrlExtractionBySubstring {
	public static void main(String args[]) {
		String url = "http://www.swabhavtech=.com?developer=pawan&role=software";
		//String url = "http://www.swabhavtech.com?developer=pawan&";
		//String url = "http://www.swabhavtech.com?&role=software";
		url = url.replaceAll("=",".");
		System.out.println(url);
		
		int indexOfCom = url.indexOf(".com");
		int indexOfWww = url.indexOf("w.");
		int indexOfQuestionMark = url.indexOf("?");
		int indexOfAmpersand = url.indexOf("&"); 
	
		if(url.contains("www")) {
			System.out.println(url.substring(indexOfWww+2,indexOfCom-1));
		}
		
		if(url.contains("developer")) {
			System.out.println(url.substring(indexOfQuestionMark+11,indexOfAmpersand));
		}
		
		if(url.contains("role"))
		System.out.println(url.substring(indexOfAmpersand+6));	
	}

}
