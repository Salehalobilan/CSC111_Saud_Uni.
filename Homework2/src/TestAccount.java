import java.util.Locale;
import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		Account Account_1, Account_2, biggest;
		
		System.out.print("Enter the id, name, amount for the first Account: ");
		Account_1 = new Account(input.nextInt(), input.next(), input.nextDouble());
		System.out.print("Enter the deposit for the first Account: ");
		Account_1.deposit(input.nextDouble());
		System.out.println();
		
		System.out.print("Enter the id, name, amount for the second Account: ");
		Account_2 = new Account(input.nextInt(), input.next(), input.nextDouble());
		System.out.print("Enter the deposit for the second Account: ");
		Account_2.deposit(input.nextDouble());
		
		System.out.println("\n");
		
		System.out.print("Enter the withdraw of first amount: ");
		Account_1.withdrawl(input.nextDouble());
		
		System.out.print("Enter the withdraw of second amount: ");
		Account_2.withdrawl(input.nextDouble());
		
		System.out.println("\n --------------------------------------- \n");
		
		System.out.println(Account_1.compare1(Account_2));
	    biggest = Account_1.compare2(Account_2);
		biggest.display();
		
	}

}
