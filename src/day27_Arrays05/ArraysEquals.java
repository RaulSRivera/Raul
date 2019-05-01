package day27_Arrays05;

import java.util.Arrays;

public class ArraysEquals {
	public static void main(String[]args) {
		int [] nums1 = {4,5,6,10,100};
		int nums2 [] = {4,5,6,10,100};
		System.out.println(Arrays.equals(nums1, nums2));
		
		if(Arrays.equals(nums1,nums2)) {
			System.out.println("They are exactly same");
		}else {
			System.out.println("Mismatch values present");
		}
		String [] strArray1 = {"one","two","three"};
		String strArray2 [] = {"One", "Two","Three"};
		System.out.println(Arrays.equals(strArray1,strArray2));
		
		boolean match = Arrays.deepEquals(strArray1, strArray2);
		System.out.println("Match: "+match);
		
	}

}
