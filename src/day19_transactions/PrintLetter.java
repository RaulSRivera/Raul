package day19_transactions;

public class PrintLetter {
	public static void main(String[] args) {
		String word = "Amazon";
		//char index = 012345
		//char count = 123456
		//print each character one by one in separate lines
		int idx = 0;
		//System.out.println(word.charAt(idx));
		//idx++;
		//System.out.println(word.charAt(idx));
		//idx++;
		while(idx < word.length()) {
			System.out.println(word.charAt(idx++));
			
		}
		//print each character in reverse order
		int idxx = word.length() -1;
		while (idxx >= 0) {
			System.out.println(word.charAt(idxx));
			idxx--;
		}
		
	}
}
