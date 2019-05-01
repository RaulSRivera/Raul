package day13_ternary_strings_intro;

public class Ternary{
	public static void main (String[] args) {
		String result;
		int score = 58;
		if (score > 60) {
			result = "pass";
		
		}else {
			result = "fail";
		}
		// these ^ v equal each other. THE SAME OPPORATION.
		result = score > 60 ? "pass" : "fail";
		System.out.println("Result is " +result);
		
		
	}

}
