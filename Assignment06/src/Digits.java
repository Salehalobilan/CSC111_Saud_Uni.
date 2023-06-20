//441102323 Saleh Alobaylan
import java.util.Locale;
import java.util.Scanner;
public class Digits {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		int number;
		int sum ;
		int dig = 1;
		
		System.out.print("Enter a number ( -1 to end): ");
		
		sum= input.nextInt();
		while (sum != -1) {
		    while ( sum > 0) {
		  
		        number= sum%10;
		        System.out.println("Digit" + dig++ + " = " + number);
		        sum = sum/10;
		       }
		
		    System.out.print("Enter a number: ");
		    dig = 1 ;
		    sum = input.nextInt();
		 }

		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	}

}
