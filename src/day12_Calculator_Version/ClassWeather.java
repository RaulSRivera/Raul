package day12_Calculator_Version;
import java.util.Scanner;
public class ClassWeather {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How is the weather?");
		String weather = scan.nextLine();
		switch (weather) {
		case "sunny":
			System.out.println("Go to park");
			break;
		case "hot":
			System.out.println("Go Swimming");
			System.out.println("Code Java");
			break;
		case "windy":
			System.out.println("Fly a kite");
			System.out.println("Code Java");
			break;
		case "rainy":
			System.out.println("Go shopping");
			System.out.println("Code Java");
			break;
		case "snow":
			System.out.println("Chain your tyres");
			System.out.println("Go skiing");
			System.out.println("Code Java");
			break;
		default:
			System.out.println("Code Java in any other weather");
		}
	}
}