package day18_while_dowhileloop;

public class StairCase {
	public static void main(String[] args) {
		String stairs = "*";
		System.out.println(stairs);
		stairs = stairs + "*";
		System.out.println(stairs);
		stairs += "*";
		System.out.println(stairs);
		stairs += "*";
		System.out.println(stairs);
		stairs += "*";
		System.out.println(stairs);
		stairs += "*";
		System.out.println(stairs);
		stairs += "*";
		System.out.println(stairs);
		}
	//with a counter
		String stairs = "*";
		int num = 1;
		while (num <= 10) {
			System.out.println(stairs);
			stairs += "*";
			num++;
		}
		//checking length()
		stairs = "*";
		while(stairs.length() <= 10) {
			System.out.println(stairs);
			stairs += "*";
		}
	}
}
