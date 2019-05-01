package day21_Loops_Practice;

public class LookForWordInString {
	public static void main(String[]args) {
		String sentence = "He said HI, then she said HI. Hey hi guys!";
		//print letters (He, e,)in substring
		int count = 0;
		for(int i = 0; i < sentence.length(); i++) {
			String temp = sentence.substring(i,i+2);
			//System.out.println(temp);
			if(temp.equals("hi"));
			count++;
		}
	}

}
