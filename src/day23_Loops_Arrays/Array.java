package day23_Loops_Arrays;

public class Array {
	public static void main(String[]args) {
		int[]numbers = new int[3];
		int num1 = 5;
		int num2 = 7;
		int num3 = 10;
		//assign to the first
		numbers[0] = num1;
		numbers[1] = num2;
		numbers[2] = num3;
		
		numbers[0] = 7;
		numbers[1] = 8;
		//we cant provide different data type, we use data type of an array
		//numbers[2] = 'a';
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		String[] names = new String[5];
		String [] names2 = {"This", "is", "torture"};
		
		System.out.println(names2[5]);
		System.out.println("Number of Items: "+names2.length);
		String[]countries = {}; //nothing happens
		//Array has fixed size
		countries[0] = "USA";
	}

}
