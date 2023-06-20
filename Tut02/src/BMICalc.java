import java.util.Scanner;
public class BMICalc {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double weight,height,BMI;
		System.out.print("Enter your weight: ");
		weight = kb.nextDouble();
		System.out.print("Enter your height: ");
		height = kb.nextDouble();
		BMI = height / (weight * weight);
		System.out.print("Your BMI is: " + BMI);

	}

}
