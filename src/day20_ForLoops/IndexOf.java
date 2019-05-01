package day20_ForLoops;

public class IndexOf {
	public static void main(String[]args) {
		String word = "amazing";
		char letter = 'n';
		int index = -1;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == letter) {
				index = i;
				break;
				
			}
		}
		System.out.println("Index: " + index);
	}

}
