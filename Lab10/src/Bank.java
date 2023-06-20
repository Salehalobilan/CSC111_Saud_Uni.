import java.util.Locale;
public class Bank {
	
//	- balance1 : double 
	private double balance1;
//	- balance2 : double
	private double balance2;
//	- balance3 : double
	private double balance3;
	
	public final int MAX_ACCOUNT = 3;
	public final int MIN_ACCOUNT = 1;
//	+ Bank()
	public Bank() {
		double balance1 = 0;
		double balance2 = 0;
		double balance3 = 0;	
	}
	
//	+ deposit(account: int, amount: double): boolean 
	public boolean deposit(int account, double amount) {
//		if (account < 1 || account >3)
//			return false;
		switch(account) {
		case 1: balance1 += amount;break;
		case 2: balance2 += amount;break;
		case 3: balance3 += amount;break;
		default: return false;
		}
		return true;
	}
		
//	+ withdraw(account: int, amount: double): boolean
	public boolean withdraw(int account, double amount) {
		if (account == 1 && balance1 >= amount) {
			balance1 -= amount;
			return true;
		} else if (account == 3 && balance3 >= amount) {
			balance3 -= amount;
			return true;
		} else if (account == 2 && balance2 >= amount) {
			balance2 -= amount;
			return true;
		}else return false;
		
                         //		switch(account) {
                         //		case 1: balance1 += amount;break;
                         //		case 2: balance2 += amount;break;
                         //		case 3: balance3 += amount;break;
                         //		default: return false;}
	}
	
	
//	+ transfer(accountFrom: int, accountTo: int, amount: double): boolean
	public boolean transfer(int accountFrom, int accountTo, double amount) {
	if (accountFrom >=0 && accountFrom <=3) {
		if (accountTo>=0 && accountTo <=3) {
			if (withdraw(accountFrom, accountTo)) {
				return deposit(accountTo, amount);
			} else return false;
		} else return false;
	} else return false;
		
	}
//	+ transferToBank(accFrom: int, toBank: Bank, accTo: int, amount: double): boolean 
	public boolean transferToBank(int accFrom, Bank toBank, int accTo, double amount) {
		if (toBank == null)
			return false;
		if (accFrom >=MIN_ACCOUNT && accFrom <=MAX_ACCOUNT) {
			if (accTo>=toBank.MIN_ACCOUNT && accTo <=toBank.MAX_ACCOUNT) {
				if (withdraw(accFrom, accTo)) {
					return toBank.deposit(accTo, amount);
				} else return false;
			} else return false;
		} else return false;
	}
//	+ display(): void	
	public void display() {
		System.out.println("Account1: " + balance1 +"SR");
		System.out.println("Account2: " + balance2 +"SR");
		System.out.println("Account3: " + balance3 +"SR");
	}
}
