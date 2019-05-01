package day15_string_manipulation;

public class StartsEndsWith {
	public static void main(String[] args) {
		String word1 = "eclipse";
		//startsWith ==> tests if string starts with another
		System.out.println(word1.startsWith("e")); //true
		System.out.println(word1.startsWith("ec")); //true
		System.out.println(word1.startsWith("eclip")); //true
		System.out.println(word1.endsWith("e")); //true 
		System.out.println(word1.endsWith("ipse")); //true
		System.out.println(word1.toUpperCase().endsWith("PSE")); //true
		
		String name = "Mr. Jackson";
		if (name.startsWith("Mr.")) {
			System.out.println("ma");
		}else if(name.startsWith("Mrs.")) {
			System.out.println("married woman");
		}else if(name.startsWith("Ms.")) {
			System.out.println("single woman");
		}else if(name.startsWith("Dr.")) {
			System.out.println("Doctor man or woman");
		
		}
	}
}