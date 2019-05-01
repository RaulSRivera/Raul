package day33_methods05;

public class Calculator {
	public static void main(String[]args) {
		
	}
	public static double add(double num1,double num2) {
		double result = num1 + num2;
		return result;
	}
	public static double multiply(double num1, double num2){
		double result = num1 * num2;
		return result;
		//return num1 * num2;
	}
	public static double subtract(double num1,double num2) {
		double result = num1 - num2;
		return result;
	}
	public static double divide(double num1 , double num2) {
	if(num2 == 0) {
		System.out.println("error");
		return 0;
	}else {
		double result = num1 / num2;
		return result;
	}
	}

}
