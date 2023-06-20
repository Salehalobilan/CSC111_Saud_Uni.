// Name: Saleh Alobaylan
// ID:   441102323


import java.util.Scanner;

public class Tips {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		double subtotal, gratuity, total, gratuity1;
		
				
		System.out.print("Enter subtotal and gratuity rate: ");
		
		subtotal = input.nextDouble();
		gratuity = input.nextDouble();
		
		gratuity1 = subtotal * gratuity / 100;
		 total    = subtotal + gratuity1;
				
		System.out.println("The gratuity is: $" + gratuity1 + ", total is: $" + total);

	}

}
