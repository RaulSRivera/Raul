package day09_StringEquals_conditionals;

public class IfElseNoBraces {
	public static void main(String[] args) {
		String day = "Tuesday";
		
		if(day.equals("Tuesday"))
			System.out.println("Today is tuesday");	
		else
			System.out.println("Today is not Tuesday");
		//w/o braces, if else statement only reads the single line
			System.out.println("Tuesday is not today");
		
	}
}

