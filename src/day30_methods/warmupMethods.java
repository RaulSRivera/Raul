package day30_methods;

import java.util.*;

public class warmupMethods {
	public static void print5stars() {
		System.out.println("* * * * *");
	}
	public static void main(String[]args){
		print5stars();
		for(int p = 0; p <=100;p++) {
			print5stars();
		}
		introduce();
		introduce();
	}
// the order will work either way but main method should be on top
	public static void introduce() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scan.next();
		System.out.println("Nice to meet you, "+name);
	}
}
