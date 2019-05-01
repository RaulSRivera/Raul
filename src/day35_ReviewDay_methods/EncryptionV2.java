package day35_ReviewDay_methods;

public class EncryptionV2 {
	public static void main(String[]args) {
		
		System.out.println(encryptChar('z'));
		System.out.println(encryptChar('m'));
		
		String normal = "sunday";
		String encrypted = encryptWord(normal);
		System.out.println("normal: "+normal+"/n"+"encrypted: "+encrypted);
		
		System.out.println(encryptSentence("java is fun"));
	}
	public static char encryptChar(char ch) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		//return encrypted.charAt( alphabet.indexOf(ch) );
		int i = alphabet.indexOf(ch);
		char ret = encrypted.charAt(i);
		return ret;
	}
	public static String encryptWord(String word) {
		String cyphered = "";
		for (int i = 0; i < word.length(); i++) {
			cyphered += encryptChar(word.charAt(i));
		}
		return cyphered;		
	}
	//encryptSentence
	public static String encryptSentence(String sentence) {
		String [] wordsArr = sentence.split(" ");
		String retValue = "";
		for(String word : wordsArr) {
			retValue += encryptWord(word)+" ";
		}
		return retValue.trim();
	}
}