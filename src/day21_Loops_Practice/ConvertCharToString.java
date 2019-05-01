package day21_Loops_Practice;

public class ConvertCharToString {
	public static void main(String[]args) {
		//following ways can be used to convert char to string
		char ch = 'a';
		String str = ""+ch;
		System.out.println(str);
		
		char ch2 = 'v';
		String str2 = new String(""+ch2);
		String str3 = Character.toString(ch2);
		
		System.out.println(str2);
		System.out.println(str3);
	}

}
