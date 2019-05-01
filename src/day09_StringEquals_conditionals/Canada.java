package day09_StringEquals_conditionals;
import java.util.Scanner;
public class Canada {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the capital of Canada?");
		
		String capital = scan.nextLine();
		//check if answer is correct
		//equals method!
		if (capital.equals("Ottawa")) {
			System.out.println("Your answer is Correct!");
		}else {
			System.out.println("Your answer is Incorrect! "+capital+" is not the capital of Canada");
		}
		double price = 345.5;
		
	}

}
