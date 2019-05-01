package day25_Arrays03;

public class Population {
	public static void main(String[]args) {
		//assign some values to each city
		
		int [] population = new int [5];
		
		population[0] = 5000;
		population[1] = 10000;
		population[2] = 7000;
		population[4] = 8907;
		population[3] = 4455; //can go either order as long as its assigned
		//population[7]=9000 - does not count it bc not in "new int[]"
		//declaration has to be complete
		//int [] population = {5000,10000,7000,4455,8907};
		System.out.println("City 0 population : "+population[0]);
		System.out.println("City 1 population : "+population[1]);
		System.out.println("City 2 population : "+population[2]);
		System.out.println("City 3 population : "+population[3]);
		System.out.println("City 4 population : "+population[4]);
		//System.out.println("City 5 population : "+population[5]); //"out of bounds"
		
		int idx = 0;
		System.out.println("City 0 population : "+population[idx]);
		
		idx++;
		System.out.println("City 1 population : "+population[idx]);
		
		String str = "abc";
		System.out.println("City STR.LENGTH() population : "+population[str.length()]);
		
		//string array called cities = "miami","london","tokyo","rome","newyork"
		String [] cities = {"Miami","London","Tokyo","Rome","New York"};
		
		System.out.println("Population of "+cities[0]+" is "+population[0]);
		System.out.println("Population of "+cities[1]+" is "+population[1]);
		System.out.println("Population of "+cities[2]+" is "+population[2]);
		System.out.println("Population of "+cities[3]+" is "+population[3]);
		System.out.println("Population of "+cities[4]+" is "+population[4]);
		
		
	}

}
