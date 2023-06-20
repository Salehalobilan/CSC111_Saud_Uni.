//441102323
//Saleh Alobaylan
import java.util.Scanner;
import java.util.Locale;
public class UnspecifiedNumbers {

	public static void main(String[] args) {
		int pos = 0, neg = 0, total= 0, count= 0;
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Enter integers ending with 0: ");
		int num = input.nextInt();
		if(num != 0) {
		while(num != 0) {
			
			if (num > 0) 
				pos++;
			else
				neg++;
			
			
		    total += num;
		    count++;
		    
		    num = input.nextInt();
		}
		
		double avrg = (double)total / count;
		System.out.println("The number of positives is " + pos);
		System.out.println("The number of negatives is " + neg);
		System.out.println("The total is " + total);
		System.out.println("The average is " + avrg);
		}
		else
			System.out.print("no numbers are entered except 0");
	}

}
