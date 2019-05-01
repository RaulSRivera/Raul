package day33_methods05;



public class calcTests {
	public static void main(String[]args) {
		System.out.println(Calculator.add(3, 1));
		System.out.println(Calculator.multiply(3, 7));
		System.out.println(Calculator.subtract(9, 9));
		System.out.println(Calculator.divide(3, 6));
		
		double addResult = Calculator.add(3, 1);
		double mResult =Calculator.multiply(3, 1);
		double subtractResult = Calculator.subtract(3, 1);
		double dResult = Calculator.divide(3, 1);
		
		System.out.println("addResult: "+addResult);
		System.out.println("mResult: "+mResult);
		System.out.println("subtractResult: "+subtractResult);
		System.out.println("dResult: "+dResult);
		
		double a = 10.0, b = 5.0;
		double myResult = Calculator.subtract(a,b);
		System.out.println("myResult: "+myResult);
		
		double[] dnums = {2.0,4.0};
		double result2 = Calculator.multiply(dnums[0],dnums[1]);
		System.out.println("result2: "+result2);
		
		if(Calculator.add(10, 26) == 36) {
			System.out.println("Add Unit Test Passed");
		}else {
			System.out.println("Add Unit test failed");
		}
		String str = "java";
		if(str.length() == 4){
			System.out.println("It's 4 characters");
		}else {
			System.out.println("It's not 4 characters");
		}
	}
}
