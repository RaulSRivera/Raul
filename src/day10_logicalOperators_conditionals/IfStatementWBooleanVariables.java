package day10_logicalOperators_conditionals;

public class IfStatementWBooleanVariables {
	public static void main(String[] args) {
		boolean isBreakTime = true;
		if(isBreakTime == true) {
			System.out.println("Break until...");
		}else {
			System.out.println("Study Java");
		}
		//second version
		if(isBreakTime) {
			System.out.println("Break until...");
		}else {
			System.out.println("Study Java");
	}
		boolean classTime = true;
		if(classTime==true) {
			System.out.println("Return to class");
			System.out.println("Pay Attention");
			System.out.println("Code");
		}else {
			System.out.println("drink and sleep");
		}
		boolean qualified = false;
		//send notif message if not qualified
		if (qualified == false) {
			System.out.println("Your application was not approved.");
		}

}
}