//441102323
//Saleh Alobaylan
import java.util.Locale;
import java.util.Scanner;
public class WindChill {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Enter the temperature in Fahrenheit: ");
		double temp = input.nextDouble();
	
		
		
		
	
		{if (temp >= -58 && temp <=41) {
			
			System.out.print("Enter the wind speed miles per hour: ");
			double speed = input.nextDouble();
			{if (speed >= 2) {
				
				double windChill = 35.74 + 0.6215*temp - 35.75*Math.pow(speed, 0.16) + 0.4275*temp*Math.pow(speed, 0.16);
				System.out.println("The wind chill index is: " + windChill);}
			else
					System.out.print("Speed must be greater than or equal to 2");
			
			}
		
		}	
		else System.out.print("Temperature must be between -58F and 41F");
		}
			
			
		}
		

	}


