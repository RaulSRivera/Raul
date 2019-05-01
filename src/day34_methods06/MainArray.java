package day34_methods06;
import java.util.*;
public class MainArray {
	public static void main(String[]args) {
		System.out.println(Arrays.toString(CountArray.getArray()));
		//store return value into array
		int [] nums = CountArray.getArray();
		System.out.println(Arrays.toString(nums));
		
		for(;;) {
			System.out.println(Arrays.toString(CountArray.getRandomArray(20)));
		}
		
	}
	public static int[] getRandomArray(int size) {
		//create array with length of size
		//assign random values from 0-100 and return it
		Random rand = new Random(); //random class object
		int [] nums = new int[size]; // declare array with size number of elems
		for(int i = 0; i < size;i++) {
			nums [i] = rand.nextInt(101);
		}
		return nums;
	}

}
