package day04_Primitives_Operators;

public class UsingVariables {
	public static void main(String[] args) {
		//declare int variables num1, num2, num3
		int num1, num2, num3;
		num1 = 100;
		num2 = num1;
		System.out.println(num1);
		System.out.println(num2);
		
		num2 = 200;
		num1 = num2;
		num3 = num1;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		//declare apples and assign 25
		int apples = 25;
		
		//declare kiwi and AAIGN VALUE OF APPLES
		int kiwis = apples;
		//declare mangos and 55
		int mangos = 55;
		//declare mangoes to kiwi
		kiwis = mangos;
				
		System.out.println(apples);
		System.out.println(kiwis);
		System.out.println(mangos);
	}

}
