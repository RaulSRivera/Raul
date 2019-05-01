package day16_string_manipulation;

public class Empty {
	public static void main(String[]args) {
		String username = " ";
		String password = "";
		System.out.println(username.isEmpty());
		
		if (username.isEmpty()) {
			System.out.println("Username field cannot be empty");
		}else {
			System.out.println("Username is not empty");
		}
		if(username.isEmpty()) {
			System.out.println("Username or password cannot be empty");
		}else {
			System.out.println("Username or password is not empty");
		}
		if (username.isEmpty() || password.isEmpty()){
			System.out.println("Username or password is not empty");
		}else {
			System.out.println("Username or password is not found");
		}
	}

}
