package day35_ReviewDay_methods;
import java.util.*;
public class UniqueArray {
	public static void main(String...strings) {
		int [] nums = {3,5,2,4,7,9,6,5,3,1,9,5};
		System.out.println(nums);
		System.out.println(Arrays.toString(nums));
		
		findUnique(nums);
		int[] arr= {2,3,4,5,6,7,2,3,4,5};
		findUnique(arr);
	}

	private static void findUnique(int[] nums) {
		for(int i = 0; i <= nums.length; i++) { //outer loop
			int temp = nums[i]; //gets a number
			int counter = 0;
			for(int j = 0; j <= nums.length; j++) { //inner loop
				if(nums[j] == temp && i != j) {
					counter++;
					break; //exits inner loop
				}
			}
			if(counter == 0) { //if still 0, then unique
				System.out.println(temp);
			}
		}
	}

}
