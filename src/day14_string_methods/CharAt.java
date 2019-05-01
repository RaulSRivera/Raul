package day14_string_methods;

public class CharAt {
	public static void main(String[] args) {
		String word = "Computer";
		System.out.println(word.length());
		//print all characters one by one
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		//System.out.println(word.charAt(9));
		String word2 = "Java";
		if(word2.charAt(0) == 'J') {
			System.out.println("J is first char");
		}else {
			System.out.print("J is not first char");
		}
		String word3 = "break";
		char first = word3.charAt(0);
		char last = word3.charAt(4);
		if (first == last) {
			System.out.println("First and last char match");
		}else {
			System.out.println("First and last do not match");
		}
		//string word4 => always print last char, no matter length
		String word4 = "abcde";
		char lastChar = word4.charAt(word4.length() -1); //5chars - 1 = 4th char / 0a 1b 2c 3d 4e = E
		System.out.print("Last Value of "+word4+ " is "+lastChar);
	}

}
