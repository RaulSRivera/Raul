package day12_Calculator_Version;

public class ORLogicWithSwitch {
	public static void main(String[] args) {
		char grade = 'B';
		//a, b, c -> Pass    d, e, -> fail    invalid grade
		switch(grade) {
		case 'A':
		case 'B':
		case 'C':
			System.out.println("Pass");
			break;
		case 'D':
		case 'E':
			System.out.println("Fail");
			break;
		default:
			System.out.println("Invalid grade");
		}
	}

}
