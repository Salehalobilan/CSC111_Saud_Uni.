//Saleh Alobaylan 441102323
import java.util.Scanner;
public class TestQuadraticEquation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		QuadraticEquation quad = new QuadraticEquation();
		
		System.out.print("Enter a, b, c: ");
		quad.a = input.nextDouble();
		quad.b = input.nextDouble();
		quad.c = input.nextDouble();
		
		double x = quad.calcDiscriminant();
		
		if(x > 0) {
		System.out.print("The roots are " + quad.calcRoot1() + " and " + quad.calcRoot2());}
		
		else if(x == 0){
		System.out.print("The root is "+quad.calcRoot2());}
		
		else
		System.out.print("The equation has no roots.");

	}

}
