package day13_ternary_strings_intro;
import java.util.Scanner;
public class CarSelector {
	public static void main(String[] args) {
		//american: ford, dodge, tesla, chevrolet, lincoln Average $30000
		//japanese: toyota, mitsubisi, honda, subara, mazda Average$32000
		//german: bmv, vm, Audi, mercedes, porsche Average$55000
		//Italian: alfa romeo, ferrari, lanborghini, fiat Average $85000
		//korean: kia, hyundai, daewoo Average$25000
		Scanner scan = new Scanner(System.in);
		System.out.println("Which type of car are you interested in?");
		System.out.println("1) American / 2) Japanese / 3) German / 4) Italian / 5) Korean");
		int carType = scan.nextInt();
		double averagePrice = 0.0;
		String carOptions = "";
		String carOrigin = "";
		switch (carType) {
		case 1:
			averagePrice = 30000.0;
			carOptions = "Ford, Dodge, Tesla, Chevrolet, Lincoln";
			carOrigin = "American";
			break;
		case 2:
			averagePrice = 32000.0;
			carOptions = "Toyota, Mitsubisi, Honda, Subara, Mazda";
			carOrigin = "Japanese";
			break;
		case 3:
			averagePrice = 55000.0;
			carOptions = "BMV, VM, Audi, Mercedes, Porsche";
			carOrigin = "German";
			break;
		case 4:
			averagePrice = 85000.0;
			carOptions = "Alfa romeo, Ferrari, Lanborghini, Fiat";
			carOrigin = "Italian";
			break;
		case 5:
			averagePrice = 25000.0;
			carOptions = "Kia, Hyundai, Daewoo";
			carOrigin = "Korean";
			break;
		default:
			System.out.println("Car type not available");
			return;
		
		}
		System.out.println("You selected " +carOrigin+ " car and your options are " +carOptions);
		System.out.println("Average Price: "+averagePrice);
	}
}
