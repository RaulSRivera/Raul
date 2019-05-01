package day20_ForLoops;
public class WeekDays {
	public static void main(String[]args) {
		//for loop: 1-7 1=monday 2=tues
		int days;
		for(days = 1; days <= 7; days++) {
			switch(days) {
				case 1:
					System.out.println(days+" - Monday");
					break;
				case 2:
					System.out.println(days+" - Tuesday");
					break;
				case 3:
					System.out.println(days+" - Wednesday");
					break;
				case 4:
					System.out.println(days+" - Thursday");
					break;
				case 5:
					System.out.println(days+" - Friday");
					break;
				case 6:
					System.out.println(days+" - Saturday");
					break;
				case 7:
					System.out.println(days+" - Sunday");
					break;
			}
		}
	}
}