package day06_operators2;

public class IncrementDecrement {
	public static void main(String[] args) {
		int employees = 50;
		System.out.println("Employees: " + employees);
		employees++; //add1
		System.out.println("Employees: " + employees);
		employees++; //add/increment 1
		System.out.println("Employees: " + employees);
		employees += 1;
		employees = employees + 1;
		System.out.println("Employees: " + employees);
		
		employees--;
		System.out.println("Employees: " + employees);
		--employees;
		System.out.println("Employees: " + employees);
		//auto increment - auto decrement operators: when you want your variable to increase/decrease by 1
	}

}
