//441102323 Saleh Alobaylan
import java.util.Locale;
import java.util.Scanner;
public class Divisible {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		if (number % 5 == 0 && number % 6 == 0 )
			System.out.print("Is 10 divisible by 5 and 6? true");
		else 
			System.out.println("Is 10 divisible by 5 and 6? false");
		if (number % 5 == 0 || number % 6 == 0)
			System.out.println("Is 10 divisible by 5 or 6? true");
		else 
			System.out.println("Is 10 divisible by 5 or 6? false");
		
		if (number % 5 == 0 | number % 6 == 0 ) {
			if (number % 6 == 0 | number % 5 == 0 )
				System.out.println("Is 10 divisible by 5 or 6, but not both? true");}
		else if (number % 6 == 0 | number % 5 == 0) {
				if (number % 5 == 0 | number % 6 == 0)
					System.out.println("Is 10 divisible by 5 or 6, but not both? true");
				else 
					System.out.println("Is 10 divisible by 5 or 6, but not both? false");}
		else 
			System.out.println("Is 10 divisible by 5 or 6, but not both? false");
			
		
		
		
		//maybe there are some extra or useless statements but i tried it and it's working :)
		
		
		
		
		
		
		
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	}

}
