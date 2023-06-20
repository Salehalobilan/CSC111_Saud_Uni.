//441102323
//Saleh ALobaylan
import java.util.Locale;
import java.util.Scanner;
public class MinsToYearsDays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Enter the number of minutes: ");
		
		int min = input.nextInt();
		
		int day = min / (60 * 24);
		int Day = day % 365;
		
		int years = day / 365;
		
		System.out.print(min + " minutes is approximately " + years + " years" + " and " + Day + " days ");
		

	}

}
