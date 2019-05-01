package day18_while_dowhileloop;

public class Alphabet {
	public static void main(String[] args) {
		char letter = 'a';
		while (letter <= 'z') {	
			System.out.print(letter+", ");
			letter++;
		}
		char capitals = 'A';
		while(capitals <= 'Z') {
			System.out.print(capitals+", ");
			capitals++;
		}
		//print lowercase in reverse
		char reverse = 'z';
		while (reverse >= 'a') {
			System.out.print(reverse+", ");
			reverse--;
		}
		char slope = 'A';
		String slide = "";
		while (slope <= 'Z') {
			slide = slide + 'A';
			System.out.println(slide);
			slope++;
		}
	}
}
