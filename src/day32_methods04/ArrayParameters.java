package day32_methods04;
import java.util.Arrays;
public class ArrayParameters {
	public static void main(String[]args) {
		int[] myArray = {44,22,66,11};
		printArray(myArray);
		
		printArray(new int[] {33,44,5,7});
		
		int []mynums = new int[] {3,4,5,6,7,8,9,42,67,23};
		printArray(mynums);
		
		int []one = {10,2,3};
		int two [] = {3,1};
		print2Arrays(one,two);
		
		print2ArrayV2(one,two);
	}
	public static void printArray(int [] nums) {
		for(int n : nums) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
	public static void print2Arrays(int [] arrnum, int[]arrnumm) {
		if(arrnum.length > arrnumm.length) {
			System.out.println(Arrays.toString(arrnum));
			System.out.println(Arrays.toString(arrnumm));
		}else {
			System.out.println(Arrays.toString(arrnumm));
			System.out.println(Arrays.toString(arrnum));
		}
	}
	public static void print2ArrayV2(int []arrNum, int []arrNum2) {
		if(arrNum.length > arrNum2.length) {
			printArray(arrNum);
			printArray(arrNum2);
		}else {
			printArray(arrNum2);
			printArray(arrNum);
		}
	}
}
