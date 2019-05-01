package day15_string_manipulation;

public class Contains {
	public static void main(String[] args) {
		String email = "test@gmail.com";
		System.out.println(email.contains("@"));
		
		String list = "apples, eggs, milk, bread, cereal";
		if (list.contains("apples")) {
			System.out.println("Apples are there!");
		}else {
			System.out.print("Lets add apples!");
		}
		boolean hasEggs = list.contains("eggs");
		System.out.println("Contains eggs: "+hasEggs);
		boolean hasDonut = list.contains("donut");
		System.out.print("Contains donuts: "+hasDonut);
		
		if (email.contains("gmail")) {
			System.out.print("It is a gmail account");
		}else if (email.contains("yahoo")) {
			System.out.print("It is a yahoo account");
		}else if(email.contains("hotmail")) {
			System.out.print("it is a hotmail account");
		}
		String etsyTitle = "Wooden spoon | Etsy";
		if (etsyTitle.contains(" | ")){
			System.out.println("Pipe is there as expexted");
		}else {
			System.out.println("Pipe is not detected");
		}
		//assign name and check if contains "a" or "e"
		String name = "Raul";
		if (name.contains("a") || name.contains("e")){
			System.out.print("'a' or 'e' are present");
		}else {
			System.out.println("'a' or 'e' are present");
		}
		
		
	}

}
