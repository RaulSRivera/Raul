package day23_Loops_Arrays;

public class PrintWord {
	public static void main(String[]args) {
		String str = "java";
		for(int w = 0; w < str.length(); w++) {
			if(str.substring(w,w+1).equals("a")) {
				//if condition is true, go back to update statements
				continue;
			}
			System.out.println(str.substring(w,w+1));
			}
	}

}
