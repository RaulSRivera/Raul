package day24_Arrays;

import java.util.Arrays;

public class LotteryTicket {
	public static void main(String[]args) {
		int[] lotteryNumbers = {12,45,3,62,42,90};
		System.out.println(Arrays.toString(lotteryNumbers));
		Arrays.sort(lotteryNumbers);
		System.out.println(Arrays.toString(lotteryNumbers));
		
		int index = Arrays.binarySearch(lotteryNumbers,45);
		System.out.println("Position: "+index);
		int index2 = Arrays.binarySearch(lotteryNumbers, 5);
		System.out.println("Position: "+index2);
		int index3 = Arrays.binarySearch(lotteryNumbers, 69);
		System.out.println("Position: "+index3);
	}

}
