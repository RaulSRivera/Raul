package day23_Loops_Arrays;

import java.util.Scanner;

public class CalculateSum {
	public static void main(String[]args) {
		
		int sum = 0;
		int num = 0;
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<6; i++ ) {
			System.out.println("Enter number");
			num = scan.nextInt();
			if(num<=0) {
				continue;
			}
			sum += num;
		}
		System.out.println("total sum: " +sum);
	}
}