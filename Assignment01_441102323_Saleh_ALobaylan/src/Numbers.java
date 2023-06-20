//441102323
//Saleh ALobaylan
import java.util.Locale;
import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);

		System.out.print("Enter three numbers: ");
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int sum = a + b + c;
		int mult = a * b *c;
		double avr = (sum)/3.0;
		double pow = Math.pow(a, b);
		
		System.out.println("Sum = " + sum);		
		System.out.println("Mult = " + mult);
		System.out.println("Avr = " + avr);
		System.out.println("Pow = " + pow);
		
		
		
		
		
		
		
		
	}

}
