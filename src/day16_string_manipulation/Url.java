package day16_string_manipulation;
import java.util.Scanner;
public class Url {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter url");
		String url = scan.next();
		//www.amazon.com or www.google.com
		//com,net,edu,org,gov
		if (url.startsWith("www.")) {
			System.out.println("www. is present");
		}else {
			System.out.println("invalid url format");
			return;
		}
		
		int dotIndex = url.length()-4;
		//url.lastIndexOf(".");
		if (url.charAt(dotIndex) == '.') {
			System.out.println(". is there before extension");
		}else {
			System.out.print(". is misplaced");
		}
		String domain = url.substring(4, dotIndex);
		String extension = url.substring(dotIndex+1, url.length());		
		
		System.out.println("Domain: " +domain);
		System.out.println("Extension: " +extension);
	}

}
