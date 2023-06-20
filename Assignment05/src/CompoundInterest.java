//441102323 Saleh Alobaylan
import java.util.Locale;
import java.util.Scanner;
public class CompoundInterest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		
		int d = 0;
		double z = 0 ;
	
		 System.out.print("Enter the amount to be saved for each month: " );
		 double m = input.nextDouble();

		 System.out.print("Enter the annual interest rate: ");
		 double r = input.nextDouble();

		 System.out.print("Enter the number of months: " );
		 double num = input.nextDouble();
		 double b1 = r/100 ;

		 do {

		 z = (z+m) * (1+(b1/12.0));

		 d++;
		 } 
		 while (d!=num);
		 System.out.print("After the " +(int)num+"th month, the account value is " + z );
		
		
		
		
		
		
		
		
		
		
		
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	}

}
