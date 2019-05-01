package day31_methods03;

import java.util.Arrays;

public class MethodWithStrings {
	public static void main(String[]args) {
		CountWords("Java is fun");
		googleSearchResults("About 121,000,000 results (0.75 seconds)");
	}
	public static void CountWords(String sentence) {
		String [] words = sentence.split(" ");
		System.out.println("Words in this sentence"+Arrays.deepToString(words));
		System.out.println("Number of words: "+words.length);
	}
	public static void googleSearchResults(String searchresult) {
		String [] words = searchresult.split(" ");
		String count = words[1].replace(",", "");
		String seconds = words[3].replace("(", "");
		System.out.println("Result count: "+count);
		System.out.print("Time in seconds "+seconds);
	}

}
