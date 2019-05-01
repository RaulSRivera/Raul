package day06_operators2;

import java.util.Scanner;

public class ScannerYourName {
	public static void main(String[] args) {
		//create scanner object
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi, what is your name?");
		String name = scan.nextLine(); //accept String input
		System.out.println("Nice to meet you, " +name);
		//practice
		Scanner input = new Scanner(System.in);
		System.out.println("What's your favorite animal?");
		String animal = scan.nextLine();
		System.out.println(animal + "? Mine too!");
		//practice2
		Scanner s = new Scanner(System.in);
		System.out.println("What's your favorite color?");
		String color = scan.nextLine();
		System.out.println("That's a nice color.");
	}

}
