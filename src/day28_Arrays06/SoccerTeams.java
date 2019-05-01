package day28_Arrays06;

import java.util.Arrays;

public class SoccerTeams {
	public static void main(String[]args) {
		String [][] teams = new String[2][6]; 
		teams[0][0] = "Irina";
		teams[0][1] = "Zarif";
		teams[0][2] = "Cihan";
		teams[0][3]	= "Habib";
		teams[0][4]	= "Adel";
		teams[0][5] = "Bojan";	
		//{"Irina","Zarif","Cihan","Habib","Adel","Bojan"};
		teams[1][0] = "Olimjon";
		teams[1][1] = "Mirshod";
		teams[1][2] = "Usman";
		teams[1][3] = "Nursultan";
		teams[1][4] = "Roman";
		teams[1][5] = "Dmitriy";
		
		System.out.println("First player of first team:");
		System.out.println(teams[0][0]);
		System.out.println(teams[0][3]);
		System.out.println(teams[1][5]);
		
		//print how many rows/teams/arrays
		System.out.println("Number of rows: "+teams.length);
		System.out.println("People of in first team: "+teams[0].length);
		System.out.println("People in second team: "+teams[1].length);
		System.out.println(Arrays.deepToString(teams));
		
		int []nums[] = new int[3][4];
		nums[0][0] = 100;
		nums[0][1] = 500;
		nums[0][2] = 1234;
		nums[0][3] = 5434;
		nums[1][0] = 256;
		nums[1][1] = 645;
		nums[1][2] = 257;
		nums[1][3] = 999;
		nums[2][0] = 1256;
		nums[2][1] = 164;
		nums[2][2] = 125;
		nums[2][3] = 199;
		System.out.println(Arrays.deepToString(nums));
		System.out.println(Arrays.toString(nums[0]));
		
		int[]scores[] = { {3,4,5} , {6,4,2,10} };
		System.out.println("Days played / Number of arrays: "+scores.length);
		System.out.println("Numbers of values in 1: "+scores[0].length);
		System.out.println("Numbers of values in 2: "+scores[1].length);
	}
}