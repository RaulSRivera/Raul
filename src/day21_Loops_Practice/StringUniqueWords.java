package day21_Loops_Practice;
public class StringUniqueWords {
	public static void main(String[]args) {
		String word = "wooden spoon";
		String unique = "";
		
		char ch = word.charAt(0);
		System.out.println(unique.contains(""+ch));
		if(!unique.contains(""+ch)) {
			unique = unique + ch;
		}
		System.out.println("Unique:"+unique);
		
		
		String word2 = "bananas";
		String unique2 = "";
		int i = 0;
		char ch2 = word2.charAt(i);
		System.out.println("Ch2:" +ch2);
		i = 1;
		ch2 = word2.charAt(i);
		System.out.println("Ch2:" +ch2);
		i++;
		ch2 = word2.charAt(i);
		System.out.println("Ch2:" +ch2);
		
	}
}