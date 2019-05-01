package day24_Arrays;

import java.util.Arrays;

public class SumOfNumbers {
	public static void main(String[]args) {
		//create array of integers, length 3
		int[] numbers = new int[3];
		//first value in array
		numbers[0] = 5;
		//second value in array
		numbers[1] = 10;
		//third value in array
		numbers[2] = 20;
		
		System.out.print(numbers); //[I@59f95c5d - hashcode
		//to.String() from arrays class can help print arrays as string
		System.out.println(Arrays.toString(numbers));
		
		//use for loop to loop thru array
		//calculate sum of all elements
		//numbers.length --> returns number of elements in array
		int sum = 0;
		for (int n = 0; n < numbers.length; n++) {
			sum = sum + numbers[n];
			System.out.println("Sum: " +sum);
			
			//find biggest value in array
			int max = Integer.MIN_VALUE; //0 will work too
			System.out.print(Integer.MIN_VALUE);
			for (int i=0;i<numbers.length;i++) {
				if(numbers[i] > max) {
					max = numbers[i];
				}
			}
			System.out.println("Max Value: "+max);	
		}
		//find min value in the array
		int min = Integer.MAX_VALUE;
		for(int k = 0; k < numbers.length; k++) {
			if(numbers[k]<min) {
				min = numbers[k];
				
			}
			System.out.println("Min Value: "+min);
		}
	}

}
