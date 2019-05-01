package day16_string_manipulation;

public class GetNumberFromString {
	public static void main(String[] args) {
		String sentence = "I wrote [800] lines of code today";
		int start = sentence.indexOf('[')+1;
		int end = sentence.indexOf(']');
		
		String codeCount = sentence.substring(start, end);
		System.out.println("Lines of code: " +codeCount);
		System.out.println("Lines of code: " +sentence.substring(sentence.indexOf('[')+1, sentence.indexOf(']')));
		//or
		//String number = sentence.substring(7, 12);
		//System.out.println(number);
		
		//check if codeCount is more than 20
		int count = Integer.parseInt(codeCount);
		if(count >20) {
			System.out.println("Wrote more than 20 lines of code today");
		}else {
			System.out.println("coding isnt fu");
		}
	}

}