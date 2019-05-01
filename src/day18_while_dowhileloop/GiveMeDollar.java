package day18_while_dowhileloop;
import java.util.Scanner;
public class GiveMeDollar {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int dollars = 0;
		while(dollars != 5) {
			System.out.println("Give me 5 dollars.");
			dollars = scan.nextInt();
		}
		System.out.println("ty 4 da 5 dollar");
	}

}
