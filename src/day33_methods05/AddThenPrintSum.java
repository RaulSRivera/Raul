package day33_methods05;

public class AddThenPrintSum {
	public static void main(String[]args) {
		addvoid(10,20);
//		System.out.println(addvoid(3,4)); doesn't return a value	//Lack of void??
		int result = add(6,9);
		System.out.println("Result: "+result);
	}
	public static void addvoid(int n1,int n2) {
		int sum = n1 + n2;
		System.out.println(sum);
	}
	public static int add(int num1,int num2) {
		int sum = num1 + num2;
		return sum;
	}
}
