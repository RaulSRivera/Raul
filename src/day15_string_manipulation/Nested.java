package day15_string_manipulation;
import java.util.Scanner;
public class Nested {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String emoji = scan.next();
		String smile = ":)";
		//char colon = ':', semicolon = ';', open = '(', close = ')';
		// ==, != Check if not 2 characters
		if (emoji.length() != 2) {
			System.out.println("invalid");
			return; //stop execution
		}
		char first = emoji.charAt(0);
		char second = emoji.charAt(1);
		
		if(first == ':') {
			if (second == ')') {
				System.out.print("smile");
			}else if(second == '(') {
				System.out.println("sad");
			}else if(second == 'p') {
				System.out.println("playful");
			}else if(second == 'o') {
				System.out.println("surprised");
			}else if(second == '/') {
				System.out.println("upset");
			}else {
				System.out.println("unknown emoji");
			}
		}else if(first == ';') {
			if(second == ')') {
				System.out.println("wink");
			}else {
				System.out.println("unknown emoji");
			}
		}else if(second == ':') {
			if(first == '(') {
				System.out.println("smile");
			}else if(first == ')') {
				System.out.println("sad");
			}else {
				System.out.println("unknown emoji");
			}
		}else {
			System.out.println("invalid");
		}
	}
}
