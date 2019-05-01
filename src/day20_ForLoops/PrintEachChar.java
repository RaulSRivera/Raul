package day20_ForLoops;

public class PrintEachChar {
	public static void min(String[]args) {
		String word = "Wooden Spoon";
		//using for loop, print each char one by one
		for (char w = 0; w <= word.length(); w++) {
			System.out.println(word.charAt(w));
		}
		//using for loop, print vowels only
		for (char v = 0; v < word.length(); v++) {
			char letter = word.toLowerCase().charAt(v);
			if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
			System.out.println(letter+", ");
		}
		//using for loop, print only consonants
		for (char c = 0; c < word.length(); c++) {
			//char letter = word.toLowerCase().charAt(c);
			if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
			System.out.println(letter+", ");
		}
	}
}
}
}