//441102323
//Saleh ALobaylan
import java.util.Locale;
import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		int weight,height,BMI;
		System.out.print("Enter your weight in pounds: ");
		weight = input.nextInt();
		
		System.out.print("Enter your height in inches: ");
		height = input.nextInt();
		
		BMI = (weight) / (height*2); 
		System.out.print("Your BMI is " + BMI);
		
		

	}

}
