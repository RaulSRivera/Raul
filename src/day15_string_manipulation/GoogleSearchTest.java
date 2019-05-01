package day15_string_manipulation;

public class GoogleSearchTest {
	public static void main(String[] args) {
		String item = "java";
		String pageTitle = item + " - Google Search";
		
		if(pageTitle.startsWith(item)) {
			System.out.println("Page title check passed");
			
		}else {
			System.out.println("Fail: page title check failed");
		}
		if(pageTitle.endsWith("Google Search")) {
			System.out.println("Pass: google search is in title");
		}else {
			System.out.println("Fail: google search is not in title");
		}
	}

}
