package day18_while_dowhileloop;

public class Students {
	public static void main(String[]args) {
		int numberofStudents = 1;
		//using loop, iterate until we have 10 students in room
		while (numberofStudents < 11) {
			System.out.println("Student " +numberofStudents);
			numberofStudents++;
		}
		System.out.println("No more space");
	}

}
