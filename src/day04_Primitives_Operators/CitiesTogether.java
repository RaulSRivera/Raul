package day04_Primitives_Operators;

public class CitiesTogether {
	public static void main(String[] args) {
		//city 1, city2, city3
		//assign values: new york city, city walk, seaty
		//print: from nyc to citywalk is 500$, from seaty to nyc is 550$, i have been to all 3
		String city1 = "NYC";
		String city2 = "CityWalk";
		String city3 = "SeatyCity";
		System.out.println("From " +city1+ " to " +city2+ " is $500");
		System.out.println("From " +city3+ " to " +city1+ " is $550");
		System.out.println("I have been to " +city1+ ", " +city3+ ", and " +city2+ ".");
		
		String app = "Slack";
		//we use slack for messaging with classmates
		System.out.println("We use " +app+ " for messaging with classmates.");
		app = "Skype" + " and Slack";
		System.out.println("We use " +app+ " to message our classmates.");
		
		
	}
}