package day31_methods03;

import java.util.Scanner;

public class Authentication {
	public static void main (String[]args) {
		Login("mentoring@cybertekschool.com","mentor001");
		Login("mentoring@cybertekschool.com","mentor420");
		}
	public static void Login(String username, String password) {
		String validUsername = "mentoring@cybertekschool.com";
		String validPassword = "mentor001";
		if(username.equals(validUsername) && password.equals(validPassword)) {
			System.out.println("Login successful");
		}else {
			System.out.println("Sign in failed");
		}
	}

}
