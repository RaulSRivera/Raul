package day21_Loops_Practice;
import java.util.*;
public class GetUniqueUsingSubstring {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word");
		
		String word = scan.next();
		
		for(int o = 0; o <= word.length(); o++) {
			System.out.println(word.substring(o));//0
		
			}
		word = Character.toString(word.charAt(0));
		System.out.println(word);
		}	
	}
