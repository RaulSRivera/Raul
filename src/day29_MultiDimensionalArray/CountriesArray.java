package day29_MultiDimensionalArray;
import java.util.Arrays;
public class CountriesArray {
	public static void main(String[]args) {
		String []countriesArray[] = { {"USA","Washington DC"},
								{"Canada","Ottawa"},
								{"Mexico","Mexico City"},
								{"Brasil","Brasilia"},
								{"Peru","Lima"},
								{"Argentina","Boanes Aeros"},
								{"Bolivia","La Paz"},
								{"Macedonia","Scopia"},
								{"Kazakhstan","Nursultan"} };
		String [] c [] = new String[9][2];
		c[0][0] = "USA";
		c[0][1] = "Washington DC";
		
		System.out.println(countriesArray[0][0] +" | "+countriesArray[0][1]);
		System.out.println(countriesArray[1][0] +" | "+countriesArray[1][1]);
		System.out.println(countriesArray[8][0] +" | "+countriesArray[8][1]);
		System.out.println(Arrays.deepToString(countriesArray));
		//for loop
		for(int i = 0; i < countriesArray.length; i++) {
			System.out.println(countriesArray[i][0]+"|");
		}
		System.out.println("------------------------------------------------");
		//for each loop
		for(String[]country : countriesArray) {
			System.out.println(country[0]);
		}
		//get all the cities and add to cities[] array
		//declare cities array and size needs to match countries Array size
		String cities[] = new String[countriesArray.length];
			System.out.println(Arrays.deepToString(cities));
		for(int i = 0; i < countriesArray.length; i++) {
			cities[i] = countriesArray[i][1];
		}
		System.out.println(Arrays.toString(cities));
		
		//look for Bolivia in array and test if capital city is "la paz"
		for(int row = 0; row < countriesArray.length; row++) {
			if(countriesArray[row][0].equals("Bolivia")) {
				System.out.println(countriesArray[row][1]);
				if(countriesArray[row][1].equals("La Paz")) {
					System.out.print("Bolivia test passed");
				}else {
					System.out.print("Bolivia test failed");
				}
				break;
			}
		}
	}
}