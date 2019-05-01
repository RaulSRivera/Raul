package day20_ForLoops;
import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = scan.nextInt();
		if(num < 1 || num > 10) {
			System.out.println("Invalid input");
			return;
		}
		for(int i = 1; i < 11; ++i) {
			System.out.println(num+" x "+i+" = "+(num*i));
		}
	}
}