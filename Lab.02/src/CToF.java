// Name: Saleh Alobaylan
// ID:   441102323


import java.util.Scanner;

public class CToF {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double celsius, fahrenheit;
		
				
		System.out.print("Enter a temperature in Celsius: ");
		
		celsius = input.nextDouble();
		
	    fahrenheit = 1.8 * celsius + 32;
				
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");

	}

}