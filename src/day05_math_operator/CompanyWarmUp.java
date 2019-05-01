package day05_math_operator;

public class CompanyWarmUp {
	public static void main(String[] args) {
		String companyName = "Facebook";
		String address = "Silicon Valley, CA";
		int numberOfEmployees = 10000;
		long revenue = 4000000L;
		boolean isTechCompany = true;
				
		System.out.println("Company name is " +companyName);
		System.out.println("Address is " +address);
		System.out.println("Number of Employees is " +numberOfEmployees);
		System.out.println("Annual Revenue is " +revenue);
		System.out.println("Is it a Tech Company? " +isTechCompany);
		//print revenue + istechcompany ; will not work
		//print companyName + numberofemployees; 
		String aboutCompany = "Company " +companyName+ " is located in " +address + " and " +numberOfEmployees + " work for it.";
		System.out.println(aboutCompany);
	}
	
}

