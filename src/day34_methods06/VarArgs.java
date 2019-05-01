package day34_methods06;

import java.util.Arrays;

public class VarArgs {
	public static void printWords(String... words) {
		//handle it like an array
		for(String w : words) {
			System.out.println(w);
		}
	}
	public static void main(String[]args) {
		printWords("red", "blue","gray");
		printWords("green");
		printWords("yellow","pink");
		printWords();
		
		System.out.println(sum(3,5,6));
		System.out.println(sum(500,25,600,60));
		int budget = 200;
		if(sum(10,45,110,30,5) <= budget) {
			System.out.println("Within budget");
		}else {
			System.out.println("broke");
		}
		int total =sum(234,43,567,12,34,5);
		System.out.println("Total: "+total);
		
		cook("Rice","Meat","Churrizo");
		cook("Water","Peach");
		
	}
	public static int sum(int...nums) {
		int sum= 0;
		for(int n : nums) {
			sum += n;
		}
		return sum;
	}
	public static void cook(String name,String...ings) {
		System.out.println("Food: "+name);
		System.out.println(Arrays.toString(ings));
	}
	public static void shoppingList(int totalPrices,String...items) {
		System.out.print("Total cost: "+totalPrices);
		System.out.println(Arrays.toString(items));
	}
}
