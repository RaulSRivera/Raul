package day28_Arrays06;

import java.util.Arrays;

public class ReverseSentence {
	public static void main(String[]args) {
		String sent = "String a sentence in reverse";
		//reverse sentence and assign new string called reversed, print reverse
		String [] sentArr = sent.split(" ");
		System.out.println("Number of words: "+sentArr.length);
		System.out.println(Arrays.toString(sentArr));
		String reversed = "";
		for (int i = sentArr.length -1; i >= 0; i--) {
			//System.out.println(sentArr[i]); reverse
			reversed += sentArr[i]+" ";
			//System.out.println(reversed); pyramid
		}
		reversed = reversed.trim();
		System.out.println(reversed);
	}
}