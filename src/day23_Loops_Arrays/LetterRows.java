package day23_Loops_Arrays;

public class LetterRows {
	public static void main(String[]args) {
		for(int i = 0; i < 5; i++) {
			//outer loop will repeat letter printing
		
			//write loop that'll print letters a - z
			
				for(char l = 'a'; l <= 'z'; l++) {
					System.out.print(l);
				
				}
				
			System.out.println();
			System.out.println("******************************");
		}
		//TRIANGLE
		for(int j = 1; j<=10;j++) {
			//inner loop
			for(int i = 1; i <= j; i++)
				System.out.print (i+" ");
		}
		System.out.println();
	}
}
