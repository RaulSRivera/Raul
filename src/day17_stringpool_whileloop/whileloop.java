package day17_stringpool_whileloop;

public class whileloop {
	public static void main(String[]args) {
		int n1 = 100;
		int n2 = 200;
		while (n2 > n1) { //true, will print to infinity (INFINITE LOOP)
			System.out.println("N2 IS GREATER");
		}
		System.out.println("END");
		
		//exercise 1 ^ | exercise 2 v
		
		int n3 = 100;
		int n4 = 200;
		while (n4 > n3) {
			System.out.println("N2 IS GREATER");
			n3 = n3 + 40;
		}
		System.out.println("END");
	}

}
