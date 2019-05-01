package day13_ternary_strings_intro;

public class MoreTernary {
	private static final String True = null;
	private static final String False = null;

	public static void main(String[] args) {
		String quality = "Good";
		int rating = (quality.contentEquals("Good")) ? 100 : 0;
		
		System.out.println("Rating: "+rating);
		
		int PMHour = 5;
		//rush hour during evening: 4-7
		boolean rushHour = (PMHour >= 4 && PMHour <= 7) ? true : false;
		System.out.println(PMHour + " is Rush Hour? " +rushHour);
		String result = rushHour==true ? "yes" : "no";
		System.out.println(PMHour + " is Rush Hour? " +result);
		
		
		int AMHour = 8; //6-9
		String amRushHour = (AMHour >= 6 && AMHour <= 9) ? "Yes" : "No"; 
		System.out.println(AMHour + " is rush hour? - " + amRushHour);
	}

}
