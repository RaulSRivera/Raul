package day21_Loops_Practice;
import java.util.*;
public class Months {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int month; //declaring variable
		//i = 10  //initializing variable | assigning a value for first time 
		do {
			System.out.println("Enter Month");
			month = scan.nextInt();
		}while(month >= 1 && month <= 12);
		System.out.println("Invalid month - "+month);
	}

}
