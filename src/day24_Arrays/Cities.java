package day24_Arrays;

public class Cities {
	public static void main(String[]args) {
		String[] cities = {"Washimgton D.C.", "Las Vegas", "LA"};
		System.out.println(cities.length); //3
		for(int i = 0; i < cities.length; i++) {
			if(cities[i].startsWith("L")) {
				System.out.println(cities[i]);
			}
		}
	for(String city: cities) {
		if(city.startsWith("L")) {
			System.out.println(city);
			
		}
	}
	}
}