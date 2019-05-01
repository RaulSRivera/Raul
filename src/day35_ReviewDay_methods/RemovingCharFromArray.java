package day35_ReviewDay_methods;

import java.util.Arrays;

public class RemovingCharFromArray {
	public static void main(String[]args) {
		int [] nums = {1,2,1,3,1,4,1,5,6};
		int target = 1; //removing all ones from array
		int counter = 0;
		for(int n : nums) {
			if(n == target) {
				counter++;
			}
		}
		System.out.println(counter);
		//declare new array w/o target
		int [] newArray = new int[nums.length - counter];
		int idx = 0;
		for(int n:nums) {
			if(n != target) {
				newArray[idx] = n;
				idx++;
			}
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(newArray));
	}

}
