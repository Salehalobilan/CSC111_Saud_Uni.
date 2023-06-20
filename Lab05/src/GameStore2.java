//441102323 Saleh Alobaylan
import java.util.Locale;
import java.util.Scanner;
public class GameStore2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		int count = 0;
		double totalbef = 0;
        System.out.println("Welcome to Gaming Center :)");
		
		System.out.print("Please, enter game id: ");
		int gameID = input.nextInt();
		
		while (gameID != -1) {
			
			System.out.print("Please, enter the price of next game: ");
			totalbef += input.nextDouble();
			count++;
			
			System.out.print("Please, enter game id: ");
			gameID = input.nextInt();
		}
		double disc = 0;
		if (count > 2) {
				 disc = totalbef * 0.20;
		}
		
			double totalafter = totalbef + disc;
			
			System.out.println("Total price before the discount: " + totalbef + "SR");
			System.out.println("Your discount is: " + disc + "SR");
			System.out.println("Total price after discount:" + totalafter + "SR");
		
			
		
		
		
		
		
		
		
		
		
		
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	}

}
