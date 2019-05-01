package day23_Loops_Arrays;

public class PrintNumbersWithLoop {
	public static void main(String[]args) {
		for(int i = 1; i <= 10;i++) {
			System.out.println(i+ " ");
		}
		System.out.println();
		for(int i =1; i <= 10; i++) {
			System.out.println(i+" ");
		}
		for(int j= 1; j<=2;j++) {
			//inner loop
			for(int k = 1; k <= 10; k++) {
				System.out.println(k+" ");
			}
			System.out.println("*********");
		}
	}

}
