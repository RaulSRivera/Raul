package day08_casting_conditionals;

public class ImplicitCasting {
	public static void main(String[] args) {
		//automatically casting from smaller to larger type
		short shortValue = 3455;
		int intValue = (int)shortValue;
		//int intvalue = shortvalue
		System.out.println("int value: " +intValue);
		double price = 345;
		System.out.print("Price after casting: " +price);
		int price1 = 34563;
		double dPrice = price1;
		System.out.println("dPrice after casting: " +dPrice);
	}

}
