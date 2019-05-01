package day16_string_manipulation;

public class Concat {
	public static void main(String[] args) {
		String word = "java";
		System.out.println(word.concat(" in eclipse"));
		System.out.println(word);
		
		//word = word.concat(123); //will not work
		word = word + 123;
		System.out.print(word);
		
		String word2 = "hi";
		word2 = word2.concat("-hey").concat("-how are you").concat("-good");
		System.out.println(word2);
	}

}
