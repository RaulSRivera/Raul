package day18_while_dowhileloop;

public class Counter {
	public static void main(String[]args) {
		//1,2,3,4,5,6,7,8,9,10
		int num = 1;
		while (num <= 10) {
			System.out.print(num+", ");
			num++;
//			Thread.sleep(1000); //pause code execution
		}
		System.out.println("Num value after loop: "+num);
		
		//11,10,9,8,7,6,5,4,3,2,1
		int num2 = 11;
		while(num2 >= 1) {
			System.out.print(num2+", ");
			num2--;
		}
		System.out.println("Num2: "+num2);
	}

}
