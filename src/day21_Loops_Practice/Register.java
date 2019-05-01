package day21_Loops_Practice;
import java.util.*;
public class Register {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many items did you purchase?");
		int itemsCount = scan.nextInt();
		double totalPrice = 0.0;
		String items = "";
		
		for (int count = 1; count <= itemsCount; count++) {
		System.out.println("What is item "+count+"?");
		String product = scan.next();
		
		System.out.println("How much is "+product+"?");
		double itemPrice = scan.nextDouble();
		
		items += product + ", "; //items = product + ", "
		totalPrice += itemPrice; // totalPrice = totalPrice + itemPrice
		}
		System.out.println("Your items: "+items);
		System.out.println("Your total Price: "+totalPrice);
	}
}