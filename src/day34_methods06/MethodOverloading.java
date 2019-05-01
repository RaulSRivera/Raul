package day34_methods06;

public class MethodOverloading {
	public static void main(String[]args) {
		add(10,20);
		add("one","two");
		add(4.2,6.9);
		long l = 1234L;
		long M = 5678L;
		add(l,M);
	}
	public static void add(int num1, int num2) { //2 int
		int result = num1 + num2;
		System.out.println("Result: "+result);
	}
	public static void add(double num1, double num2) { //2 double
		double result = num1 + num2;
		System.out.println("Result: "+result);
	}
	public static void add(String str1, String str2) { // 2 string
		String result = str1 + str2;
		System.out.println("Result: "+result);
	}
	public static void add(long num1, long num2) {
		long result = num1 + num2;
		System.out.println("Result: "+result);
	}

}
