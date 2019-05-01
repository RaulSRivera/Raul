package day08_casting_conditionals;
import java.util.Scanner;
public class GradeCheck {
	public static void main(String[] args) {
		//a b c d
		//char grade = scan.next().charAt(0);
		//if grade is 'A' =>
			//excellent job
		//else
			//how did you miss from 'A'
			//int points scanner
			//print "you grade b isn't good enough. you could ear 10 more points if you studied harder."
		System.out.println("### Start Program ###");
		Scanner key = new Scanner(System.in);
		System.out.println("What is your grade?");
		char grade = key.next().charAt(0);
		if(grade == 'A') {
			System.out.println("Excellent job!");
		}else {
			System.out.println("How many points did you miss?");
			int points = key.nextInt();
			System.out.println("why");
			System.out.println("### End Program###");
		}
	}

}
