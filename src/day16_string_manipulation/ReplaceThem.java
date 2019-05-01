package day16_string_manipulation;

public class ReplaceThem {
	public static void main(String[] args) {
		String sentence = "Coding is a hobby!";
		String withNoSpaces = sentence.replace(" ", "");
		System.out.println(withNoSpaces);
		
		System.out.println(sentence);
		//repalce , with !
		sentence = sentence.replace(" ", "!");
		System.out.println(sentence);
		
		String mixed = "@&##$%*%";
		//clean up mixed
		mixed = mixed.replace("#", "");
		System.out.println(mixed);
		mixed = mixed.replace("%", "");
		System.out.println(mixed);
		mixed = mixed.replace("@$", ""); //will not work bc they're not together
		System.out.println(mixed);
		
		String result = "About 12153 results (0.69 seconds)";
		//get number of results, remove everything else
		result = result.replace("About ", "");
		result = result.substring(0, result.indexOf(" "));
		System.out.println(result);
		
		result = result.replace("5", "");
		System.out.println(result);
		
		result = result.replaceFirst("1", "");
		System.out.println(result);
	}

}
