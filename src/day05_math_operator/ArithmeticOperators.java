package day05_math_operator;

public class ArithmeticOperators {
	public static void main(String[] args) {
		//+- addition operator
		System.out.println(55+5);
		int chairs = 140;
		System.out.println(chairs + 2);
		int moreChairs = chairs + 5;
		System.out.println(moreChairs);
		int tables = 130;
		int total = tables + chairs;
		System.out.println(total);
		
		//-subtraction. minus
		System.out.println(500-123);
		int result = 44-23;
		System.out.println(result);
		
		double balance = 1200.50;
		double transaction = 56.44;
		System.out.println(balance - transaction);
		balance = balance - transaction;
		System.out.println(balance);
		
		//create a variable linesOfCode and assign 50 and print "lines of code 50"
		//you deleted 2 lines
		//decrease value of linesOfCode by 2 and print "lines of code 48"
		int linesOfCode = 50;
		System.out.println("Lines of code " + linesOfCode);
		linesOfCode = linesOfCode - 2;
		System.out.println("Lines of code " + linesOfCode);
		
		//multiplication *
		System.out.println(22 * 2);
		//declare variables classes and assign 5
		int classes = 5;
		System.out.println(linesOfCode * classes);
		int totalLinesOfCode = linesOfCode * classes;
		//totalLineOfCode=240
		System.out.println("totalLineOfCode=" +totalLinesOfCode);
		//division operator
		System.out.println(10/3);
		System.out.println(55/5);
		System.out.println(10.0/3);
		System.out.println(5.0/2.0);
		System.out.println(5/2);
		//(11/0) Java will continue to compile but will show error
	}

}
