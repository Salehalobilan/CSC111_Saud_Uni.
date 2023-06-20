import java.util.Scanner;
import java.util.Locale;
public class TestBank {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);  
		Bank b1 = new Bank();
		Bank b2 = new Bank();

		int option = 0;
		
		do {
		System.out.println("1.  Deposit.");
		System.out.println("2.  Withdraw.");
		System.out.println("3.  Transfer.");
		System.out.println("4.  Transfer to another bank.");
		System.out.println("5.  Display all balances.");
		System.out.println("6.  Exit.");
		System.out.println("==>");
		
		option = input.nextInt();
		
		switch (option) {
		case 1: depsit(b1, input);   break;
		case 2: withdraw(b1, input); break;
		case 3: transfer(b1, input); break;
		case 4:transferToBank(b1, b2, input);break;
		case 5:
			System.out.println("      Bank b1");
			b1.display();
			System.out.println("_______________________");
			System.out.println("      Bank b2");
		    b2.display();
		break;
		case 6:System.out.println("Goodbye! :)"); break;
		default:
			System.out.println("Invalid");
		}
		
		}
		
		while (option != 6);
		
	}
	private static void depsit(Bank b1, Scanner input) {
		System.out.print("Enter the account number and the amount: ");
	int account = input.nextInt();
	double amount = input.nextDouble();
	
	if(b1.deposit(account, amount))
		System.out.println("DONE");
	else
		System.out.println("ERROR");} 
	
	
	
	private static void withdraw(Bank b1, Scanner input) {
		System.out.print("Enter the account number and the amount: ");
	int account = input.nextInt();
	double amount = input.nextDouble();
	
	if(b1.withdraw(account, amount))
		System.out.println("DONE");
	else
		System.out.println("ERROR");}
	
	private static void transfer(Bank b1, Scanner input) {
		System.out.print("Enter the source account, distenation account, and the amount: ");
	int accountF = input.nextInt();
	int accountT = input.nextInt();
	double amount = input.nextDouble();
	
	if(b1.transfer(accountF, accountT, amount))
		System.out.println("DONE");
	else
		System.out.println("ERROR");}
	
	private static void transferToBank(Bank b1,Bank b2, Scanner input) {
		System.out.print("Enter the source account, distenation account, and the amount: ");
	int accountF = input.nextInt();
	int accountT = input.nextInt();
	double amount = input.nextDouble();
	
	if(b1.transferToBank(accountF, b2, accountT, amount))
		System.out.println("DONE");
	else
		System.out.println("ERROR");}

}
