package day23_Loops_Arrays;

import java.util.Scanner;

public class ConcatWords {
	public static void main(String[]args) {
		String words = "";
		String allwords = "";
		Scanner scan = new Scanner(System.in);
		for (int w = 1; w <= 6; w++) {
			System.out.println("print words");
			words = scan.next();
			if(words.equals("java")) {
				continue;
			}
			allwords+=words +", ";
		}
		System.out.println(allwords);
	}

}
