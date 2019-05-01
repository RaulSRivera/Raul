package day29_MultiDimensionalArray;

public class Student {
	public static void main(String[]args) {
		study();
		study();
		study();
		sayhello();
		code();
		code();
	}
	public static void study() {
		System.out.println("Student is studying");
	}
	//create a method with name sayhello. that prints "Hello friends"
	public static void sayhello() {
		System.out.println("Hello friends");
		System.out.println("How are you today?");
	}
	//create method with name code
	//"inside code method"  "student is coding java"
	public static void code() {
		System.out.println("Inside code method");
		System.out.println("Student is coding Java");
	}
}
