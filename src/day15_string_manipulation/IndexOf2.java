package day15_string_manipulation;

public class IndexOf2 {
	public static void main(String[]args) {
		String list = "html-selenium-angular-jenkins-grid";
		
		int firstDash = list.indexOf("-");
		System.out.println("First dash:"+firstDash);
		
		int secondDash = list.indexOf("-", 5);
		System.out.println("second dash:"+secondDash);
		
		int thirdDash = list.indexOf("-", secondDash + 1);
		System.out.println("third dash:"+thirdDash);
		
		int lastDash = list.lastIndexOf("-");
		System.out.println("Last Dash: "+lastDash);
	}

}
