package day08_casting_conditionals;
import java.util.Scanner;
public class IFElseWScanner {
	public static void main(String[] args) {
		//passingPercentage = 65;
		//yourScorePercentage = take from scanner
		//check if pass or fail
		Scanner scan = new Scanner(System.in);
		int passingPercentage = 65;
		System.out.println("What is your score?");
		int yourScorePercentage = scan.nextInt();
		
		if (yourScorePercentage >= passingPercentage) {
			System.out.println("You passes! Congratulations!");
		}else {
			System.out.println("You failed");
		}
		System.out.println("do better");
	}

}
