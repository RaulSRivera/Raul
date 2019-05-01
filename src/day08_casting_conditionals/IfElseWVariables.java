package day08_casting_conditionals;

public class IfElseWVariables {
	public static void main(String[] args) {
		int temperature = 45;
		if(temperature >= 69) {
			System.out.println("It is a nice day!");
		}else {
			System.out.println("Stay at home");
		}
		
		//2 int variables, teamAScore, teamBScore
		//put a condition. check if teamA won. 
			//"team a won". Go to team a.
		//else "team b won or it was a draw"
			//go teams
		int teamAScore = 2;
		int teamBScore = 3;
		if (teamAScore > teamBScore) {
			
			System.out.println("Team A won!");
			System.out.println("Go team A!");
		}else {
			System.out.println("Team B won or it was a draw");
			System.out.println("Go teams!");
		}
		}
	

}
