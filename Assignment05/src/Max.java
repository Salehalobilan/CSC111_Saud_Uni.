//441102323 Saleh Alobaylan
import java.util.Locale;
import java.util.Scanner;
public class Max {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		String name , top = "a";
		
		double score1 = 0, score =0 ;
		
		System.out.print("Enter the number of students: ");
		int x = input.nextInt();
		int y = x-x ;
		while (x > y) {
			
		    System.out.print("Enter a studint name : ");
		    name = input.next();
		    
		    System.out.print("Enter a studint score : ");
		    score1 = input.nextDouble();
		    
		    if (score1 > score) {
		    	
		        score = score1 ;
		        top = name ;
		    }
		
		y++;
		}
		 System.out.print("Top student " + top + "'s score is " + (score));

		
		
		
		
		
		
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
	}

}
