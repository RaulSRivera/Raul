package day19_transactions;
import java.util.Random;
import java.util.Scanner;
public class GuessANumber {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random(); //is used to generate random numbers
		System.out.println("Welcome to the GUESS THE NUMBER GAME!");
		
		int sn = random.nextInt(101);//will give a number between 0-100
		int gn;
		do {
			System.out.println("Guess the correct number");
			gn = scan.nextInt();		
			if(gn < sn) {
				System.out.println("Your number is too small. Try again");
			}else if(gn > sn) {
				System.out.println("Your number is too large. Try again.");
			}
		}while (gn != sn); //!= means "not equal to"
			System.out.println("CORRECT");
	}

}
