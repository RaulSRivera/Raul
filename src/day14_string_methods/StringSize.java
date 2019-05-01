package day14_string_methods;

public class StringSize {
	public static void main(String [] args) {
		String str1 = "Good Morning";
		//check if it matches "Good Morning" and print match or not
		if(str1.equals("Good Morning")) {
			System.out.println("Match");
		}else {
			System.out.print("Not Match");
		}
		if(str1.equalsIgnoreCase("good morning")) {
			System.out.println("Match - ignore case");
		}else {
			System.out.println("Not Match - ignore case");
		}
		//convert all to uppercaase and print
		System.out.println(str1.toUpperCase());
		System.out.println(str1);
		str1 = str1.toUpperCase();
		System.out.println("After assignment: "+str1);
		//combine the above methods together:
		//convert to all lowercase first then check if it equals("good morning")
		if(str1.toLowerCase().equals("good morning")) {
			System.out.println("Chained methods: match");
		}else {
			System.out.println("Chained methods: do not match");
		}
		//find out how many characters in the string
		String myName = "Raul";
		System.out.println(myName.length());
		
		int length = myName.length();
		System.out.println("My name's length: "+length);
		//usernames must be exactly 8 characters
		String userName = "GigioRivera";
		if(userName.length() == 8) {
			System.out.println("Valid Username");
		}else {
			System.out.println("InValid uername, must be 8 chars");
		}
		//password 6 chars
		String password = "July05";
		if (password.length() >= 6) {
			System.out.println("Password is good");
		}else {
			System.out.println("Password is too short");
		}
		int passwordLength = password.length();
		if (passwordLength < 6 ) {
			System.out.println("InValid password, too short");
		}else {
			System.out.println("Valid Password, good job");
		}
		
		
		
	}

}
