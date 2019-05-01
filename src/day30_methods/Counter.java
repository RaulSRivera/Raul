package day30_methods;

import java.util.Scanner;

public class Counter {
	public static void main(String []args) {
		countUp(5); //only integers
		countDown(5);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num to countUp");
		int inputNum = scan.nextInt();
		//get number from keyboard
		//call countUp method and set it as input
		countUp(inputNum);
	}
	public static void countUp(int num) {
		if(num < 1) {
			System.out.println("Invalid input");
		}else {
			for(int cu = 1; cu <= num; cu++) {
				System.out.print(cu+" ");
			}
			System.out.println();
		}
	}
	public static void countDown(int num) {
		if(num <= 0) {
			System.out.println("Invalid input");
		}else {
			for(int cd = num; cd >= 1; cd--) {
				System.out.print(cd+" ");
			}
			System.out.println();
		}
	}
}