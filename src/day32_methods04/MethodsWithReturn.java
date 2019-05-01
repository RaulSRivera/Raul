package day32_methods04;

public class MethodsWithReturn {
	public static void main(String[]args) {
		System.out.println( give10money() );
		int i = give10money();
		System.out.println("i: "+i);

		System.out.println(name());
		String myname = name();
		System.out.println("My name is "+myname);
	}
	public static int give10money() {
		System.out.println("returning 10 from method");
		return 10;
	}
	public static String name () {
		String name = "Raul";
		return "Raul";
	}
}
