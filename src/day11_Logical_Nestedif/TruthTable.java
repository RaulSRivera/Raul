package day11_Logical_Nestedif;

public class TruthTable {
	public static void main(String[] args) {
		System.out.println("### TRUTH TABLE FOR && OPERATOR ###");
		System.out.println("When true && true - result is " + (true && true));
		System.out.println("When true && false - result is " + (true && false));
		System.out.println("When false && true - result is " + (false && true));
		System.out.println("When false && false - result is " + (false && false));
		System.out.println(); //add empty line
		System.out.println("### TRUTH TABLE FOR || OPERATOR ###");
		System.out.println("When true || true - result is " + (true || true));
		System.out.println("When true || false - result is " + (true || false));
		System.out.println("When false || true - result is " + (false || true));
		System.out.println("When false || false - result is " + (false || false));
		System.out.println(); //empty line
		System.out.println("### TRUTH TABLE FOR ! OPERATOR ###");
		System.out.println("When !true - result is " + (!true));
		System.out.println("When !false - result is " + (!false));
		
	}

}
