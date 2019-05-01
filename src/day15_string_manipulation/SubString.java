package day15_string_manipulation;

public class SubString {
	public static void main(String[] args) {
		String sente = "Java String manipulation is fun!";
		System.out.println(sente.substring(0,4));
		//print string
		System.out.println(sente.substring(5,11));
		System.out.println(sente.substring(7,11));
		System.out.println(sente.substring(10,5)); //error
		System.out.println(sente.substring(10,50)); //error
	}

}
