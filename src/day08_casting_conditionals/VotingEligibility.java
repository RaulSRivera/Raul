package day08_casting_conditionals;
import java.util.Scanner;
public class VotingEligibility {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int votingAge = 18;
		System.out.println("What is your age?");
		int yourAge = scan.nextInt();
		if (yourAge >= votingAge) {
			int years = yourAge - votingAge;
			System.out.println("You are eligible to vote.");
			System.out.println("You have been eligible for "+years+" years");
		}else {
			int moreYears = votingAge - yourAge;
			System.out.println("You are not eligible to vote.");
			System.out.println("Come back in "+moreYears+" years, ya scrub.");
		}
	}

}
