package day27_Arrays05;
public class CanvasCourses {
	public static void main(String[]args) {
		String url = "http://learn.cybertekschool.com/courses/149";
		String[] urlArray = url.split("/");
		
		System.out.println("Length:" +urlArray.length);
		//get last number and convert to int data type
		System.out.println(urlArray[urlArray.length - 1]);
		int courseID = Integer.parseInt(urlArray[4]);
		switch(courseID) {
				case 143:
					System.out.println("Welcome Kit!");
					break;
				case 144:
					System.out.println("Team Activity");
					break;
				case 149:
					System.out.println("SDLC");
					break;
				case 147:
					System.out.println("JAVA Programing");
					break;
				case 152:
					System.out.println("QA Testing");
					break;
				case 204:
					System.out.println("VA Mentoring");
					break;
				default:
					System.out.println("Invalid Last IDX");
					break;
					
		}
	}
}