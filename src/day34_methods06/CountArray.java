package day34_methods06;

public class CountArray {
	public static void main(String[]args) {
		int[] nums = {2,2,2,2,5,5,7,7,8,8,9};
		//1. with system print return 
		System.out.println(findOccurences(nums, 5));
		System.out.println(findOccurences(nums, 2));
		//2. assign return value into a variable
		int five = findOccurences(nums, 5);
		System.out.println("5 values: "+five);
		if(five >0) {
			System.out.println("We have 5s");
		}else {
			System.out.println("No 5s");
		}
		if (findOccurences(nums,2)>0) {
			System.out.println("We have 2s");
		}else {
			System.out.println("No 2s");
		}
		//create array and pass method
		int twenty = findOccurences(new int[] {1,20,20,30,44,50,55}, 20);
		System.out.println("twenty: "+twenty);
	}
	public static int findOccurences(int []array,int value) {
		int counter = 0;
		for (int num : array) {
			if(num == value) {
				counter++;
			}
		}
		return counter;
	}
	//build array,assign value, return it
	public static int[] getArray() {
		int [] rArray = {1,3,2,54,69,42,10};
		return rArray;
	}
	public static int[] getRandomArray(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
