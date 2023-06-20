//441102323 Saleh Alobaylan
import java.util.Locale;
import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
			
			System.out.print(" Please enter two integer numbers n1, n2: ");
			
			int n1 = input.nextInt();
			int n2 = input.nextInt();
			
			int val = 0 ;
			do{
					
			    if ((n1%5)== 0) {
			        val++ ;
			        if (val == 10)
			        System.out.print(n1);
			        else
			        System.out.print(n1 + ",");
			      }
			    
			    else if ((n1%6) == 0) {
			        val++;
			        if (val == 10)
			            System.out.print(n1);
			        else
			            System.out.print(n1 + ",");
			      }
			    n1++;
			 }

			 while ((val != 10) && (n1<=n2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	}

}
