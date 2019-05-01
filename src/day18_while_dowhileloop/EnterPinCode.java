package day18_while_dowhileloop;
import java.util.Scanner;
public class EnterPinCode {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int secretPincode = 12394;
		int pincode = 0;
		//keep asking for pincode until correct one is entered
		
		while (pincode != secretPincode) {
			System.out.println("Enter pincode");
			pincode = scan.nextInt();
		}
		System.out.println("Access granted, select operation");
	}

}
