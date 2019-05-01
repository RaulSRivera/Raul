package day21_Loops_Practice;
import java.util.*;
public class GetUniqueCharacters {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word");
		
		String word = scan.next();
		String unique = "";
		
		for(int i = 0; i < word.length(); i++) {
			//read the letter and assign
			char letter = word.charAt(i);
			System.out.println(letter);
			if(!unique.contains(""+letter)) {
				unique = unique + letter;
			}
//		for(int i2 = 0; i2 < word.length(); i2++) {
//			System.out.print(i2);//print i2, it increases
//			System.out.println(word.charAt(i2));
		}
	}
}
//}