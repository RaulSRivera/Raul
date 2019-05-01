package day25_Arrays03;

public class Shopping {
	public static void main(String[]args) {
		String [] products = {"Shoes","Shirt","Watch","Socks","Sunglasses"};
		double[] prices = {120.0, 5.99, 150.50, 3000.5, 6.99};
		int[]itemsID = {12345, 12346, 12347,12348,12349};
		//print count of products:
		System.out.println("Products count: "+products.length);
		//check if products, prices and itemsID have same count
		if (products.length == prices.length && products.length == itemsID.length) {
			System.out.println("Shopping list is good");
		}else {
			System.out.println("Something is wrong");
			return;
		}
		//loop through products and print each in different line
		for(String prod : products) {
			System.out.println(prod);
		}
		//prices --> for loop
		for(int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}
		//itemsID --> print this in REVERSE order using a loop
		System.out.println(itemsID[ itemsID.length -1]);
		for (int idx = itemsID.length -1; idx >= 0; idx--) {
			System.out.println(itemsID[idx]);
		}
		//print a report, with total price
		//item1: 12345 - Shoes - $120.0
		//....
		//Total Price:
		System.out.println("********* Your damn Receipt*************");
		double totalPrice = 0.0;
		for(int idx = 0; idx < products.length;idx++) {
			System.out.println("Item "+(idx+1)+" : "+itemsID[idx]+" - " +products[idx]+ " - $ "+prices[idx]);
			totalPrice += prices[idx];
		}
		System.out.println("Total Price: $" +totalPrice);
		//find the most expensive item in list and print as report
		int maxIndex = 0;
		double maxPrice =0.0; 
		for(int j = 0; j < prices.length; j++) {
			if(prices[j] > maxPrice) {
				maxPrice = prices[j];
				maxIndex = j;
			}
		}
		System.out.println(itemsID[maxIndex]+" - "+products[maxIndex]+" - $"+maxPrice);
	}

}
