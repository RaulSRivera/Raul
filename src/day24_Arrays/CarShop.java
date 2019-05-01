package day24_Arrays;

import java.util.Arrays;

public class CarShop {
	public static void main(String[]args) {
		String[] cars = {"BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla"};
		String[] cars2 = new String[8];
		for(String c : cars) {
			if(!c.startsWith("M")) {
				continue;
			}
				System.out.println(c);
			
			}
		for (String end: cars) {
			if (end.endsWith("a")) {
				System.out.println(end);
			}
			for(String car: cars) {
				if(car.length()>=6) {
				
				System.out.println(car+", ");
				}
			}
		}
		String carSwap = cars [cars.length-1];
		cars[cars.length-1]=cars[0];
		cars[0]= carSwap;
		System.out.println(Arrays.deepToString(cars));
	}
}