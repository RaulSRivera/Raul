package day23_Loops_Arrays;

public class LoopThrough {
	public static void main(String[]args) {
		for(int n = 0; n <= 50; n++) {
			if(n % 5 == 0){
				
				continue;
			}
			if(n % 20 == 0) {
				
				break;
			}
		System.out.print(n+", ");
		}
	}
}
