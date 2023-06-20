//441102323
//Saleh Alobaylan
import java.util.Locale;
import java.util.Scanner;
public class QuadEquation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double r1 = (-b + Math.pow(discriminant, 0.5)) / (2*a);
        double r2 = (-b - Math.pow(discriminant, 0.5)) / (2*a);
		if ( discriminant > 0) {
			System.out.print("The equation has two roots " + r1 + " and " + r2);
		}
		
		else if (discriminant == 0) {
			System.out.print("The equation has one root " + r1);
		}
		
		else {
			System.out.print("The equation has no real roots");
		}		
		
		
		
		
		
		
	}

}
