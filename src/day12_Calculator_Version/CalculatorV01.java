package day12_Calculator_Version;
import java.util.Scanner;
public class CalculatorV01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number:");
		double num1, num2, result;
		num1 = input.nextDouble();
		System.out.println("Enter second number:");
		num2 = input.nextDouble();
		System.out.println("Select Operator: +, -, *, /, %");
		String operator = input.next();
		result = 0.0;
		//perform calculation and display result
		if (operator.contentEquals("+")) {
			result = num1 + num2;
		}else if (operator.equals("-")) {
			result = num1 - num2;
		}else if (operator.equals("*")) {
			result = num1 * num2;
		}else if (operator.equals("/")) {
			result = num1 / num2;
		}else if (operator.equals("%")) {
			result = num1 % num2;
		}else {
			System.out.println("Invalid operator selected: "+operator);
			return; //stop execution
		}
		System.out.println("Result: "+result);
	}
}