package day21_Loops_Practice;
import java.util.Scanner;
public class Task1 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		//enter 2 ints, make sure sum is 100 or above then print "good numbers"
		int sum = 0;
		do {
			System.out.println("Enter 2 numbers");
			int one = scan.nextInt();
			int two = scan.nextInt();
			sum = one + two;
			
		}while(sum <=100 );
		System.out.println("Good numbers");
	}

}
