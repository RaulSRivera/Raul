package day10_logicalOperators_conditionals;
import java.util.Scanner;
public class CreditScreRating {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your credit score");
		
		int creditScore = scan.nextInt();
		//excellent => 750 - 850 range
		if (creditScore >= 750 && creditScore <= 850) {
			System.out.println("Excellent"); //true
		}else if (creditScore < 750 && creditScore >= 700) {
			System.out.println("Good");
		}else if (creditScore < 700 && creditScore >= 650) {
			System.out.println("Fair");
		}else if (creditScore < 650 && creditScore >= 550) {
			System.out.println("Poor");
		}else if (creditScore <550 && creditScore >= 0) {
			System.out.println("Bad");
		}else {
			System.out.println("Invalid score");
		}
	}

}
