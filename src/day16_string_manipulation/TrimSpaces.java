package day16_string_manipulation;

public class TrimSpaces {
	public static void main(String[] args) {
		String word1 = " String Methods ";
		System.out.println(word1.trim());
		System.out.println(word1);
		
		String word2 = ".   Three Spaces here ";
		System.out.println(word2.trim());
		word2 = word2.trim();
		System.out.println(word2);
	}

}
