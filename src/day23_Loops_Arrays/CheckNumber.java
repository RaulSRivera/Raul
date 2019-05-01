package day23_Loops_Arrays;

public class CheckNumber {
	public static void main(String[]args) {
		for (int i = 1; i <= 100; i++) {
			if(i % 2 > 0) { //previously i == 5
				continue; //continues loop by returning back to loop beginning and starting again 
			}
			System.out.println("Number - "+i);
		}
		
		for (int p = 1; p <= 20; p++) {
			if(p >= 5 && p<=10) {
				continue;
			}
			System.out.println(p);
		}
	}
}