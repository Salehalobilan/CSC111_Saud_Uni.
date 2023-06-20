//441102323 Saleh Alobaylan
import java.util.Locale;
import java.util.Scanner;
public class GameStore1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Welcome to Gaming Center :)");
		
		System.out.print("Please, enter game id: ");
		int gameID = input.nextInt();
		
		System.out.print("Please, enter the price of a game: ");
		double cost = input.nextDouble();
		
		System.out.print("Please, enter the number of games: ");
		int ngame = input.nextInt();
		
		if ( ngame >= 1) {
			
			if (ngame > 2) {
				double total = (cost * ngame) * 0.80;
				System.out.print("Total price for game " + gameID + " is: " + total + "SR");
			}
			else {
			double total;
			total= cost * ngame;
			System.out.print("Total price for game " + gameID + " is: " + total + "SR");}
			
			
		}
		else System.out.println("Error");
		
		
		

	}

}
