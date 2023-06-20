//441102323 Saleh Alobaylan
import java.util.Locale;
import java.util.Scanner;
public class Pyramid {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);

		int num;
		System.out.print("Enter the number of lines: ");
		int lines = input.nextInt();
		for (int i=1; i<=lines; i++) {
			
			
		    for(num =0; num<=(lines-i); num++) {
		    	
		        if ( num == (lines-i)) {
		            System.out.print(" ");
		        
		        }
		        else {
		            System.out.print("  ");
		        
		            }
		        }
		    
		    for ( num=i ; num>=1 ; num--) {
		        if(i==1) {
		        	
		            System.out.print(num);
		            }
		        else {
		        	
		            System.out.print(num+ " ");
		            }
		        }
		    for( num=2; num<i+1; num++) {
		        if (num==i) {
		        	
		            System.out.print(num);
		        }
		        
		        else {
		            System.out.print(num+ " ");
		            }
		        }
		    System.out.println();
		    }
		
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	}

}
