package day18_while_dowhileloop;
import java.util.Scanner;
public class Transaction {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your current balance?");
		double balance = scan.nextDouble();
		int count = 0;
		while (balance > 0) {
			count++;
			System.out.println("What is your transaction #"+count+" amount?");
			double transaction = scan.nextDouble();
			if(transaction > balance) {
				System.out.println("Your balance is about to be negative due to this transaction");
				continue;
			}
			balance = balance - transaction; // or balance -= transaction
			System.out.println("Your current balance is "+balance);
		}
		System.out.println("You have insufficient funds for anymore transactions, your balance is "+balance);
		System.out.println("Transaction total count:"+count);
	}

}
