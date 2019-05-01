package day35_ReviewDay_methods;

public class Encrypting {
	public static void main(String[]args) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		String word = "easter";
		String word2 = "tesla";
		String word3 = "civic";
		//get a char from word
		//find indexOf char in alphabet
		//read the char from encrypted at the index
		//add some string
		char first = word.charAt(0); //'e'
		int position = alphabet.indexOf(first);
		System.out.println("position: "+position);
		char enChar = encrypted.charAt(position);
		System.out.println(first+" --> "+enChar);
		
		//with loop
		String encryptedWord = "";
		for(int i =0; i < word.length();i++) {
			char ch = word.charAt(i);
			//find in alphabet
			int index = alphabet.indexOf(ch);
			System.out.print(encrypted.charAt(index));
		}
		System.out.println();
		for(int i =0; i < word2.length();i++) {
			char ch = word2.charAt(i);
			int index = alphabet.indexOf(ch);
			System.out.print(encrypted.charAt(index));
		}
		System.out.println();
		for(int i =0; i < word3.length();i++) {
			char ch = word3.charAt(i);
			int index = alphabet.indexOf(ch);
			System.out.print(encrypted.charAt(index));
		}
	}
}
