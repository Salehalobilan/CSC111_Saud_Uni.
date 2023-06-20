//Saleh alobaylan 441102323
import java.util.Scanner;

public class Heart {
	
	public static void main(String[] args) {
			
			double HB ,Avrage = 0;
			double Num = 0;
			int a=0;
			int b=0;
			
			Scanner input = new Scanner(System.in);
			
			do {
			
			System.out.println("Please enter patient HB");
			HB = input.nextDouble();
			
			if (HB>120) {
				System.out.println("HB is High");
				a++;
				Avrage +=HB;
				Num++;}
			
			else if(HB >= 80 && HB <= 120) {
				System.out.println("HB is Normal");
				Avrage += HB;
				Num++;}
			
			else if(HB < 80) {
				System.out.println("HB is Low");
			b++;
			Avrage += HB;
			Num++;}
			
			} 
			while (a != 2 && b != 2);
			
			if(b!=2)
			System.out.print("HB is high twice in a row ");
			
			else if(a != 2)
				System.out.println("HB is Low twice in a row");
			
			System.out.println("The average HB is: " + (Avrage / Num));
		
		
		

	}
}
