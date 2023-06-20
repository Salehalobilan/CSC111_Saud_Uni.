//Saleh ALobilan 441102323
import java.util.Scanner;
import java.util.Locale;
public class TestBook {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		Book b1 = new Book();
		
		System.out.println("Please, enter the book details #ISBN, author, title, and genre.");
		b1.ISBN = input.nextInt();
		b1.author = input.next();
		b1.title = input.next();
		b1.genre = input.next();
		
		boolean X = b1.verifyISBN(b1.ISBN);
		
		if (X) {
		    System.out.println(b1.toString());
		    System.out.println("The book reference is :" + b1.generateReference());
		}
		else
		    System.out.println("Invalid ISBN");
	}

}
