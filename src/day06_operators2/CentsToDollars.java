package day06_operators2;

public class CentsToDollars {
	public static void main(String[] args) {
		//declare int variables to minutes
		
		int minutes = 120;
		int hours = minutes / 60;
		int remainingMinutes = minutes % 60;
		System.out.println(hours);
		System.out.println(remainingMinutes);
		//"5 hours and 10 minutes"
		System.out.println(hours + " hours and "+remainingMinutes+" minutes");
		
		int cents = 300;
		int dollars = cents / 100;
		int remainingCents = cents % 100;
		System.out.println(dollars +" dollars and "+remainingCents+ " cents");
	}

}
