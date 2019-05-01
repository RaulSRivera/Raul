package day04_Primitives_Operators;

public class AgeCalculator {
	static void main(String[] args) {
		//declare variable yearOfBirth and assign some year
		//declare variable currentYear and assign 2019
		//declare variable age and calculate the age and
		//assign result to it
		//print: if you are born in year
		//then you are x years old
		int yearOfBirth = 1994;
		int currentYear = 2019;
		int age = currentYear - yearOfBirth;
		System.out.println("If you are born in " +yearOfBirth);
		System.out.println("and the current year is " +currentYear); 
		System.out.println(" , then you are age" +age);
		
	}
}