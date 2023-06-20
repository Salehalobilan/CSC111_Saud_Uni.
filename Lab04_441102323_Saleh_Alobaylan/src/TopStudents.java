//441102323
//Saleh Alobaylan
import java.util.Locale;
import java.util.Scanner;
public class TopStudents {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Enter the number of students: ");
		
		int NOS = input.nextInt();
		
		if (NOS >= 2) {
			
			String student1 = "", student2 = "";
			double score1 = -1, score2 = -1;
			
			for(int i = 0; i < NOS; i += 1) {
				
				System.out.print("Enter a student name: ");
				String student = input.next();
				System.out.print("Enter a student score: ");
				double score = input.nextDouble();
				
				if( score1 < score) {
					score2 =score1;
					student2 = student1;
					
					score1 =score;
					student1 = student;
					
				}
				else if (score2 < score) {
					
					score2 =score;
					student2 = student;
					
				}
			}
			
			System.out.println("Top two students:");
			System.out.println(student1 + "'s score is " + score1);
			System.out.println(student2 + "'s score is " + score2);
			
			
		}
		else System.out.print("Need at least two students");
		
		
		
		
		
		
		
		
		
		

	}

}
