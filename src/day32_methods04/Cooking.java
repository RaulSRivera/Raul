package day32_methods04;

public class Cooking {
	public static void main (String []args) {
		makePancakes();
		makePasta();
		cook("Omelette", "Eggs, Salt, Tomatoes, Green Peppers, Onions");
	}
	public static void makePasta() {
		System.out.println("~~Italian Pasta Recipe~~");
		add("Water, Salt, Olive Oil");
		boil(2);
		add("Spaghetti Pasta");
		boil(9);
		mix(60);
		add("Parmesan cheese, Marinara");
		System.out.println("Pasta ready");
	}
	public static void makePancakes() {
		System.out.println("~~Pancakes Recipe~~");
		add("milk, eggs, flour, sugar, salt");
		mix(120);
		fry(3);
		System.out.println("Enjoy your pancakes");
	}
	public static void cook(String dish, String ingredients) {
		System.out.println("~~"+dish.toUpperCase()+" Recipe~~");
		add(ingredients);
		System.out.println("Cook until prepared");
		System.out.println("~~"+dish.toUpperCase()+" is ready~~");
	}
	public static void add(String ing) {
		System.out.println("Add "+ing);
	}
	public static void mix(int seconds) {
		System.out.println("Mix for "+seconds+" seconds");
	}
	public static void fry(int minutes) {
		System.out.println("Fry for "+minutes+" minutes");
	}
	public static void boil(int minutes) {
		System.out.println("Boil it for "+minutes+" minutes");
	}
}
