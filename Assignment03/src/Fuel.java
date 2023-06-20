import java.util.Locale;
import java.util.Scanner;
public class Fuel {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Enter the driving distance: ");
		double distance = inp.nextDouble();
		
		System.out.print("Enter kilos per liter: ");
		double capacity = inp.nextDouble();
		
		System.out.print("Enter price per liter: ");
		double cost = inp.nextDouble();
		
		
		double total = (cost * distance) / capacity;
		
		System.out.println("The cost of driving is $" + total);
		
		
/////////////////////////////////////////////////////////////////////////////////////////////////////
	}

}
