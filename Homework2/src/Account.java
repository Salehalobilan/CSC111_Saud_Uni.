import java.util.Locale;
import java.util.Scanner;

public class Account {

	private int acid;
	private String acname;
	private double balance;

	public Account(int id, String name, double bal) {
		acid = id;
		acname = name;
		balance = bal;
	}
	
	public double compare1(Account AC) {
		if(this.balance > AC.balance);
		return this.balance;

	}

	public Account compare2(Account AC) {        //SalehALobilan 441102323
		if (this .balance > AC.balance)
		      return this;
		return AC;
	}

	public void setBalance(double amt) {
		balance = amt;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double val) {

		balance += val;
	}

	public void withdrawl(double val) {

		if (val <= 5000 && val <= balance)
			balance -= val;

		else
			System.out.println("withdrawl not allowed");

	}

	public void display() {
		System.out.println("Account id is " + acid);
		System.out.println("Account name is " + acname);
		System.out.println("Account balance is " + balance);

	}
	
		
		

	

}
                                   //Saleh Alobilan