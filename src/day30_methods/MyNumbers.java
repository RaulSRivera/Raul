package day30_methods;

import java.util.Random;
import java.util.Scanner;

public class MyNumbers {
	public static void main(String[]args) {
		showme5numbers();
		do10pushups();
		rangePrint();
	}
	public static void showme5numbers() {
		Random random = new Random();
		for(int i = 1; i <= 5; i++) {
			System.out.println(random.nextInt(1001)); //will print random number 0-1000
		}
		
		System.out.println();
	
	}
	public static void do10pushups() {
		for(int pu = 1; pu <= 10; pu++) {
			System.out.println("Pushup - "+pu);
		}
		System.out.println("Time to rest");
	}
	public static void rangePrint() {
		Scanner scan = new Scanner(System.in);
		int int1 = scan.nextInt();
		int int2 = scan.nextInt();
		if(int1 < int2) {
			for(int i = int1; i <= int2; i++){
				System.out.print(i+" ");
			}
		}else if(int1 > int2) {
			for(int k = int1; k >= int2; k--){
				System.out.print(k+" ");
			}
		}else{
			System.out.print(int1);
		}
	}
}
