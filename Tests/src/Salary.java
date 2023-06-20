import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		Scanner Salary =new Scanner(System.in);
		 
		System.out.print("Enter the Salary ");
		double salary = Salary.nextDouble();
		
		System.out.print("Enter the performance ");
		int performance = Salary.nextInt();
		
		if (performance >= 90) {
			salary = salary + salary * 0.03;
			
		}
		System.out.println("The Salary is: " + salary);

	}

}
