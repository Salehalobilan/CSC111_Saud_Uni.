//441102323 Saleh Alobaylan
import java.util.Locale;
import java.util.Scanner;
public class GameStore4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String progress = null;
		System.out.println("Welcome to Gaming Center :).");
		do {
			
		    System.out.print("Please, enter the type of the game : ");
		     char type = input.next().charAt(0);
		     if (type != 'g' && type != 'n') {
		    	 System.out.println("Incorrect type");
		    	 }
		     else {
		    	 System.out.print("Please, enter the price of a game: ");
		         double price = input.nextDouble();
		         System.out.print("Please, enter number of copies: ");
		         int number = input.nextInt();
		         if (number < 1) {
		        	 System.out.println("Error"); }
		         else {
		        	 double total = 0;
		        	 switch (type) { 
		        	 
		        	 case 'g':
		        		 
		        		 total = price * 1.4 * number;
		        		 
		        		 if (number > 2) {
		        			 
		        			 total -= price * 1.4;
		                     total *= (1 - 20.0 / 100);
		                     total += price * 1.4; } 
		        		 System.out.println("Total price is: " + total);
		        		 break;
		                
		             case 'n':
		            	
		            	total = price * number;
		            	
		            	if (number > 3) {
		            		
		                total -= price * 2;
		                total *= (1 - 10.0 / 100);
		                total += price * 2; } 
		            	System.out.println("Total price is: " + total);
		            	break; 
		                
		             default: 
		            	 System.out.print("Error");
		           }
		        	 
		         System.out.println("Total price is: " + total); }
		         
		}
		     
		System.out.print("Do you want to continue? yes or no: ");
		progress = input.next();
		
		} while (progress.equals("yes"));
		System.out.println("Goodbye");
		
		
		
		
		
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	}

}
