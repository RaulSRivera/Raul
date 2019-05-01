package day35_ReviewDay_methods;

public class Decrypt {
	public static void main(String[]args) {
		System.out.println(decryptSentence("ovgh tl slnv"));
		System.out.println(decryptWord("zxsll"));
		System.out.println(decryptSentence("glwzb xozhh rh ufm"));
		System.out.println(decryptSentence("gszmp blf nfilwro"));
	}
	public static char decryptChar(char ch) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		int i = encrypted.indexOf(ch);
		char ret = alphabet.charAt(i);
		return ret;
	}
	public static String decryptWord(String word) {
		String converted = "";
		for (int i = 0; i < word.length(); i++) {
			converted += decryptChar(word.charAt(i));
		}
		return converted;		
	}
	//encryptSentence
	public static String decryptSentence(String sentence) {
		String [] wordsArr = sentence.split(" ");
		String retValue = "";
		for(String word : wordsArr) {
			retValue += decryptWord(word)+" ";
		}
		return retValue.trim();
	}
}
