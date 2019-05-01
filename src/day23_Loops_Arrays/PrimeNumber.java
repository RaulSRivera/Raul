package day23_Loops_Arrays;

import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Provide a number");
		int number = scan.nextInt(); 
		for(int i = 2; i < number; i++) {
			
		
			if(number%i == 0) {
				System.out.println(number+" - it's not a prime number");
				return;
			}
				
		}
		System.out.println(number+" - it's a prime number"); 
	}
	

}
