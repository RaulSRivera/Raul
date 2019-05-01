package day26_Arrays04;

import java.util.Arrays;

public class Split {
	public static void main (String[]args) {
		String words = "java,kava,html,selenium";
		// words.split(",");
		String[] arrayWords = words.split(",");
		System.out.println("Count: "+arrayWords.length);
		System.out.println(arrayWords[0]);
		
		System.out.println(Arrays.toString(arrayWords));
		
		for(String word : arrayWords) {
			System.out.println(word);
		}
		String diceResult = "1 - 20 of 1461 positions";
		//using split method, print 1,461
		String[] splitResult = diceResult.split(" ");
		System.out.println(splitResult.length);
		System.out.println("Search result total: "+splitResult[4]);
		
		String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
		String [] allWords = sentence.split(" ");
		String [] happySplit = sentence.split("happy");
		String [] ISplit = sentence.split("I");
		
		for(String w : allWords) {
			System.out.println(w);
		}
		System.out.println("AFTER HAPPY SPLIT");
		for(String w : happySplit) {
			System.out.println(w);
		}
		String word = "java";
		char [] charsArray = word.toCharArray();
		
		for(char ch : charsArray) {
			System.out.println(ch);
		}
	}

}
