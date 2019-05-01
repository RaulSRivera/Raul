package day26_Arrays04;

import java.util.Arrays;
import java.util.Random;

public class PopularNames {
	public static void main(String[]args) {
		String[] names = {"James","Mary","John","Patricia","Robert","Jennifer","Michael","Linda","William","Elizabeth","David","Barbara","Richard","Susan","Joseph","Jessica","Thomas","Sarah","Charles","Margaret","Christopher","Karen","Daniel","Nancy","Matthew","Lisa","Anthony","Betty","Donald","Dorothy","Mark","Sandra","Paul","Ashley","Steven","Kimberly","Andrew","Donna","Kenneth","Emily","George","Carol","Joshua","Michelle","Kevin","Amanda","Brian","Melissa","Edward","Deborah","Ronald","Stephanie","Timothy","Rebecca","Jason","Laura","Jeffrey","Helen","Ryan","Sharon","Jacob","Cynthia","Gary","Kathleen","Nicholas","Amy","Eric","Shirley","Stephen","Angela","Jonathan","Anna","Larry","Ruth","Justin","Brenda","Scott","Pamela","Brandon","Nicole","Frank","Katherine","Benjamin","Samantha","Gregory","Christine","Raymond","Catherine","Samuel","Virginia","Patrick","Debra","Alexander","Rachel","Jack","Janet","Dennis","Emma","Jerry","Carolyn","Tyler","Maria","Aaron","Heather","Henry","Diane","Jose","Julie","Douglas","Joyce","Peter","Evelyn","Adam","Joan","Nathan","Victoria","Zachary","Kelly","Walter","Christina","Kyle","Lauren","Harold","Frances","Carl","Martha","Jeremy","Judith","Gerald","Cheryl","Keith","Megan","Roger","Andrea","Arthur","Olivia","Terry","Ann","Lawrence","Jean","Sean","Alice","Christian","Jacqueline","Ethan","Hannah","Austin","Doris","Joe","Kathryn","Albert","Gloria","Jesse","Teresa","Willie","Sara","Billy","Janice","Bryan","Marie","Bruce","Julia","Noah","Grace","Jordan","Judy","Dylan","Theresa","Ralph","Madison","Roy","Beverly","Alan","Denise","Wayne","Marilyn","Eugene","Amber","Juan","Danielle","Gabriel","Rose","Louis","Brittany","Russell","Diana","Randy","Abigail","Vincent","Natalie","Philip","Jane","Logan","Lori","Bobby","Alexis","Harry","Tiffany","Johnny","Kayla"};
		//print number of names in the array
		System.out.println("Total names: "+names.length);
		//print all names in single line //was previously listed as column
		System.out.println(Arrays.toString(names));
		//print in column format, 2 names each line
		for(int n = 0; n < names.length;n+=2) {
			System.out.println(names[n]+", "+names[n+1]);
		}
		//print all male names (0,2,4,6,8,10,12,14,...evens
		for(int mn = 0; mn <names.length;mn+=2) {
			System.out.print(names[mn]+", ");
		}
		//print all female names(1,3,5,7,9,...odds
		System.out.println("\nFemale names:");
		for(int fn = 0; fn < names.length; fn++) {
			if(fn % 2 !=0) {
				if(fn == names.length -1) {
					System.out.print(names[fn]+", ");
				}else {
					System.out.print(names[fn]+", ");
				}
			}
		}
		//print random name from array
		//use random class
		Random random = new Random();
		int r = random.nextInt(names.length);
		System.out.println("\nRandom name: "+names[r]);
		
		//print all names up to 4 chars in uppercase
		for (String name :  names) {
			if(name.length() <= 4) {
				System.out.print(name.toUpperCase() +", ");
			}	
		}
		System.out.println("\nOrganizing name lengths");
		String names3to4 = "";
		String names5to6 = "";
		String names7orMore = "";
		for(String name : names) {
			if(name.length() <= 4) {
				names3to4 += name + ", ";
				
			}else if(name.length() == 5 || name.length() == 6) {
				names5to6 += name + ", ";
			}else {
				names7orMore += name + ", ";
			}
		}
		System.out.print("Names 3 to 4 chars: "+names3to4);
		System.out.print("Names 5 to 6 chars: "+names5to6);
		System.out.print("Names 7 or more chars: "+names7orMore);
		
		System.out.println(Arrays.toString(names));
		//reverse order of arrays aka name[1] swap name[0]
		for(int i = 0; i < names.length; i+=2) {
			String temp = names[i];
			names[i] = names[i+1];
			names[i+1] = temp;
		}	
		System.out.println(Arrays.toString(names));
		String str1 = "first";
		String str2 = "second";
		String temp = str1;
		str1+=str2;
		str2 = temp;
		}
}