import java.util.Scanner;
public class gamestore3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); int inventory = 0;
		String op; do {
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
            op = in.next();
		switch (op) {
		case "add" : 
		    System.out.print("Please, enter game id (-1 to end): ");
		    int newId = in.nextInt();
		    while (newId != -1) { inventory++;
		          System.out.print("Please, enter game id (-1 to + end): ");
		          newId = in.nextInt(); }
		   break; 
		   case "sell" :
			
		        if (inventory == 0)
		System.out.println("Sorry. There are no more games"
		+ " in store :(");
		else {
		int id, count = 0; double total = 0; do {
		System.out.print("Please, enter game id ("
		+ "-1 to end): ");
		id = in.nextInt(); if (id != -1) {
		count++; inventory--;
		System.out.print("Please, enter the" + " price of next game: ");
		total += in.nextDouble(); }
		} while (id != -1 && inventory != 0); double discount = 0;
		if (count > 2) {
		discount = total * (20.0 / 100.0); }
		System.out.println("Total price before discount: "
		+ total + "SR");
		System.out.println("Your discount is: " + discount
		+ "SR");
		System.out.println("Total price after discount: "
		+ (total - discount) + "SR");
		} break;
		case "exit":
		System.out.println("Thanks. Goodbye!"); break;
		}
		} 
		while (!op.equals("exit")); in.close();
		

     }

}
