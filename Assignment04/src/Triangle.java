//441102323 Saleh Alobaylan
import java.util.Locale;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Enter three edges (length in double): ");
		double edge1 = input.nextDouble();
		double edge2 = input.nextDouble();
		double edge3 = input.nextDouble();
		
		if ( (edge1 + edge2) > edge3 && (edge2 + edge3) > edge1 && (edge1 + edge3) > edge2)
			System.out.print("The perimeter is " + (edge1 + edge2 + edge3));
		else 
			System.out.print("Input is invalid");
		
		
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	}

}
