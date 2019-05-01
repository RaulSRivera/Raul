package day16_string_manipulation;

public class CapitolCity {
	public static void main(String[] args) {
		String str = "Moscow is the capital of Russia";
		//Baku, Azerbaijan
		str = str.replace("Moscow", "Baku").replace("Russia", "Azerbaijan");
		System.out.println(str);
		
		String email = "raulrivera@gmail.com";
		String company = "nowhere";
		String newEmail = email.replace("gmail", company);
		System.out.println(newEmail);
	}

}
