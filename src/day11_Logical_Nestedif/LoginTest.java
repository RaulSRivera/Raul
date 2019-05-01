package day11_Logical_Nestedif;

import java.util.Scanner;

public class LoginTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Username:");
		String username = scan.next();
		
		System.out.println("Enter Password:");
		String password = scan.next();
		
		
		String validUsername = "cybertek@gmail.com";
		String validPassword = "woodenspoon10";
		
		if(username.equalsIgnoreCase(validUsername) && password.contentEquals(validPassword)) {
			System.out.println("Login Successful");
		}else if(!username.equalsIgnoreCase(validUsername) && !password.contentEquals(validPassword)) {
			System.out.println("Invalid Username and Invalid Password");
		}else if(!username.equalsIgnoreCase(validUsername) && password.contentEquals(validPassword)) {
			System.out.println("Invalid Username");
		}else if(username.equalsIgnoreCase(validUsername) && !password.contentEquals(validPassword)) {
			System.out.println("Invalid Password");
		}
	}
}
