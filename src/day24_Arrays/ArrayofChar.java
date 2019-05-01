package day24_Arrays;

public class ArrayofChar {
	public static void main(String[]args) {
		char[] values = {'a', 'b', 'c'};
		for(char value: values) {
			System.out.println(value);
		
	}
	String str = "WoodenSpoon";
	char[]chars = str.toCharArray();
	for(char c:chars) {
		System.out.print(c);
	}
	System.out.println();
	str = "";
	for(int i = chars.length-1; i>= 0; i--) {
		str+=chars[i];
	}
	System.out.println(str);
	System.out.println();
	for(char L:chars) {
		if(L == 'o') {
			System.out.print("*");
		}else {
			System.out.print(L);
	}
		System.out.println();
		char[] newChars = new char[3];
		System.out.println("Value of char: "+newChars);
		System.out.println(newChars[0]+0);
}
}
}