//441102323 Saleh Alobaylan
import java.util.Locale;
import java.util.Scanner;
public class GameStore3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		int inventory = 0;
		String option;
		do {
		
		System.out.println("***********************************************************");
		System.out.println("*                 Welcome to Gaming Center :)             *");
		System.out.println("*                 ---------------------------             *");
		System.out.println("* Please enter one of the following options:              *");
		System.out.println("* 1) add ==> this allows you to add a game to inventory   *");
		System.out.println("* 2) sell ==> this allows you to sell games to a customer *");
		System.out.println("* 3) exit ==> to end this program                         *");
		System.out.println("*                                                         *");
		System.out.println("***********************************************************");
		
		System.out.print("Enter your option :> ");
		/*String*/ option = input.next();
		//int inventory = 0;
		switch (option) {
		
		case "add":
		case "ADD":
		case "Add":
			System.out.print("Please, enter game id (-1 to end): "); 
			int moregameID = input.nextInt();
			
			while (moregameID != -1) {
				
				//System.out.print("Please, enter the price of next game: ");
				//totalbef += input.nextDouble();
				inventory++;
				System.out.print("Please, enter game id (-1 to end): ");
				moregameID = input.nextInt();
			} break;
			
		case "sell":
		case "SELL":
		case "Sell":
			if (inventory == 0)
				System.out.println("Sorry. There are no more games in store :(");
			else {
				int id, count = 0;
				double total = 0; 
				do {
				     System.out.print("Please, enter game id (-1 to end): ");
				     
				id = input.nextInt(); 
				
				if (id != -1) {
				    count++; inventory--;				    
				    System.out.print("Please, enter the price of next game: ");
				    total += input.nextDouble(); }
				}
				while (id != -1 && inventory != 0);
				
				double discount = 0;
				
				if (count > 2) {
				discount = total * (20.0 / 100.0); 
				}
				
				System.out.println("Total price before discount: " + total + "SR");
				System.out.println("Your discount is: " + discount + "SR");
				System.out.println("Total price after discount: " + (total - discount) + "SR");
				} break;
			
			
			
			
		case "exit":
			System.out.print("Thanks. Goodbye!");
			break;
		
		
		
		
		}
		
		} while (!option.equals("exit"));
		  input.close();
		
		
		

		
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	}

}
