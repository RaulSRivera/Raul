package day06_operators2;

import java.util.Scanner;

public class EnterNumber {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in); //create scanner object
		System.out.println("Enter a number:");
		int number = scan.nextInt();
		System.out.println("You entered:" + number);
		//practice
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a digit: ");
		int digit = scan.nextInt();
		System.out.println("You typed:" +digit);
	}

}
