package day23_Loops_Arrays;

import java.util.Scanner;

public class BruteForce {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		String expectedUsername = "admin";
		String expectedPassword = "admin123";
		String username = "";
		String password = "";
		int attempts = 5;
		do {
			
			if(attempts-- == 0) {
				System.out.println("You have exceeded number of login attempts");
				System.out.println("User has been deactivated for minutes.");
				return;
			}
			attempts--;
			System.out.println("Please enter username");
			username = scan.next();
			if(!username.contentEquals(expectedUsername)) {
				System.out.println("Wrong username");
				System.out.println("Attempts left: "+attempts);
				continue;
			}
			System.out.println("Please enter password");
			password = scan.next();
			if(!password.equals(expectedPassword)) {
				System.out.println("Wrong password");;
				System.out.println("Attempts left: "+attempts);
				continue;
			}
		}while(!username.equals(expectedUsername) || !password.equals(expectedPassword));
		System.out.print("Login successful");
	}

}
