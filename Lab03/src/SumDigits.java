import java.util.Locale;
import java.util.Scanner;
public class SumDigits {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US); 
		System.out.print("Enter an integer between 0 and 1000: ");
		int val = input.nextInt();
		int sumafter = val % 10;
		int sumbefore = val / 10;
		int summid = sumbefore % 10;
		int sumfirst = sumbefore / 10;
		System.out.println("The sum of all digits in " + val + " is " + (sumafter + summid + sumfirst));
		
		
		
		
		
		

	}

}
