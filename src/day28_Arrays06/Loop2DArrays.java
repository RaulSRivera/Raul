package day28_Arrays06;

import java.util.Arrays;

public class Loop2DArrays {
	public static void main(String[]args) {
		String []pizzas[] = { {"pineapple", "ham"}, {"pepperoni", "sausage","bacon"},{"mozarella","chicken"} };
		System.out.println(Arrays.toString(pizzas[0]));
		
		for (String[] pizza : pizzas) {
			System.out.print(pizza.length+"-");
			System.out.println(Arrays.toString(pizza));
		}
		System.out.println("**********For Loop**********");
		for(int i=0; i<pizzas.length; i++) {
			System.out.print(pizzas[i].length+"-");
			System.out.println(Arrays.toString(pizzas[i]));
		}
		for(String topping : pizzas[2]) {
			System.out.println(topping);
		}
		int[][]students = { {4,5,6}, {12,5,7}, {23,55,12,55,3} };
		for(int []group : students) {
			for(int studentID : group) {
				System.out.print(studentID+",");
			}
			System.out.println();
		}
		int[][]nums = { {10,20}, {20,30,40,50}, {100,200,400}, {555,333,111,444,666,78} };
		for(int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j]+" ");
				
			}
		}
	}

}
